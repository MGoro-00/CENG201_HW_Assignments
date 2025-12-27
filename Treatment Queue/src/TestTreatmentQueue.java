void main() {
    TreatmentQueue testQueue= new TreatmentQueue(8);
    TreatmentRequest p1= new TreatmentRequest(1);
    TreatmentRequest p2= new TreatmentRequest(2);
    TreatmentRequest p3= new TreatmentRequest(3);
    TreatmentRequest p4= new TreatmentRequest(4);
    TreatmentRequest p5= new TreatmentRequest(5);
    TreatmentRequest p6= new TreatmentRequest(6);
    TreatmentRequest p7= new TreatmentRequest(7);
    TreatmentRequest p8= new TreatmentRequest(8);
    testQueue.enqueue(p1);
    testQueue.enqueue(p2);
    testQueue.enqueue(p3);
    testQueue.enqueue(p4);
    testQueue.enqueue(p5);
    testQueue.enqueue(p6);
    testQueue.enqueue(p7);
    testQueue.enqueue(p8);
    testQueue.printQueue();
    IO.println();
    testQueue.dequeue();
    testQueue.dequeue();
    testQueue.dequeue();
    testQueue.printQueue();
}
