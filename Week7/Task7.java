package Week7;

//They aare all in comment as it reflect error.


// Task To Do



// 1. Write a Java program to create a class called "Circle" with a radius attribute. You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.
class Circle{
    private double radius;
    public void area(){
        System.out.println("The area of the radius is"+Math.PI*radius*radius);
    }
    public void circumference(){
        System.out.println("The circumference is "+2*3.14*Math.PI);
    }

    void setRadius(double radius){
        this.radius=radius;
    }

    double getRadius(){
        return radius;
    }
}

public class Task7 {


public static void main(String[] args){

    Circle c=new Circle();
    c.setRadius(55.0);
    c.area();
    c.circumference();
}

}

// 2. Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, using setter getter method and print the values.


public class Task7 {
    public static void main(String[] args){
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(454545.0);
        si.setRate(89.8);
        si.setTime(4.0);

        System.out.println("The value of simple interest is"+si.value());
    }
}

class SimpleInterest{
    private double principle;
    private double time;
    private double rate;
//setter for principle
    public void setPrinciple(double principle){
        this.principle=principle;
    }

    //getter for principle

    double getPrinciple(){
        return principle;
    }

    //setter for rate
    public void setRate(double rate){
        this.rate=rate;
    }

    //getter for rate

    double getRate(){
        return rate;
    }

    //setter for time

    public void setTime(double time){
        this.time=time;
    }

    //getter for time

    double getTime(){
        return time;
    }

    double value(){
        return (principle*rate*time)/100;
    }

}



// 3. Write a Java program to create a class called "Doggy" with a name and breed attribute. Create two instances of the "Doggy" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.


public class Task7 {
    public static void main(String[] args) {
        // Creating instances of Doggyclass
        Doggy dog1 = new Doggy("Buddy", "Golden Retriever");
        Doggy dog2 = new Doggy("Suii", "Paradu");

        // Before the update of the nam and bread 
        System.out.println("Before the updatation of the name and breed:");
        dog1.displayDetails();
        dog2.displayDetails();
//updating the dog name and breed
        System.out.println("After updating using setters:");

        dog1.setName("Sanjiv");
        dog1.setBreed("Manandhar");

        dog2.setName("Utsav");
        dog2.setBreed("Thapa");

        dog1.displayDetails();
        dog2.displayDetails();
    }
}
//It is named Doggy because the dog class is already created somewhere in the package.
class Doggy{
    private String name;
    private String breed;

    // Constructor
    public Doggy(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println();
    }
}


// 4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary..

public class Task7 {
    public static void main(String[] args){
        Employee employee1 = new Employee("Krish", "Data Analyst", 100000.0);

        System.out.println("Before the updation of the salary");
        employee1.details();

        System.out.println("After the updation of the salary");
        employee1.setSalary(1500000);
        employee1.details();
    }
}

class Employee{
    private String name;
    private String jobTitle;
    private double salary;

    Employee(String name,String jobTitle,double Salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=Salary;
    }

    //setter for salary

    void setSalary(double Salary){
        this.salary=Salary;
    }

    //getter for salary

    double getSalary(){
        return salary;
    }

    //details

    void details(){
        System.out.println("the detaiils are given below");
        System.out.println("Name: "+name);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
        
    }
}
    
}
