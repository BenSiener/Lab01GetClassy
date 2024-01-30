import org.junit.Test;
import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {

        ArrayList<Person> peopleArray = new ArrayList<>();

        peopleArray.add(new Person("01", "Jesse", "Eisenburg", "King", 1977));
        peopleArray.add(new Person("02", "Michael", "Jordan", "Technician", 1992));
        peopleArray.add(new Person("03", "French", "Fry", "Doctor", 1955));

        for (Person personList : peopleArray) {

            System.out.println(personList.getFormalName() + " --- " + personList.toCSVDataRecord());
        }
        System.out.println();
    }
}


