import java.util.Scanner;
class stack{
    int arr[]=new int[5],top=-1;
    void push(int x){ arr[++top]=x;}
    int pop() {return arr[top--];}
}

public class Main{
    public static void main(String[]args){
        stack out=new stack();
        out.push(10);
        out.push(20);
        System.out.println(out.pop());
    }
}