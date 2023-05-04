// video 8
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.TextField;


class G {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
    }
}
    class MyFrame extends Frame{
        private TextField t1 = new TextField("Text 1");
        private TextField t2 = new TextField("Text 2");
        private TextField t3 = new TextField("Text 3");
        MyFrame(){
            this.setSize(900,500);
            setVisible(true);
            setLocation(100,50);
            FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
            setLayout(layout);

            add(t1);
            add(t2);
            add(t3);


        } 
    }

