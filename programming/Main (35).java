import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        int arr[]={1,34,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}