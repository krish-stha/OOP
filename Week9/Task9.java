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

    //4

    Cars cc=new Cars();
    System.out.println("car action:");
    cc.startEngine();
    cc.drive();
    cc.stopEngine();
    

    System.out.println("Motorcycle Action");
    Motorcycle mc=new Motorcycle();
    mc.startEngine();
    mc.ride();
    mc.stopEngine();

    //5

    Rectangles re=new Rectangles(45,50);
    re.calculateArea();
    re.calculatePerimeter();

    Circles circle=new Circles(7.5);
    circle.calculateArea();
    circle.calculateCircumference();

    //6


    FictionBook f=new FictionBook("the god", "krish", 1990);
    f.displayDetails();
    f.genre();

    Non_FictionBook nf=new Non_FictionBook("teri meri kahani", "Utsav",1880);
    nf.displayDetails();
    nf.genre();


    Technical t=new Technical("k xa khabar", "Sanjiv", 2012);
    t.displayDetails();
    t.genre();
}    
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

// 4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.


class Vehicles{
    void startEngine(){
        System.out.println("Starting the engine");
}

void stopEngine(){
    System.out.println("Stopping the engine");
}
}

class Cars extends Vehicles{
    public void drive(){
        System.out.println("Driving the car");
}
}

class Motorcycle extends Vehicles{
    public void ride(){
        System.out.println("Riding the motorcycle");
}
}


// 5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.


abstract class Shapess{
    int length;
    int breadth;
    double radius;


    Shapess(int length, int breadth){
        this.length = length;
        this.breadth=breadth;
        
    }

    Shapess (double radius){
        this.radius = radius;
    }


    abstract void calculateArea();


}


class Rectangles extends Shapess{

    Rectangles(int length, int breadth){
        super(length,breadth);
    }

    void calculatePerimeter (){
        System.out.println("The perimeter is "+(2*(super.length+super.breadth)));
}

@Override

void calculateArea(){
    System.out.println("The area of rectangle is"+super.length*super.breadth);
}
}

class Circles extends Shapess{

    Circles(double radius){
        super(radius);
    }
    void calculateCircumference (){
        System.out.println("The circumference is "+(2*Math.PI*super.radius));
}

@Override
void calculateArea(){
    System.out.println("The area of circle is"+Math.PI*super.radius*super.radius);
}
}


// 6. Let's examine the Java program given. It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method called displayDetails(). This method is responsible for outputting the title and author of a book. The remaining classes inherit both the constructor and methods of the Book class as they extend it.

// Hint: Use super keywords


class Book{
    String title;
    String author;
    int year;

    Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    void displayDetails(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Year: "+this.year);

    }
}

class FictionBook extends Book{
    FictionBook(String title, String author, int year) {
        super(title,author,year);
    }

    void genre(){
        System.out.println("This is in fictional genre");
    }
}


class Non_FictionBook extends Book{
    Non_FictionBook(String title, String author, int year) {
        super(title,author,year);
    }
    void genre(){
        System.out.println("This is in non-fictional genre");
    }
}

class Technical extends Book{
    Technical(String title, String author, int year) {
        super(title,author,year);
}
void genre(){
    System.out.println("This is in technical genre");
}
}