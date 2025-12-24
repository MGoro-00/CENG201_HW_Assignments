public class HospitalSystem{
    PatientList patientList = new PatientList();
    DischargeStack dischargeStack = new DischargeStack();
    TreatmentQueue treatmentQueue = new TreatmentQueue(100);
    TreatmentQueue priorityQueue=new TreatmentQueue(20);
    public void newPatient(Patient newPatient,Boolean priority) {
        patientList.addPatient(newPatient);
        if (!priority) {treatment(newPatient);}
        else {priorityTreatment(newPatient);}
    }
    public void removePatient(Patient patient){patientList.removePatient(patient.id);}
    public void patient(int id){patientList.findPatient(id);}
    public void discharge(Patient patient) {
        DischargeRecord newDischargeRecord = new DischargeRecord(patient.getId());
        dischargeStack.push(newDischargeRecord);
        TreatmentRequest temp=priorityQueue.dequeue();
        if (temp==null){treatmentQueue.dequeue();}
        patientList.removePatient(patient.getId());
        IO.println("Patient "+patient.getId()+" has treated and discharged");
    }
    public void treatment(Patient patient){
        TreatmentRequest newTreatment=new TreatmentRequest(patient.getId());
        if (treatmentQueue.isFull()) {IO.println("Treatment Queue exceeds 100 please try again later");return;}
            treatmentQueue.enqueue(newTreatment);
    }
    public void priorityTreatment(Patient patient){
        TreatmentRequest newTreatment=new TreatmentRequest(patient.getId());
        if (priorityQueue.isFull()) {treatment(patient);IO.println("Because of priority queue is full patient added to normal queue");}
        else {
            priorityQueue.enqueue(newTreatment);
        }
    }
    public void systemState(){
        IO.println("Current Patient List:");
        IO.println();
        patientList.printList();
        IO.println();
        IO.println();
        IO.println("Discharge Record:");
        IO.println();
        dischargeStack.printStack();
    }
}