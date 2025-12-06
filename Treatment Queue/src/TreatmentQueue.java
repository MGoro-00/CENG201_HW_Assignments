public class TreatmentQueue {
    int front,rear,size,capacity;
    TreatmentRequest[] array;
    TreatmentQueue(int cap){
        capacity=cap;
        front=0;
        size=0;
        rear=capacity-1;
        array=new TreatmentRequest[capacity];
    }
    public boolean isFull(){return size == capacity;}
    public boolean isEmpty(){return size==0;}
    public void enqueue(TreatmentRequest request){
        if (isFull()){return;}
        rear=(rear+1)%capacity;
        array[rear]=request;
        size++;
    }
    public int size(){return size;}
    public TreatmentRequest dequeue(){
        if (isEmpty()){
            IO.println("Queue is already empty");
            return null;
        }
        else {
            TreatmentRequest processed=array[front];
            front=front+1%capacity;
            size-=1;
            return processed;
        }
    }
    public void printQueue(){
        IO.println("There are currently "+size()+" patients in queue");
        int temp= front;
        IO.println("         ID         ARRIVAL TIME");
        while(temp<=rear){
            IO.println(temp+"."+array[temp].patientId+"                 "+array[temp].arrivalTime);
            temp++;
        }
    }
}
