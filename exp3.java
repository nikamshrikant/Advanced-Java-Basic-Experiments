import java.awt.*;
import java.awt.event.*;
public class exp3 extends Frame implements ActionListener
{
    Button btnRed,btnBlue;
    exp3()
    {
        super ("AWT Buttons");
        
        btnRed = new Button ("Red");
        btnBlue=new Button("Blue");
        btnRed.setBounds(25,50,250,30);
        btnRed.addActionListener(this);
        this.add(btnRed);
        this.add(btnBlue);
        this.setSize(300,160);
        this.setLayout(null);
        this.setVisible(true);
        btnBlue.addActionListener(this);
        btnBlue.setBounds(25, 100, 250, 30);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
              dispose();
            }
        });
    }
    public static void main(String[] args)
    {
        new exp3();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource() == btnRed)
       {
        this.setBackground(Color.RED);
       }
       else if(e.getSource() == btnBlue)
       {
        this.setBackground(Color.BLUE);
       }
    } 
}