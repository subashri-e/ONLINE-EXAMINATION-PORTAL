import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener{
    
    JLabel loginid,password;
    JTextField tflogin,tfpassword;
    JButton next,back;

    login(String name){

        ImageIcon icon = new ImageIcon("exid1.jpg");

        setBounds(270,65,1000,700);
        getContentPane().setBackground(new Color(255,255,223));
        setTitle("Exam Portal");
        setIconImage(icon.getImage());
        setLayout(null);

        loginid = new JLabel("Enter your login ID : ");
        loginid.setBounds(30,150,300,20);
        loginid.setFont(new Font("Times New Roman",Font.BOLD,20));
        loginid.setForeground(new Color(0,0,153));
        add(loginid);

        password = new JLabel("Enter your password : ");
        password.setBounds(30,250,300,20);
        password.setFont(new Font("Times New Roman",Font.BOLD,20));
        password.setForeground(new Color(0,0,153));
        add(password);

        tflogin = new JTextField();
        tflogin.setBounds(250,150,300,25);
        tflogin.setFont(new Font("Times New Roman",Font.BOLD,20));
        tflogin.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tflogin);

        tfpassword = new JTextField();
        tfpassword.setBounds(250,250,300,25);
        tfpassword.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfpassword);

        next = new JButton("NEXT");
        next.setBounds(280,350,100,30);
        next.addActionListener(this);
        add(next);

        back = new JButton("BACK");
        back.setBounds(400,350,100,30);
        back.addActionListener(this);
        add(back);

        setSize(600,550);
        setLocation(470,165);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== next){
            setVisible(false);
            String id = tflogin.getText();
            String password = tfpassword.getText();
            if(id.equals("userabc") && password.equals("test@123")){
                new rules(id);
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect loginID or Password !!", "Message", JOptionPane.ERROR_MESSAGE);
                new login("user");
            }   
        }
        else if(ae.getSource()== back){
            setVisible(false);
            new homepage();
        }
    }

    public static void main(String[] args) {
        new login("user");
        
    }
    
}