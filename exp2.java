import java.awt.*;
import java.awt.event.*;
 class exp2 extends Frame{
  Label l;
  exp2(){
    super("AWT Pink");
    l=new Label("This is label");
    l.setBounds(25,50,250,30);
    l.setAlignment(Label.CENTER);
    this.add(l);
    this.setSize(300,100);
    this.setLayout(null);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){

        }
    });
  }
  public static void main(String[] args)
  {
    new exp2();
  }

}