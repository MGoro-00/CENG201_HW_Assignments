public class PatientList {
    Node head;
    //Adding Patients to the PatientList O(n) Complexity
    public void addPatient(Patient newPatient){
        if (head==null){head=new Node(newPatient);}
        else {
            Node temp = new Node(newPatient);
            Node curr = head;
            while (curr.next != null) {curr = curr.next;}
            curr.setNext(temp);
        }
    }
    //Removing Patients to the PatientList o(n) Complexity
    public void removePatient(int id){
        Node current= head;
        Node prev= null;
        if(current!=null && current.getData().getId()==id){head=current.next;}
        while (current!=null&&current.getData().getId()!=id){prev=current;current=current.next;}
        if (current!=null && prev!=null){prev.next=current.next;}
        if (current==null){IO.println("Id number not found");}
    }
    //Finding Patients from the PatientList O(n) Complexity
    public Patient findPatient(int id) {
        Node current = head;
        while (current.getData().getId() != id) {current = current.next;}
        return current.getData();
    }
    //Printing the  PatientList O(n) Complexity
    public void printList(){
        Node current=head;
        int listcount=1;
        if (current==null){IO.println("Patient List is empty");}
        while (current!=null){
            IO.println(listcount+"."+current.getData().toString());
            current=current.next;
            listcount++;
        }
    }
}
