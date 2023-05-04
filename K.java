//video 10 button create

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Color;

class K extends Frame{
Button b1; Button b2;

    public K(){
    setSize(600,300);
    setVisible(true);
    setLayout(new FlowLayout());

    b1 = new Button("click me !");
    b1.addActionListener(new MyActionListener());
    add(b1);


}
public static void main(String[] args){
    K k = new K();


}
}


class MyActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Button clicked");
    }


}




