import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int n1=out.nextInt(),n2=out.nextInt();
        
        if(n1<n2){
        
        System.out.print(n1+" ");
        System.out.print(n2+" ");  
        }
        else {
        System.out.print ( n2+" " );
        System.out.print ( n1+" " );  
        }
    }
}