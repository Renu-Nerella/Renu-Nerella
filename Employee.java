public class Employee {
    String name;
    String job;
    Long salary;
    String address;
    int pincode;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
