package Week13;

public class Task13 {
    public static void main(String[] args) {
        

// 1. As a software developer, you have been assigned a task to implement a stack data structure in Java. Your goal is to create a Java class named Stack.java that represents a stack using a array. Implement the following operations:

// push(int element): Adds an integer value element to the top of the stack.

// pop(): Removes and returns the element at the top of the stack.

// peek(): Returns the element at the top of the stack without removing it.

// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.

// size(): Returns the number of elements currently in the stack.

// Your task is to write the Stack.java class and provide the necessary implementation for these operations using a array as the underlying data structure. Ensure that the stack follows the last-in, first-out (LIFO) principle.

        // question 1
        StackDataStructure s=new StackDataStructure(5);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());

        if(s.isEmpty()){
            System.out.println("The array is empty");
        }else{
            System.out.println("The array is not empty");
        }

        if(s.isFull()){
            System.out.println("The array is full");
        }else{
            System.out.println("The array is not full");
        }
        System.out.println("The remaining array is: ");

        for(int i=0;i<=s.top;i++){
            System.out.println(s.stack_arr[i]+" ");
        }

        
// 2. You are tasked with implementing a stack data structure in Java without using any built-in libraries. Your goal is to create a CustomStack class that can handle various operations. The class should have the following functionalities:

// push(int val): Adds an integer value val to the top of the stack.

// pop(): Removes and returns the element at the top of the stack.

// peek(): Returns the element at the top of the stack without removing it.



// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.

// isFull(): Checks if the stack is full and returns a boolean value indicating the result.

        //question 2

        CustomStack c= new CustomStack(5);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        System.out.println(s.pop());

        if(s.isEmpty()){
            System.out.println("The array is empty");
        }else{
            System.out.println("The array is not empty");
        }

        if(s.isFull()){
            System.out.println("The array is full");
        }else{
            System.out.println("The array is not full");
        }
        System.out.println("The remaining array is: ");

        for(int i=0;i<=s.top;i++){
            System.out.println(s.stack_arr[i]+" ");
        }






    
}
}


class StackDataStructure{
    int maxSize;
    int top;
    int[] stack_arr;

    StackDataStructure(int maxSize){
        this.maxSize=maxSize;
        stack_arr=new int[this.maxSize];
        top=-1;
    }

    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==maxSize-1;
    }

    void push(int data){
        if(isFull()){
            System.out.println("The array is full");
        }else{
            stack_arr[++top]=data;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("The array is empty");
            return -1;
        }
        return stack_arr[top--];
    }

    int peek(){
        if(isEmpty()){
            System.out.println("The array is empty");
            return -1;
        }

        return stack_arr[top];
    }

    
}


class CustomStack{
    int maxSize;
    int top;
    int[] stack_arr;

    CustomStack(int maxSize){
        this.maxSize=maxSize;
        stack_arr=new int[this.maxSize];
        top=-1;
    }

    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==maxSize-1;
    }

    void push(int data){
        if(isFull()){
            System.out.println("The array is full");
        }else{
            stack_arr[++top]=data;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("The array is empty");
            return -1;
        }
        return stack_arr[top--];
    }

    int peek(){
        if(isEmpty()){
            System.out.println("The array is empty");
            return -1;
        }

        return stack_arr[top];
    }

    
}

