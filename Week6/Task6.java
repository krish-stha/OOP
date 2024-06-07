package Week6;

public class Task6 {

    public static void main(String[] args){

    // 1. Write a java program to Add two 2x3 matrices

        int[][] matrix1={{1,2,3},{4,5,6}};
        int[][] matrix2={{1,2,3},{4,5,6}};

        int [][] result=new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int k=0;k<2;k++){
            for(int j=0;j<3;j++){
                System.out.print(result[k][j]+"  ");
            }

            System.out.println();
        }

        //Practice
     
            //         int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
            //         int[][] matrix2 = { {7, 8, 9}, {10, 11, 12} };
            //         int[][] result = new int[2][3];
            
            //         for (int i = 0; i < 2; i++) {
            //             for (int j = 0; j < 3; j++) {
            //                 result[i][j] = matrix1[i][j] + matrix2[i][j];
            //             }
            //         }
            
            //         System.out.println("Sum of the matrices:");
            //         for (int i = 0; i < 2; i++) {
            //             for (int j = 0; j < 3; j++) {
            //                 System.out.print(result[i][j] + " ");
            //             }
            //             System.out.println();
            //         }
            //     

// 2. Write a java program to print transpose 2X2 matrices

        int[][] matrix={{1,2},{3,4}};
        int[][] result1=new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                result1[i][j]=matrix[j][i];
            }
        }

        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                System.out.print(result1[j][k]+" ");
            }
            System.out.println();
        }


// 3. Write a java program to print mirror 2X2 matrices

        int[][] matrix3={{1,2},{3,4}};
                int[][] result2=new int[2][2];
        
                for(int i=0;i<2;i++){
                    result2[i][0]=matrix3[i][1];
                    result2[i][1]=matrix3[i][0];
                }
        
                for(int j=0;j<2;j++){
                    for(int k=0;k<2;k++){
                        System.out.print(result2[j][k]+" ");
                    }
                    System.out.println();
                }

// 4. Write a java program to Multiply two 2x3 matrices
                int[][] mtx={{1,2,8},{3,4,7}};
                int[][] mtx1={{1,2,8},{3,4,7}};

                int[][] rsult=new int[2][3];

                for(int i=0;i<2;i++){
                    for(int j=0;j<3;j++){
                        rsult[i][j]=mtx[i][j]*mtx1[i][j];

                    }
                }

                for(int j=0;j<2;j++){
                    for(int k=0;k<3;k++){
                        System.out.print(rsult[j][k]+" ");
                    }
                    System.out.println();
                }

    }
    
    
}

// ArrayList

// 1. Write code that creates an ArrayList that can hold string objects. Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.

//Answer in comments.

// import java.util.ArrayList;;
// public class Taskk4{
//     public static void main(String[] args){
//         ArrayList<String> car=new ArrayList<>();
//         car.add("ferrari");
//         car.add("Porsche");
//         car.add("lamborgini");

//         System.out.println(car);

        

        
//     }
// }

// 2. WAP to sort the integer elements of array of size 10 in ascending and descending order using ArrayList.


// import java.util.ArrayList;
// import java.util.Collections;// we need to use collection for the easy processing and way.

// public class Practice{
//     public static void main(String[] args){
//         int[] arr={10,20,5,6,18,49,45,62,35,98};
//         ArrayList <Integer> al=new ArrayList<>();

//         for(int i:arr){
//             al.add(i);
//         }

//         //ascending order

//         Collections.sort(al);
//         System.out.println(al);

//         //descending order;
//         Collections.sort(al,Collections.reverseOrder());
//         System.out.println(al);
//     }
// }



// Additional Questions (Menu Driven Application)

// 1. Develop a simple menu-driven application in Java that operates on an array of elements. The program will display a Menu with those options and prompt the user to choose his/her option.

// The program should provide the functionalities:

// 1.    Add an element to the array

// 2.    Display all the elements of the array

// 3.    Reverse the elements of the array

// 4.    Find the largest element of the array

// 5.    Find the smallest element of the array

// 6.    Exit the program



// Note: Based on the user's selection, the program will perform the corresponding operation and display the result or carry out the desired action. The program will continue to show the menu until the user chooses the option to exit.

//Answer in comments

// import java.util.Scanner;

// public class Practice{
//    public static int[] arr=new int[10];
//     public static int size=0;
//     public static Scanner sc=new Scanner(System.in);

//     public static void main(String[] args){
//         int choice;
//         do{
//             showMenu();
//              choice=sc.nextInt();

//              switch(choice){
//                 case 1:
//                 System.out.println("Enter a number you want to add;");
//                 int number=sc.nextInt();
//                 addElement(number);
//                 break;

//                 case 2:
//                 display();
//                 break;

//                 case 3:
//                 reverse();
//                 break;

//                 case 4:
//                 largest();
//                 break;

//                 case 5:
//                 smallest();
//                 break;

//                 case 6:
//                 System.out.println("Exiting the program;");
//                 break;

//                 default:
//                 System.out.println("invalid input.");
//              }

             
//         }while(choice!=6);
//        sc.close();

