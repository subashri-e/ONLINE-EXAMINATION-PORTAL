import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends JFrame implements ActionListener{

    String name;
    JButton back,start;

    rules(String name){

        ImageIcon icon = new ImageIcon("exid1.jpg");

        this.name = name;
        getContentPane().setBackground(new Color(255,255,223));
        setTitle("Exam Portal");
        setIconImage(icon.getImage());
        setLayout(null);

        JLabel title = new JLabel("INSTRUCTIONS");
        title.setBounds(280,20,700,30);
        title.setFont(new Font("Times New Roman",Font.BOLD,28));
        title.setForeground(new Color(0,0,153));
        add(title);

        JLabel rule = new JLabel();
        rule.setBounds(20,70,900,450);
        rule.setFont(new Font("Times New Roman",Font.PLAIN,16));
        rule.setText("<html>"+
                "1. The quiz comprises ten questions, each formatted as multiple-choice."  + "<br><br>" +
                "2. The subject matter of the quiz pertains to Java programming." + "<br><br>" +
                "3. A time allocation of 15 seconds is provided for each question." + "<br><br>" +
                "4. Upon the expiration of the allocated time, the system will automatically proceed to the subsequent question. " + "<br><br>" +
                "5. The navigation interface features a \"Next\" button positioned in the right corner, facilitating progression to the <br> subsequent question upon activation." + "<br><br>" +
                "6. Upon reaching the ninth question, the \"Submit\" button becomes enabled, allowing for the submission of responses." + "<br><br>" +
                "7. Upon selection of the \"Next\" button to advance to the subsequent question, the system restricts the ability to return <br> to any previous questions." + "<br><br><br>" +
                "ALL THE BEST !!" + "<br><br>" +

            "<html>"
        );
        rule.setForeground(new Color(0,0,153));
        add(rule);

        start = new JButton("START");
        start.setBounds(250,500,100,30);
        start.addActionListener(this);
        add(start);

        back = new JButton("BACK");
        back.setBounds(400,500,100,30);
        back.addActionListener(this);
        add(back);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start){
            setVisible(false);
            new quiz(name);
        }
        else if(ae.getSource()== back){
            setVisible(false);
            new homepage();
        }
    }

    public static void main (String args[]){

        new rules("User");

    }

}