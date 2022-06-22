import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Puzzle extends JFrame implements ActionListener{
    JButton button1,button2,button3,button4,next;
    Puzzle(){
        super("Puzzle Game - JavaTpoint");
        button1=new JButton("1");
        button2=new JButton(" ");
        button3=new JButton("3");
        button4=new JButton("2");
        //next=new JButton("next");


        button1.setBounds(10,30,50,40);
        button2.setBounds(70,30,50,40);
        button3.setBounds(10,80,50,40);
        button4.setBounds(70,80,50,40);
        //next.setBounds(70,200,100,40);

        add(button1);add(button2);add(button3);add(button4); //add(next);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        //next.addActionListener(this);

        //next.setBackground(Color.black);
        //next.setForeground(Color.green);
        setSize(250,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){



        if(e.getSource()==button1){
            String s=button1.getLabel();
            if(button2.getLabel().equals(" ")){ button2.setLabel(s); button1.setLabel(" ");}
            else if(button3.getLabel().equals(" ")){ button3.setLabel(s); button1.setLabel(" ");}
        }


        if(e.getSource()==button2){
            String s=button2.getLabel();
            if(button1.getLabel().equals(" ")){ button1.setLabel(s); button2.setLabel(" ");}
            else if(button4.getLabel().equals(" ")){ button4.setLabel(s); button2.setLabel(" ");}
        }

        if(e.getSource()==button3){
            String s=button3.getLabel();
            if(button1.getLabel().equals(" ")){ button1.setLabel(s); button3.setLabel(" ");}
            else if(button4.getLabel().equals(" ")){ button4.setLabel(s); button3.setLabel(" ");}
        }

        if(e.getSource()==button4){
            String s=button4.getLabel();
            if(button2.getLabel().equals(" ")){ button2.setLabel(s); button4.setLabel(" ");}
            else if(button3.getLabel().equals(" ")){ button3.setLabel(s); button4.setLabel(" ");}
        }

        if(button1.getLabel().equals("1")&&button2.getLabel().equals("2")&&button3.getLabel()
                .equals("3")&&button4.getLabel().equals(" ")){

            JOptionPane.showMessageDialog(Puzzle.this,"You won!");
            next=new JButton("next");
            next.setBounds(70,200,100,40);
            add(next);
            next.addActionListener(this);
            next.setBackground(Color.gray);
            next.setForeground(Color.CYAN);

        }
        if(e.getSource()==next){

            Puzzle2 P2 = new Puzzle2();
            P2.setVisible(true);

        }

    }

    public static void main(String[] args){
        new Puzzle();
    }

}