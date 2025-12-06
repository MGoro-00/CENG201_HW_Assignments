void main(){
    PatientList testList= new PatientList();
    Patient p1= new Patient("Patient1",1,19);
    Patient p2= new Patient("Patient2",9,63);
    Patient p3= new Patient("Patient3",5,33);
    Patient p4= new Patient("Patient4",3,25);
    Patient p5= new Patient("Patient5",7,59);
    testList.addPatient(p1);
    testList.addPatient(p2);
    testList.addPatient(p3);
    testList.addPatient(p4);
    testList.addPatient(p5);
    testList.printList();
    testList.removePatient(3);
    testList.printList();
    IO.println(testList.findPatient(1));
    testList.printList();
}
