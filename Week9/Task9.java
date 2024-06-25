package Week9;

public class Task9 {
    public static void main(String[] args){

    // 1
    Car c=new Car("Mustang",5,"mt50");
    c.drive();
    c.display();

    //2

    HRManager hr=new HRManager();
    hr.getSalary();
    hr.work();
   
  
    //3

    Circle ci=new Circle(7.5);
    ci.calculateArea();
    Rectangle r=new Rectangle(4,5);
    r.calculateArea();

}


// 4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.

// 5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.

// 6. Let's examine the Java program given. It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method called displayDetails(). This method is responsible for outputting the title and author of a book. The remaining classes inherit both the constructor and methods of the Book class as they extend it.

// Hint: Use super keywords
    
}



//     1. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car with method display() method to print details of the Car.

class Vehicle{
    public void drive(){
        System.out.println("The car is driven.");


}
}

class Car extends Vehicle{
    private String name;
    private int year;
    private String model;

    Car(String name, int year, String model){
        this.name=name;
        this.year=year;
        this.model=model;
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}



// 2. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method.


class Employee{
    public void work(){
        System.out.println("Employee is working");

    };

    public double getSalary(){
        return 50000.0;

    }
}

class HRManager extends Employee{
    @Override
    public void work() {
        System.out.println("Hr manager is working");

}
}


// 3. Imagine you are building a Geometry calculator program. You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles. To achieve this, you decide to use a multilevel inheritance hierarchy.


class Geometry{

    int length;
    int breadth;
    double radius;

    Geometry(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    Geometry(double radius){
        this.radius=radius;
}

}

class Circle extends Geometry{
    Circle(double radius){
        super(radius);
    }

    public void calculateArea(){
        System.out.println("The area of the circle is"+ super.radius*Math.PI*2);
    }
}

class Rectangle extends Geometry{
    Rectangle(int length,int breadth){

        super(length,breadth);
}

void calculateArea(){
    System.out.println("The area of the rectangle is "+ super.length*super.breadth);
}
}