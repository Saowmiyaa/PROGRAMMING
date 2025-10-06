import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int arr[]={10,20,30,40};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
        }
        }
        System.out.println(max);
    }
}