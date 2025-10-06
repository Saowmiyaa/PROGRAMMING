import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int n1=out.nextInt();
        int n2=out.nextInt();
        
        int d=n1+n2;
        int e=-n1+n2;
        int f=-n1-n2;
        int g=n1-n2;
    
        if(d>0){
            System.out.println(1);
        }
        else{
             System.out.println(4);
        }
    }
}