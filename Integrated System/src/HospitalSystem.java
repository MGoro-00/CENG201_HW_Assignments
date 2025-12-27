import java.util.HashMap;
public class HospitalSystem{
    PatientList patientList = new PatientList();
    DischargeStack dischargeStack = new DischargeStack();
    TreatmentQueue normalQueue = new TreatmentQueue();
    TreatmentQueue priorityQueue = new TreatmentQueue();
    HashMap<Integer, Patient> patientMap = new HashMap<>();
    public void newPatient(Patient patient,Boolean priority) {
        patientList.addPatient(patient);
        patientMap.put(patient.getId(),patient);
        TreatmentRequest request = new TreatmentRequest(patient.getId(),priority);
        if (priority) {priorityQueue.enqueue(request);}
        else {normalQueue.enqueue(request);}
        IO.println("Patient " + patient.getId() + " Priority: " + priority+" added.");
    }
    public void processTreatment(){
        TreatmentRequest request=null;
        if (!priorityQueue.isEmpty()){request = priorityQueue.dequeue();}
        else if (!normalQueue.isEmpty()){request = normalQueue.dequeue();}
        if (request != null){
            DischargeRecord discharge=new DischargeRecord(request.patientId);
            dischargeStack.push(discharge);
            patientList.removePatient(request.patientId);
            patientMap.remove(request.patientId);
            IO.println("Processed and discharged Patient ID: " +request.patientId);
        }
        else {IO.println("Thera er no patients to treat.");}
    }
    public Patient searchPatient(int id){return patientMap.get(id);}
    public void systemState(){
        IO.println("    Patient List    ");
        patientList.printList();
        IO.println("    Normal Queue    ");
        normalQueue.printQueue();
        IO.println("    Priority Queue    ");
        priorityQueue.printQueue();
        IO.println("    Discharge Records    ");
        dischargeStack.printStack();
        IO.println("                                ");
    }
    public void sortSeverity(){patientList.bubbleSortBySeverity();}
    public void addDischargeRecord(Patient patient){
        DischargeRecord record = new DischargeRecord(patient.getId());
        dischargeStack.push(record);
        IO.println("Discharge Record added for Patient ID: "+patient.getId());
    }
}
