 class student{
    void luck(){
        System.out.println("going");
    }
 }
    class teacher extends student{
        
    }
    public class Main{
        public static void main(String[]args){
            teacher obj=new teacher();
             obj.luck();
        }
        
    }
