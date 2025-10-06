import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int num1=out.nextInt(),num2=out.nextInt();
        out.nextLine();
        String a=out.nextLine();
        String b=out.nextLine();
        if(num1>num2){
            System.out.println(num2);
        }
        else{
            System.out.println(num1);
        }
    }
}