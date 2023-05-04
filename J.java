//video 10 button

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

class J extends Frame{
Button b1; Button b2;

    public J(){
    setSize(600,300);
    setVisible(true);
    setLayout(new FlowLayout());

    b1 = new Button();
    b2 = new Button("signup");

    

    b1.setLabel("label setted by method");


    String label= b1.getLabel();
    System.out.println(label);
    b1.setPreferredSize(new Dimension(200,100));//button size increased
    b1.setBackground(Color.YELLOW);
    b1.setForeground(Color.RED);
    b1.setEnabled(false);//disable button 1
    // b1.setVisible(false); nhi dikhegi
    // b1.show(false);
    
    add(b1);
    add(b2);


}
public static void main(String[] args){
    J j = new J();


}
}


