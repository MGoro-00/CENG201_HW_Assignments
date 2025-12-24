public class DischargeStack {
    int top;
    static final int MAX = 1000;
    DischargeRecord[] stack = new DischargeRecord[MAX];
    boolean isEmpty() {return top < 0;}
    public void push(DischargeRecord dischargeRecord) {
        if (isEmpty()){stack[0]=dischargeRecord;top=0;return;}
        top++;
        stack[top]=dischargeRecord;
    }
    public DischargeRecord pop(){
        if (isEmpty()){IO.println("Stack is empty");return null;}
        DischargeRecord temp=stack[top];
        stack[top]=null;
        top-=1;
        return temp;
    }
    public String peek(){return "ID: "+stack[top].patientId+"Discharge time:"+stack[top].dischargeDate;}
    public void printStack(){for (int i=top;i>0;i--){IO.println(i+". "+"ID:  "+stack[i].patientId+"  Discharge time:"+stack[i].dischargeDate);}}
}