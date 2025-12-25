import java.util.HashMap;
public class HospitalSystem{
    PatientList patientList = new PatientList();
    DischargeStack dischargeStack = new DischargeStack();
    TreatmentQueue normalQueue = new TreatmentQueue();
    TreatmentQueue priorityQueue = new TreatmentQueue();
    HashMap<Integer, Patient> patientMap = new HashMap<>();
    public void newPatient(Patient newPatient, Boolean isPriority) {
        patientList.addPatient(newPatient);
        patientMap.put(newPatient.getId(), newPatient);
        TreatmentRequest request = new TreatmentRequest(newPatient.getId(), isPriority);
        if (isPriority) {priorityQueue.enqueue(request);}
        else {normalQueue.enqueue(request);}
        IO.println("Patient " + newPatient.getId() + " added. Priority: " + isPriority);
    }
    public void processTreatment(){
        TreatmentRequest requestToProcess = null;
        if (!priorityQueue.isEmpty()) {requestToProcess = priorityQueue.dequeue();}
        else if (!normalQueue.isEmpty()) {requestToProcess = normalQueue.dequeue();}
        if (requestToProcess != null) {
            DischargeRecord discharge = new DischargeRecord(requestToProcess.patientId);
            dischargeStack.push(discharge);
            patientList.removePatient(requestToProcess.patientId);
            patientMap.remove(requestToProcess.patientId);
            IO.println("Processed & Discharged Patient ID: " + requestToProcess.patientId);
        }
        else {IO.println("No patients to treat.");}
    }
    public Patient searchPatient(int id){return patientMap.get(id);}
    public void systemState(){
        IO.println("    Current Patient List    ");
        patientList.printList();
        IO.println("    Waiting Queue (Normal)    ");
        normalQueue.printQueue();
        IO.println("    Waiting Queue (Priority)    ");
        priorityQueue.printQueue();
        IO.println("    Discharge Record (Stack)    ");
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
