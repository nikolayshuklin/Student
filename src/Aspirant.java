public class Aspirant extends Student{
    protected String scientific;
    public Aspirant(String firstName,String lastName,String group,double averageMark, String scientific){
        super(firstName, lastName, group, averageMark);
        this.scientific = scientific;
    }

    protected int getScholarship(){
        if (averageMark == 5.0) return 200;
        else return 180;
    }


}
