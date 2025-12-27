void main() {
    HospitalSystem hospital = new HospitalSystem();
    hospital.newPatient(new Patient("Patient1",3,25),false);
    hospital.newPatient(new Patient("Patient2",2,30),false);
    hospital.newPatient(new Patient("Patient3",4,45),false);
    hospital.newPatient(new Patient("Patient4",1,22),false);
    hospital.newPatient(new Patient("Patient5",3,29),false);
    hospital.newPatient(new Patient("Patient6",2,28),false);
    hospital.newPatient(new Patient("Patient7",4,35),false);
    hospital.newPatient(new Patient("Patient8",10,40),true);
    hospital.newPatient(new Patient("Patient9",8,50),true);
    hospital.newPatient(new Patient("Patient10",9,55),true);
    IO.println("Adding Manual Discharge Records :");
    hospital.addDischargeRecord(new Patient("Patient11",2,19));
    hospital.addDischargeRecord(new Patient("Patient12",1,21));
    IO.println("Processing 4 Requests (Priority First) :");
    hospital.processTreatment();
    hospital.processTreatment();
    hospital.processTreatment();
    hospital.processTreatment();
    IO.println();
    IO.println("System State Before Sorting :");
    hospital.systemState();
    hospital.sortSeverity();
    IO.println();
    IO.println("Final System State After Sorting :");
    hospital.systemState();
}

