//video 9
 import java.awt.Frame;
 import java.awt.TextField;
 import java.awt.FlowLayout;

 class I extends Frame{
    public static void main(String[] args){
        new I();

    }
    public I(){
        setVisible(true);
        setSize(600,300);
        setLayout(new FlowLayout());
        TextField tf = new TextField("java");
        
        add(tf);
        // tf.setEditable(false);
        // System.out.println(tf.isEditable());
        tf.setText("awt example");
        System.out.println("text is"+tf.getText());
        

    }
 }