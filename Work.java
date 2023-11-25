public class Work {
    private String work;
    private String date;
    private String salary;
    private String id;

    public Work(String workType, String date, int salary, int id) {
    }

    @Override
    public String toString() {
        return "Work{" +
                "work='" + work + '\'' +
                ", date='" + date + '\'' +
                ", salary='" + salary + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
public Work(){

}
    public Work(String manager, String date, String salary, String id) {
        this.work = work;
        this.date = date;
        this.salary = salary;
        this.id = id;
    }
        public void worktype(String time){
            System.out.println(work + "given work" + time);

        }
        public void companyWork(){
        System.out.println(date + "date of joining in the company " );
        }
        }


