package ijpPractice;

public class EmployeeDetails {
    private String empId;
    private String name;
    private double salary;

    public EmployeeDetails(String empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public double AnnualSalary(){
        return salary*12;
    }
    public void Details(){
        System.out.println("Employee Id :"+empId);
        System.out.println("Employee Name :"+name);
        System.out.println("Employee Salary $:"+salary);
        System.out.println("Employee Annual Salary $:"+AnnualSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        EmployeeDetails e1=new EmployeeDetails("Pavan8308","Pavan Jadhav",2500);
        e1.Details();
        EmployeeDetails e2=new EmployeeDetails("Akshay90","Akshay Todkar",3000);
        e2.Details();

    }
}
