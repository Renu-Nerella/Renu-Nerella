public class Employee extends Work {
    private String companyName;
    private String  employeeType;
    public Employee(String ibm, String s){
        super("Manager", "23/3/2021", "1_00_000", "4653764");
        this.companyName = companyName;
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "companyName='" + companyName + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }


    }

