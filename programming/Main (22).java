import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int b=out.nextInt();
        int h=out.nextInt();
        int mul=b*h;
        int divide=mul/2;
        System.out.println(divide);
    }
}