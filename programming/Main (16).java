import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String a=out.nextLine();
        int length=0;
        for(int i=0;i<a.length();i++){
            length++;
        }
        System.out.println(length);
    }
}