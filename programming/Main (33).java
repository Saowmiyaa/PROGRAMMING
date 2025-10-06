import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String a=out.nextLine();
        String b=out.nextLine();
        char[]arr=a.toCharArray();
        char[]brr=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        if(Arrays.equals(arr,brr)){
            System.out.println("Anagram");
        }
        else{
             System.out.println("not Anagram");
        }
    }
}