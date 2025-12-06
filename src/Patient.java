public class Patient {
    int id;
    String name;
    int severity ;
    int age;
    static int idCounter;
    public Patient(String name,int severity,int age){
        this.name=name;
        this.age=age;
        this.severity=severity;
        idCounter+=1;
        this.id=idCounter;
    }
    public int getId() {return id;}
    public int getAge() {return age;}
    public String getName() {return name;}
    public int getSeverity() {return severity;}
    public String toString(){
        return"Id:"+getId()+" Name:"+getName()+" Age:"+getAge()+" Severity:"+ getSeverity();
    }
}
