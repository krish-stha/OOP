package Week5;

public class Task5 {

    //     1. Make a method to check if a number is prime or not.

  
    boolean prime(int num8){
        if (num8<2){
                return false;
            }
                for(int i=2;i<=Math.sqrt(num8);i++){
                    if(num8%i==0){
                        return false;
                    }
                }
        
                return true;
            
        
         
            
        }


// 2. Make a method to check if a given number n is even or not.

    static boolean OddEven(int number){
        if(number%2==0){
            return true;
    }
    return false;
}

// 3. Make a method to print the table of a given number n.

    void table(int numb){
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d \n",numb,i,numb*i);
        }

    }

// 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.

    static int multiply3(int a,int b,int c){
        return a*b*c;
    }

// 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
    void simpleInterest(double p,double r,double t){
    System.out.println((p*t*r)/100);
    
}

// 6. Write a program to calculate the area of a rectangle using a method of your choice.

double rectangle(double l, double b){
    return l*b;
}

// 7. Calculates the factorial of a given number using the Java method.

int fact(int nu){
    int total=1;
    for(int i=1;i<=nu;i++){
        total*=i;
        
    }

    return total;
}

// 8. Calculate the nth Fibonacci number using the method.
int fibo(int term){

    if(term<=1){
        return term;
    }
     int a=0;
     int b=1;

     for(int i=2;i<=term;i++){
        int temp=a+b;
        a=b;
        b=temp;
     }
     return b;
}

// 9. Write a Java program to find the greatest common divisor (GCD) of two numbers.

static int gcd(int aa,int bb){ 
while (bb != 0) {
    int tempa = bb;
    bb = aa % bb;
    aa = tempa;
}
return aa;

}


// 10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions.  
public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}




public static void displayPrimes(int limit) {
    System.out.println("Prime numbers less than " + limit + ":");
    int count = 0;
    for (int i = 2; i < limit; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
            count++;
        }
    }
    System.out.println("\nTotal prime numbers less than " + limit + ": " + count);
}




    

    public static void main(String[] args){

        Task5 f1=new Task5();

        boolean result=f1.prime(2);

        if(result){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        //question 2

        if(OddEven(0)){
            System.out.println("It is a Even.");
        }else{
            System.out.println("It is a odd number.");
        }

        //question 3

        

        f1.table(5);


        //question 4

        System.out.println(multiply3(2, 3, 4));

        //question 5

        f1.simpleInterest(2, 3.5, 4.5);

        //question 6



        System.out.println(f1.rectangle(10, 25));

        //question 7



        System.out.println(f1.fact(4));

        //question 8

        System.out.println(f1.fibo(4));

        int num1 = 48;
        int num2 = 18;
        int result1 = gcd(num1, num2);
        System.out.println(result1);

        //question 9
        int givenNumber = 50; // Change this number to whatever limit you desire
        displayPrimes(givenNumber);
    }    
}


// To know the fibonacii up to the nth term
// // public class Fibonacci {
// //     public static int[] fibonacci(int n) {
// //         int[] fib = new int[n + 1];
// //         fib[0] = 0;
// //         if (n > 0) {
// //             fib[1] = 1;
// //         }
        
// //         for (int i = 2; i <= n; i++) {
// //             fib[i] = fib[i - 1] + fib[i - 2];
// //         }
// //         return fib;
// //     }
    
// //     public static void main(String[] args) {
// //         int n = 10; // Change this to calculate Fibonacci numbers up to any term
// //         int[] fibNumbers = fibonacci(n);
        
// //         System.out.println("Fibonacci numbers up to the " + n + "th term:");
// //         for (int i = 0; i <= n; i++) {
// //             System.out.print(fibNumbers[i] + " ");
// //         }
// //     }
// // }

