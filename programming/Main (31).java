import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int n=out.nextInt();
        int a=out.nextInt();
        int b=out.nextInt();
        System.out.println(a);
        System.out.println(b);
        int sum=a+b;
        
        System.out.println(sum);
        int add=b+sum;
        System.out.println(add);
        int sum1=sum+add;
        System.out.println(sum1);
        
    }
}