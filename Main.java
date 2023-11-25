public class Main {
    public static void main(String[] args) {
         Work work = new Work("office work", "12/2/1993", 100000, 76473);
         doWorkStuff(work, "required");

         Employee employee = new Employee("IBM", " intern");
        doWorkStuff(employee,"less than 20 days");
        }
public static void doWorkStuff(Work work, String time){
        work.companyWork();
        work.worktype(time);
    System.out.println(work);
    System.out.println("- - - - - ");
}
    }
