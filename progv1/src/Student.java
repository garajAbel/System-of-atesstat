public class Student {
    public String name;
    public int n1 ;
    public int n2 ;
    public int n3 ;
    public Student(String name,int n1,int n2,int n3){
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public int getAttestate(){
        return (n1 + n2 + n3)/3 ;
    }

}
