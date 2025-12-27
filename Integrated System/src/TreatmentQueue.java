public class TreatmentQueue{
    private Node<TreatmentRequest> front;
    private Node<TreatmentRequest> rear;
    private int size;
    public TreatmentQueue(){
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    public boolean isEmpty() {return (front==null);}
    public int size() {return size;}
    public void enqueue(TreatmentRequest request){
        Node<TreatmentRequest> newNode = new Node<>(request);
        if (rear == null) {front = rear = newNode;}
        else {rear.next = newNode;rear = newNode;}
        size++;
    }
    public TreatmentRequest dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        TreatmentRequest data = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        size--;
        return data;
    }
    public void printQueue(){
        System.out.println("Queue Size: " + size);
        Node<TreatmentRequest> current = front;
        while (current != null){
            System.out.println("ID: " + current.data.patientId + " | Time: " + current.data.arrivalDate);
            current = current.next;}
    }
}