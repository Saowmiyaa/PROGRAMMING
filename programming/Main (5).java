import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner out=new Scanner(System.in);
	    int n=out.nextInt();
	    out.nextLine();
	    String a=out.nextLine();
	    String b=out.nextLine();
	    String c=out.nextLine();
	    if(a.compareTo(b)>0&&a.compareTo(c)>0){
		System.out.println(a);
	    }
	    else if(b.compareTo(a)>0&&b.compareTo(c)>0){
	        System.out.println(c);
	    }
	    else{
	        System.out.println(b);
	    }
	}
}
