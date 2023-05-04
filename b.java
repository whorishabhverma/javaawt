//using inheritance 
import java.awt.Frame;
class b extends Frame{
    public static void main(String[] args){
         System.out.println("start");
        b B = new b();
        B.setTitle("new title");
         System.out.println(B);
        B.setSize(300,200);
        B.setVisible(true);
        System.out.println("end");

    }


    // public b(String name){
    //     super(name);//set title
    // }


}