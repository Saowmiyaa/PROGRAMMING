import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String a=out.nextLine();
        int count=0;
        
       
        for(int i=1;i<a.length();i++){
            char ch=a.charAt(i);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
    }
    System.out.println(count);
    }
}