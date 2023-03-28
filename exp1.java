import java.awt.*;
import java.awt.event.*;
class exp1 extends Frame implements MouseListener{Label l;
exp1(){
    super("AWT Frame "); l = new Label();
    l.setBounds(25,60,250,30);
    l.setAlignment(Label.CENTER); this.add(l);
    this.setSize(300,300); this.setLayout(null);
    this.setVisible(true);
    this.addMouseListener(this);
    this.addWindowListener(new WindowAdapter(){public void 
      windowClosing(WindowEvent e){
        dispose();
      }
    });

}
public static void main(String[] args){new exp1();
}
@Override
public void mouseClicked(MouseEvent e){

}
@Override
public void mousePressed(MouseEvent e){
   l.setText("Mouse Clicked");
}

@Override
public void mouseReleased(MouseEvent e){

}

@Override
public void mouseEntered(MouseEvent e){
  l.setText("Mouse Entered");
}

@Override
public void mouseExited(MouseEvent e){
    l.setText("Mouse Exited");
}
}


