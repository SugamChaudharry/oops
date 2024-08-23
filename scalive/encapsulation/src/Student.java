public class Student {
    private int roll;
    private String name;
    private double per;

    public void setStudent(int r,String s,double p){
        roll=r;
        name=s;
        per=p;
    }
    public void showStudent(){
        System.out.println("roll : "+roll);
        System.out.println("name : "+name);
        System.out.println("per : "+per);
    }
}
