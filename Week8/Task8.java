

package Week8;
    
public class Task8 {

    public static void main(String[] args){


        //1
    BankingAccount ba=new BankingAccount(7945412," krish shrestha",78100000 );
    ba.detail();
    ba.deposit(1000);
    ba.withdraw(450000);
   
   //2

   Book book = new Book("Muna Madan", "Laxmi prasad Devkota", 1925);
   System.out.println("Title: " + book.getTitle());
   System.out.println("Author: " + book.getAuthorName());
   System.out.println("Publication Year: " + book.getYear());
   System.out.println("Is Available: " + book.isAvailable());

   book.borrowBook();
   System.out.println("Is Available after borrowing: " + book.isAvailable());

   book.returnBook();
   System.out.println("Is Available after returning: " + book.isAvailable());
   

   //3

   Student s=new Student("krish", 4545450, 3.4);
   s.setId(4545);
   s.setName("chris");

   System.out.println("Name ="+s.getName());
   System.out.println("id ="+s.getId());

   s.details();

   //4

   Menu m=new Menu("Momo",450);
   m.setName("chowmein");
   m.setPrice(200);
   System.out.println("Name ="+m.getName());
   System.out.println("price ="+m.getPrice());

    //5

    Car c=new Car("Toyota","Eon",4500);
    c.getMake();
    c.getModel();
    c.setRentalPrice(500);

    System.out.println("model is "+c.getRentalPrice());
    c.rent();
    System.out.println("It is available after this purchase   :"+c.getAvailable());
    c.vehicleReturn();
    System.out.println("The vehicle is available after the return:"+c.getAvailable());
    

  
    

   



}







    
}

// 1. You are building a banking application that has a BankAccount class. Implement the BankAccount class with encapsulation principles in mind. Include private instance variables for the account number, account holder name, and account balance. Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. Ensure that the account balance cannot be accessed or modified directly.


class BankingAccount {
    private int accountNumber;
    private String accountHolderName;
    private int accountBalance;

    BankingAccount(int accountNumber,String accountHolderName,int accountBalance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;

    }

    public void deposit(int amount){
        this.accountBalance+=amount;
        System.out.println("Deposited successfully");
        
    }

    public void withdraw(int amount){
        if(amount<=this.accountBalance){
            this.accountBalance-=amount;
            System.out.println("After the withdrawal your total balance is"+ accountBalance);
    }else{
        System.out.println("it is in negative number.");
    }
}

    public void detail(){
        System.out.println("You account number is"+this.accountNumber);
        System.out.println("You Name is"+this.accountHolderName);
        System.out.println("You account balance is"+this.accountBalance);

    }

}





// 2. You are developing a library management system and need to implement a Book class. The Book class should have private instance variables for the book title, author name, and publication year. Implement appropriate getter and setter methods to ensure encapsulation. Additionally, include a private variable to track the availability of the book (e.g., true if available, false if borrowed), and provide a public method to borrow the book, updating its availability status.

class Book{
    private String title;
    private String authorName;
    private int year;
    private boolean isAvailable;

    Book(String title,String authorName,int year){
        this.authorName=authorName;
        this.title=title;
        this.year=year;
        this.isAvailable=true;// by default we are implementing it as a default

    }

        //making getter and setter for every variable

        void setTitle(String title){
            this.title=title;
        }

        String getTitle(){
            return this.title;
        }

        void setAuthorname(String authorName){
            this.authorName=authorName;
        }

        String getAuthorName(){
            return this.authorName;
        }

        void setYear(int year){
            this.year=year;
        }

        int getYear(){
            return this.year;
        }

        boolean isAvailable(){
            return this.isAvailable;
        }

        public void borrowBook(){
            if(isAvailable){
                isAvailable=false;
                System.out.println("You have successfully borrowed the book.");
            }else{
                System.out.println("Sorry currently the book is not available");
            }
        }

        public void returnBook(){
            isAvailable=true;
            System.out.println("You have successfully returned the book");
        }
   

}


// 3. You are working on a student information system and need to create a Student class. The student class should have private instance variables for the student's name, ID number, and grade point average (GPA). Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods. However, the GPA should be read-only and can only be set within the class constructor.


class Student{
    private String name;
    private int id;
    private double gpa;

    //Constructor

    Student(String name,int id,double gpa){
        this.name=name;
        this.gpa=gpa;
        this.id=id;
    }

       //getter and setter for name and id

       void setName(String name){
        this.name=name;
       }

       String getName(){
        return this.name;
       }

       void setId(int id){
        this.id=id;
       }

       int getId(){
        return this.id;
       }

       //getter for gpa

       double getGpa(){
        return this.gpa;
       }

       void details(){
        System.out.println("Name "+ this.name);
        System.out.println("id"+ this.id);
        System.out.println("gpa"+ this.gpa);
       }
}

// 4. You are developing a restaurant management system and want to create a Menu class. The Menu class should encapsulate a list of MenuItem objects. Implement the Menu class with private instance variables for the menu items and provide public methods to add and remove items from the menu. Ensure that the list of menu items cannot be directly accessed or modified from outside the class.


class Menu{

    private String name;
    private int price;

    Menu(String name,int price){
        this.name=name;
        this.price=price;
    }

    //getter and setter for the name and the price;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return this.name;
    }

    void setPrice(int price){
        this.price=price;

    }

    int getPrice(){
        return this.price;
    }


}



// 5. You are designing a car rental system, and you need to create a Car class. The Car class should have private instance variables for the car's make, model, and rental price per day. Implement appropriate getter and setter methods for these variables, ensuring that the make and model can only be set once during object creation. Additionally, include a private variable to track the availability of the car (e.g., true if available for rent, false if rented), and provide public methods to rent and return the car, updating its availability status.

class Car{
    private String make;
    private String model;
    private int price;
    private boolean isavailable;

    Car(String make, String model, int price){
        this.make=make;
        this.model=model;
        this.price=price;
        this.isavailable=true;
    }

    //setter and getter

    //getter for make and model and for isavailable

    String getMake(){
        return this.make;
    }

    String getModel(){
        return this.model;
    }

    boolean getAvailable(){
        return this.isavailable;
    }

    //getter and setter for rrental pricce

    void setRentalPrice(int price){
        this.price=price;
    }

    int getRentalPrice(){
        return this.price;
    }

    //rent method

    public void rent(){
        if(isavailable){
            this.isavailable=false;
            System.out.println("You have rented a vehicle successfully.");
        }else{
            System.out.println("It is already rented by someone.");
        }
    }

    //return 

    public void vehicleReturn(){
        isavailable=true;
        System.out.println("You have returned a vehicle.");


    }




    

}