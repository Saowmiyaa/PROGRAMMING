import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String a=out.nextLine();
        String noSpace =a.replace(" ","");
        System.out.println(noSpace);
    }
}