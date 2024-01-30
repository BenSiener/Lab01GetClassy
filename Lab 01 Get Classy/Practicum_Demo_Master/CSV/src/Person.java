import java.util.Calendar;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    public String getID() {
        return ID;
    }

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFormalName() {
        return this.title + " " + this.firstName + " " + this.lastName;
    }

    public String toCSVDataRecord () {
        return this.ID + " " + this.title + " " + this.firstName + " " + this.lastName + " " + this.YOB;
    }

    public String getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - YOB;
        return "Age: " + age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

}
