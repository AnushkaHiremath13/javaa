package javaa;

public class Employee {
   String name;
   int id;
    double salary;
    
    public Employee(String name, int id, double salary) {
          this.name = name;
          this.id = id;
          this.salary = salary;
     }
     public void displayInfo(){
        System.out.println("Emplyee Name: " + name);
        System.out.println("Emplyee ID: " + id);
        System.out.println("Emplyee Salary: " + salary);
     }
    public static void main(String[] args) {
        Employee e=new Employee("Anushka", 101, 2000000);
        e.displayInfo();
    }
 }
