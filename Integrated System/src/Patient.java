public class Patient{
    int id;
    String name;
    int severity ;
    int age;
    static int idCounter=1;
    public Patient(String n,int s,int a){
        this.name=n;
        this.age=a;
        this.severity=s;
        this.id=idCounter;
        idCounter+=1;
    }
    public int getId(){return id;}
    public int getAge(){return age;}
    public String getName(){return name;}
    public int getSeverity(){return severity;}
    public String toString(){return"Id:"+getId()+" Name:"+getName()+" Age:"+getAge()+" Severity:"+ getSeverity();}
}
