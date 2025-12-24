public class DischargeStack{
    private Node<DischargeRecord> top;
    public boolean isEmpty(){return top==null;}
    public void push(DischargeRecord record){
        Node<DischargeRecord> newNode = new Node<>(record);
        newNode.next=top;
           top=newNode;
    }
    public DischargeRecord pop(){
        if(isEmpty()){
            IO.println("Stack is empty");
            return null;
        }
        DischargeRecord data=top.data;
        top=top.next;
        return data;
    }
    public String peek(){
        if(isEmpty()){return "Stack is empty";}
        return"ID: "+top.data.patientId+" Time: "+top.data.dischargeDate;
    }
    public void printStack(){
        Node<DischargeRecord> current=top;
        while (current!=null){
            IO.println("ID: "+current.data.patientId+" Discharged: "+current.data.dischargeDate);
            current=current.next;
        }
    }
}
