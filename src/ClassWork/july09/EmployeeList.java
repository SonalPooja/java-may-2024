package ClassWork.july09;

public class EmployeeList {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private int age;

    public EmployeeList(int id, String firstName, String lastName, String email, String city, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", firstName: " + firstName +
                ", lastName: " + lastName +
                ", email: " + email +
                ", city: " + city +
                ", age: " + age;
    }
}
