public class Node {
    Patient data;
    Node next;
    Node(Patient data){
        this.data=data;
        this.next=null;
    }
    public void setNext(Node next) {this.next = next;}
    public Patient getData() {return data;}
}
