import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String age;
    private int index;

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString(){
        return "\n" + " "+ index + " " +firstName + " " + lastName + " " + age;
    }
}
