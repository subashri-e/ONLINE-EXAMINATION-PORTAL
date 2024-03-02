import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class score extends JFrame implements ActionListener {

    score(String name,int score){

        ImageIcon icon = new ImageIcon("exid1.jpg");

        setBounds(400,150,750,550);
        getContentPane().setBackground(new Color(255,255,223));
        setTitle("Exam Portal");
        setIconImage(icon.getImage());
        setLayout(null);
        
        Border border = BorderFactory.createLineBorder(Color.BLACK,2);
        ImageIcon img2 = new ImageIcon("result1.jpg");
        JLabel qimage = new JLabel(img2);
        qimage.setBounds(60,150,256,279);
        qimage.setBorder(border);
        add(qimage);

        JLabel heading = new JLabel("RESULTS !!");
        heading.setBounds(100,70,700,35);
        heading.setFont(new Font("Times New Roman",Font.PLAIN,35));
        heading.setForeground(new Color(0,0,153));
        add(heading);


        JLabel result = new JLabel("Your Score : "+score+" out of 10");
        result.setBounds(370,200,300,30);
        result.setFont(new Font("Times New Roman",Font.PLAIN,26));
        result.setForeground(new Color(0,0,153));
        add(result);

        JButton back = new JButton("TRY AGAIN");
        back.setBounds(415,300,140,30);
        back.setFont(new Font ("Times New Roman",Font.BOLD,17));
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new homepage();

    }
    
    public static void main(String[] args) {
        new score("User",0);
        
    }
    
}
