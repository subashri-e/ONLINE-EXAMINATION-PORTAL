import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class homepage extends JFrame implements ActionListener {

    JButton next,back;
    JTextField tfname;

    homepage() {

        ImageIcon icon = new ImageIcon("exid1.jpg");

        getContentPane().setBackground(new Color(255,255,223));
        setLayout(null);

        ImageIcon img = new ImageIcon("exam.png");
        JLabel image = new JLabel(img);
        image.setBounds(0,0,566,565);
        add(image);

        JLabel title = new JLabel("ONLINE TEST");
        title.setBounds(740,120,700,45);
        title.setFont(new Font("stencil",Font.BOLD,44));
        title.setForeground(new Color(0,0,153));
        add(title);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,200,300,20);
        name.setFont(new Font("Times New Roman",Font.BOLD,20));
        name.setForeground(new Color(0,0,153));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735,260,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        next = new JButton("NEXT");
        next.setBounds(735,310,120,25);
        next.addActionListener(this);
        add(next);

        back = new JButton("BACK");
        back.setBounds(915,310,120,25);
        back.addActionListener(this);
        add(back);
 
        setSize(1200,566);
        setTitle("Exam Portal");
        setIconImage(icon.getImage());
        setLocation(200,150);
        setVisible(true);  

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== next){
            setVisible(false);
            String name = tfname.getText();
            new login(name);
        }
        else if(ae.getSource()== back){
            setVisible(false);
        }
    }

    public static void main(String[] args){

        new homepage().setVisible(true);
    }

}