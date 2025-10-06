import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String a="abass";
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(a.indexOf(ch)==a.lastIndexOf(ch)){
                System.out.println(ch);
                
            }
        }
    }
}