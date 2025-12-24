public class PatientList{
    Node<Patient> head;
    public void addPatient(Patient newPatient){
        if(head == null){head = new Node<>(newPatient);}
        else{
            Node<Patient> current=head;
            while(current.next!=null){current=current.next;}
            current.next=new Node<>(newPatient);
        }
    }
    public void removePatient(int id){
        if(head==null){return;}
        if(head.data.getId()==id){
            head=head.next;
            return;
        }
        Node<Patient> current=head;
        Node<Patient> prev=null;
        while(current!=null && current.data.getId()!= id){
            prev=current;
            current=current.next;
        }
        if(current!=null){
            assert prev!=null;
            prev.next=current.next;
        }
        else{IO.println("Id number not found");}
    }
    public Patient findPatient(int id){
        Node<Patient> current=head;
        while(current!=null){
            if(current.data.getId()==id){return current.data;}
            current=current.next;
        }
        return null;
    }
    public void printList(){
        Node<Patient> current=head;
        if(current==null){IO.println("Patient List is empty");return;}
        while(current!=null){
            System.out.println(current.data.toString());
            current=current.next;
        }
    }
    public void bubbleSortBySeverity(){
        if(head==null||head.next==null){return;}
        boolean swapped;
        Node<Patient> current;
        Node<Patient> last=null;
        do{
            swapped=false;
            current=head;
            while(current.next != last){
                if(current.data.getSeverity()<current.next.data.getSeverity()){
                    Patient temp=current.data;
                    current.data=current.next.data;
                    current.next.data=temp;
                    swapped=true;
                }
                current=current.next;
            }
            last=current;
        }
        while(swapped);{IO.println("Patient list sorted by Severity.");}
    }
}
