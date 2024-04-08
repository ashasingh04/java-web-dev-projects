import java.util.ArrayList;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private double yearsTeaching;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    private void setYearsTeaching(double yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSubject(){
        return subject;
    }
    public double getYearsTeaching(){
        return yearsTeaching;
    }
}
