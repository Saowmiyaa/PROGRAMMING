import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String a=out.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--)
            rev+=a.charAt(i);
            if(a.equals(rev)){
                System.out.println("Palindrome");
            }
            else{
                 System.out.println("Not Palindrome");
            
            }
        
    }
}