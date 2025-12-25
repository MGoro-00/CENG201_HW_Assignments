import java.text.SimpleDateFormat;
public class TreatmentRequest{
    int patientId;
    long arrivalTime;
    Boolean priority;
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String arrivalDate;
    TreatmentRequest(int patientId){
        this.patientId=patientId;
        this.arrivalTime=System.currentTimeMillis();
        this.arrivalDate= simpleDateFormat.format(arrivalTime);
    }
    TreatmentRequest(int patientId, Boolean priority){
        this.patientId=patientId;
        this.priority=priority;
        this.arrivalTime=System.currentTimeMillis();
        this.arrivalDate= simpleDateFormat.format(arrivalTime);
    }
}
