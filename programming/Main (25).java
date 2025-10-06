import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int a=out.nextInt();
        int b=out.nextInt();
        int c=out.nextInt();
        int sum=a+b;
        
        if(sum==c){
            System.out.println("correct");
        }
        else{
            System.out.println("wrong");
        }
        
    }
}