//     }

//     public static void showMenu(){
//         System.out.println("\nMenu:");
//         System.out.println("1. Add an element to the array");
//         System.out.println("2. Display all the elements of the array");
//         System.out.println("3. Reverse the elements of the array");
//         System.out.println("4. Find the largest element of the array");
//         System.out.println("5. Find the smallest element of the array");
//         System.out.println("6. Exit the program");
//         System.out.print("Enter your choice: ");
//     }

//     public static void addElement(int num){
//         if(size<arr.length){
//             arr[size]=num;
//             size++;
//             System.out.println("Added to the array;");
//         }else{
//             System.out.println("Array is full. cannot add more element.");
//         }
    
// }

//     public static void display(){
//         if(size==0){
//             System.out.println("The array is empty");
//         }else{
//             System.out.println("The element is are as follow;");
//             for(int i=0;i<size;i++){
//                 System.out.print(arr[i]+"  ");
//             }
//             System.out.println();
//         }

//         }

//     public static void reverse(){
//         if(size==0){
//             System.out.println("The array is empty");
//         }else{
//             System.out.println("The reverse array is:");
//             for(int i=size-1;i>=0;i--){
//                 System.out.print(arr[i]+"  ");
//             }
//             System.out.println();
//         }
//     }

//     public static void largest(){
//         int large=arr[0];

//         for(int i=1;i<size;i++){
//             if(arr[i]>large);
//             large=arr[i];
//         }

//         System.out.println("The largest number of the element is "+large);
//     }

//     public static void smallest(){
//         int small=arr[0];

//         if(size==0){
//             System.out.println("The array is empty");
//         }else{
//             for(int i=1;i<size;i++){
//                 if(arr[i]<small){
//                     small=arr[i];
//                 }
//             }
//             System.out.println("The smallest number is "+small);

//         }
//     }
// }





// 2. Develop a simple menu-driven student grading system program in Java that operates on an array of student grades. The program will display a Menu with those options and prompt the user to choose his/her option.

// The program should provide the functionalities:

// 1.    Add a grade to the system

// 2.    Display all grades

// 3.    Calculate the average grade

// 4.    Find the highest grade

// 5.    Find the lowest grade

// 6.    Exit the program



// Note: Based on the user's selection, the program will perform the corresponding operation and display the result or carry out the desired action. The program will continue to show the menu until the user chooses the option to exit.


//Answer below in the comment.
// import java.util.Scanner;


// public class Practice{
//     public static int[] arr=new int[10];
//     public static int size=0;
//     public static Scanner sc=new Scanner(System.in);
//     public static void main(String[] args){

//         int choice;

//         do{
//             showMenu();
//             choice=sc.nextInt();

//             switch(choice){
//                 case 1:
//                 System.out.println("Enter a grade:");
//                 int number=sc.nextInt();
//                 addGrade(number);
//                 break;


//                 case 2:
//                 display();
//                 break;


//                 case 3:
//                 avg();
//                 break;


//                 case 4:
//                 highest();
//                 break;


//                 case 5:
//                 lowest();
//                 break;
                

//                 case 6:
//                 System.out.println("The program is ending.....");
//                 break;

//                 default:
//                 System.out.println("Please kindly enter the integer.");
//             }
//         }while(choice!=6);



//     }

//     public static void showMenu(){
//         System.out.println(" 1.    Add a grade to the system");
//         System.out.println("2.    Display all grades ");
//         System.out.println("3.    Calculate the average grade");
//         System.out.println(" 4.    Find the highest grade");
//         System.out.println(" 5.    Find the lowest grade");
//         System.out.println("  6.    Exit the program");
//         System.out.println("Enter your choice: ");

//     }

//     public static void addGrade(int num){

//         if(size<arr.length){
//             arr[size]=num;
//             size++;
//             System.out.println(num+"is added");
//         }
        
//     }

//     public static void display(){

//         if(size==0){
//             System.out.println("The array is empty;");
//         }else{
//             System.out.println("The element is are as follow:");

//             for(int i=0;i<size;i++){
//                 System.out.println(arr[i]+" ");
//             }
//         }

//     }

//     public static void avg(){
//         if(size==0){
//             System.out.println("the array is empty");
//         }else{
//             int sum=0;
//             for(int i=0;i<size;i++){
//                 sum+=arr[i];
//             }
//             System.out.println("The average grade is"+(double)sum/size);
//         }
//     }

//     public static void highest(){
//         if(size==0){
//             System.out.println("The array is empty");
//         }
//         else{
//             int high=arr[0];

//             for(int i=1;i<size;i++){
//                 if(arr[i]>high){
//                     high=arr[i];
//                 }
//             }
//             System.out.println("The highest grade is"+high);
//         }
//     }

//     public static void lowest(){
//         if(size==0){
//             System.out.println("The array is empty:");  }
//             int small=arr[0];

//             for(int i=1;i<size;i++){
//                 if(arr[i]<small){
//                     small=arr[i];
//                 }
//             }

//             System.out.println("The lowest grade is"+small);

            



      
//     }
// }
