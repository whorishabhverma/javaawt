// *******************video 6
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
class E{
    public static void main(String [] args){
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setLayout(new FlowLayout());//center
        TextField tf = new TextField("this is example");
        TextField tf2 = new TextField("this is example-2");
        TextField tf3 = new TextField("this is example-3");
        TextField tf4 = new TextField("this is example-4");
        frame.add(tf);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(tf4);





    }
}