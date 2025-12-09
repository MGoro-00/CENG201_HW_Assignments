void main(){
    DischargeRecord r1=new DischargeRecord(1000);
    DischargeRecord r2=new DischargeRecord(1100);
    DischargeRecord r3=new DischargeRecord(1200);
    DischargeRecord r4=new DischargeRecord(1300);
    DischargeRecord r5=new DischargeRecord(1400);
    DischargeStack dischargeList= new DischargeStack();
    dischargeList.push(r1);
    dischargeList.push(r2);
    dischargeList.push(r3);
    dischargeList.push(r4);
    dischargeList.push(r5);
    dischargeList.pop();
    dischargeList.pop();
    dischargeList.printStack();
}
