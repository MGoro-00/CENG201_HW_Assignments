import java.text.SimpleDateFormat;
public class DischargeRecord {
    int patientId;
    Long dischargeTime;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dischargeDate;
    DischargeRecord(int patientId){
        this.patientId=patientId;
        this.dischargeTime= System.currentTimeMillis()+864000000;
        this.dischargeDate= sdf.format(dischargeTime);
    }
}
