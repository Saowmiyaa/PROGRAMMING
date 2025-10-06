import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int n=out.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=out.nextInt();
         Arrays.sort(arr);
        System.out.println(arr[0]+" ");
        
         for(int i=1;i<n;i++){
             if(arr[i]!=arr[i-1])System.out.println(arr[i]+" ");
    }
    }
}