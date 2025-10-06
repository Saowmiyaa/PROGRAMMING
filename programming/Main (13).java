import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int n=out.nextInt();
        if(n%2==0){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
}