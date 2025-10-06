import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner out=new Scanner(System.in);
        String s=out.nextLine();
        int freq[]=new int[256];
        for(char ch:s.toCharArray())freq[ch]++;
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.println((char)i+"="+freq[i]);
            }
        }
    }
}