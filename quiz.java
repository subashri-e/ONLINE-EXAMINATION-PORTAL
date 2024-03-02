import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class quiz extends JFrame implements ActionListener{

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userans[][] = new String[10][1];
    String name;

    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup group;
    JButton next,submit;

    public static int timer = 15;
    public static int ans=0;
    public static int count=0;
    public static int score=0;

    quiz(String name){

        ImageIcon icon = new ImageIcon("exid1.jpg");
        this.name=name;

        setBounds(270,65,1000,700);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Exam Portal");
        setIconImage(icon.getImage());
        setLayout(null);

        ImageIcon img2 = new ImageIcon("examimg1.jpg");
        JLabel qimage = new JLabel(img2);
        qimage.setBounds(0,0,1000,250);
        add(qimage);

        qno = new JLabel();
        qno.setBounds(20,320,50,30);
        qno.setFont(new Font("Times New Roman",Font.PLAIN,24));
        add(qno);

        question = new JLabel();
        question.setBounds(50,320,800,30);
        question.setFont(new Font("Times New Roman",Font.PLAIN,24));
        add(question);

        questions[0][0] = "What is the size of the int data type in Java?";
        questions[0][1] = " 8 bits";
        questions[0][2] = "16 bits";
        questions[0][3] = "32 bits";
        questions[0][4] = "64 bits";

        questions[1][0] = "Which of the following statements is true about the StringBuilder class in Java?";
        questions[1][1] = "It is immutable";
        questions[1][2] = "It is synchronized";
        questions[1][3] = "It is mutable";
        questions[1][4] = "It cannot be used for string manipulation";

        questions[2][0] = "What does the static keyword in Java signify?";
        questions[2][1] = "The method can be called without creating an instance of the class.";
        questions[2][2] = "Variables and methods are local to a block of code.";
        questions[2][3] = "The method or variable belongs to the class, rather than instances of it.";
        questions[2][4] = "The method cannot be overridden in any subclass.";

        questions[3][0] = "What is the default value of a boolean variable in Java?";
        questions[3][1] = "true";
        questions[3][2] = "false";
        questions[3][3] = "0";
        questions[3][4] = "null";

        questions[4][0] = "Which of the following is true about the final keyword in Java?";
        questions[4][1] = "A final class cannot be subclassed.";
        questions[4][2] = "A final method cannot be overridden by subclasses.";
        questions[4][3] = "A final variable can only be initialized once.";
        questions[4][4] = "All of the above";

        questions[5][0] = "In Java, which keyword is used for creating a constant variable?";
        questions[5][1] = "final";
        questions[5][2] = "const";
        questions[5][3] = "static";
        questions[5][4] = "final and static";

        questions[6][0] = "What is the purpose of the break statement in Java?";
        questions[6][1] = "To exit a loop or switch statement.";
        questions[6][2] = "To skip the current iteration of a loop.";
        questions[6][3] = "To terminate the program.";
        questions[6][4] = "A and B";

        questions[7][0] = "What is the purpose of the super keyword in Java?";
        questions[7][1] = "To call the superclass constructor.";
        questions[7][2] = "To access the superclass members.";
        questions[7][3] = "Both A and B";
        questions[7][4] = "None of the above";

        questions[8][0] = "What is the purpose of the finalize() method in Java?";
        questions[8][1] = "To forcibly terminate the program.";
        questions[8][2] = "To clean up resources before an object is garbage-collected.";
        questions[8][3] = "To release memory occupied by an object before it is destroyed.";
        questions[8][4] = "To define the 'final' value of a constant variable.";

        questions[9][0] = "Which of the following statements about the this keyword in Java is correct?";
        questions[9][1] = "It refers to the current instance of the superclass.";
        questions[9][2] = "It is used to create a 'new' object.";
        questions[9][3] = "It refers to the current instance of the class.";
        questions[9][4] = "It is used to call a method in another class.";

        answers[0][1] = "32 bits";
        answers[1][1] = "It is mutable";
        answers[2][1] = "The method or variable belongs to the class, rather than instances of it.";
        answers[3][1] = "false";
        answers[4][1] = "All of the above";
        answers[5][1] = "const";
        answers[6][1] = "A and B";
        answers[7][1] = "Both A and B";
        answers[8][1] = "To release memory occupied by an object before it is destroyed.";
        answers[9][1] = "It refers to the current instance of the class.";

        opt1 = new JRadioButton ();
        opt1.setBounds(50,400,680,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font ("Arial",Font.PLAIN,20));
        add(opt1);

        opt2 = new JRadioButton ();
        opt2.setBounds(50,450,680,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font ("Arial",Font.PLAIN,20));
        add(opt2);

        opt3 = new JRadioButton ();
        opt3.setBounds(50,500,680,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font ("Arial",Font.PLAIN,20));
        add(opt3);

        opt4 = new JRadioButton ();
        opt4.setBounds(50,550,680,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font ("Arial",Font.PLAIN,20));
        add(opt4);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        next = new JButton("NEXT");
        next.setBounds(760,425,200,40);
        next.setFont(new Font ("Times New Roman",Font.PLAIN,22));
        next.addActionListener(this);
        add(next);

        submit = new JButton("SUBMIT");
        submit.setBounds(760,505,200,40);
        submit.setFont(new Font ("Times New Roman",Font.PLAIN,22));
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        start(count);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans=1;
            if (group.getSelection()==null){
                userans[count][0]="";
            }else {
                userans[count][0]=group.getSelection().getActionCommand();
            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){

            }
            count++;
            start(count);
        }

        else if(ae.getSource()== submit){
            ans=1;
            if (group.getSelection()==null){
                userans[count][0]="";
            }else {
                userans[count][0]=group.getSelection().getActionCommand();
            }  
            for(int i=0;i<userans.length;i++){
                if(userans[i][0].equals(answers[i][1])){
                    score+=1;
                }else{
                    score+=0;
                }

            }
            setVisible(false);
            new score(name,score);

        }
    }

    public void paint(Graphics g){
        super.paint(g);

        String time = "Time Left : "+timer+" seconds";
        g.setColor(new Color(0,0,153));
        g.setFont(new Font("Tahoma",Font.BOLD,20));

        if (timer>0){
            g.drawString(time,755,320);
        }
        else{
            g.drawString("Times up !!",755,320);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }

        if(ans==1){
            ans=0;
            timer =15;
        }
        else if(timer<0){
            timer=15;
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){ //autosubmit
                if (group.getSelection()==null){
                    userans[count][0]="";
                }else {
                    userans[count][0]=group.getSelection().getActionCommand();
                }  
                for(int i=0;i<userans.length;i++){
                    if(userans[i][0].equals(answers[i][1])){
                        score+=1;
                    }else{
                        score+=0;
                    }
                }
                setVisible(false);
                new score(name,score);
            }else{ //next qn
                if (group.getSelection()==null){
                    userans[count][0]="";
                }else {
                    userans[count][0]=group.getSelection().getActionCommand();
                }
            }
            count++;
            start(count);
        }
    }

    public void start(int count){

        qno.setText("" + (count+1) +".");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        group.clearSelection();
        
    }
    
    public static void main (String args[]){

        new quiz("User");

    }
    
}
