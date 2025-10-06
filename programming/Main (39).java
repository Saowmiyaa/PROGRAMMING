class student{
    int id;
    String name;
    int mark;
}
class student1 extends student{
    
}
public class Main{
    public static void main(String[]args){
        student obj=new student();
        obj.id=102;
        obj.name="saowmi";
        obj.mark=300;
        student1 obj1=new student1();
        obj1.id=109;
        obj1.name="sowmi";
        obj1.mark=360;
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj.mark);
        System.out.println(obj1.id);
        System.out.println(obj1.name);
        System.out.println(obj1.mark);
        if(obj.mark>obj1.mark){
            System.out.println(obj.mark);
        }
        else{
             System.out.println(obj1.mark);
        }
    }
}
