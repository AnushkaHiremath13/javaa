package javaa;

public class Employee {
   String name;
   int id;
    double salary;
    int age;
    
    public Employee(String name, int id, double salary, int age) {
          this.name = name;
          this.id = id;
          this.salary = salary;
          this.age=age;
     }
     public void displayInfo(){
        System.out.println("Emplyee Name: " + name);
        System.out.println("Emplyee ID: " + id);
        System.out.println("Emplyee Salary: " + salary);
        System.out.println("    Employee age in master"+age);
     }
    public static void main(String[] args) {
        Employee e=new Employee("Anushka", 101, 2000000,19);
        e.displayInfo();
    }
 }
