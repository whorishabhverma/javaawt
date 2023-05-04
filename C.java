import java.awt.Frame;
import java.awt.Color;

class C{
    public static void main(String[] args){
        Frame f = new Frame();
        f.setSize(600,500);
        f.setVisible(true);
        // f.setLocation(50,100);
        // f.setBounds(100,200,700,500);
        f.setBackground(Color.BLUE);
        f.resize(1000,200);
        boolean b = f.isVisible();
        System.out.println(b);
    }
}