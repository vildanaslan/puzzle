import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Puzzle2 extends JFrame implements ActionListener{
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,next;
    Puzzle2(){
        super("Puzzle2 Game - JavaTpoint");
        button1=new JButton("1");
        button2=new JButton(" ");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("2");
        next=new JButton("next");

        button1.setBounds(10,30,50,40);
        button2.setBounds(70,30,50,40);
        button3.setBounds(130,30,50,40);
        button4.setBounds(10,80,50,40);
        button5.setBounds(70,80,50,40);
        button6.setBounds(130,80,50,40);
        button7.setBounds(10,130,50,40);
        button8.setBounds(70,130,50,40);
        button9.setBounds(130,130,50,40);
        next.setBounds(70,200,100,40);

        add(button1);add(button2);add(button3);add(button4);add(button5);add(button6);add(button7);add(button8);add(button9); add(next);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        next.addActionListener(this);

        next.setBackground(Color.black);
        next.setForeground(Color.green);
        setSize(250,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        /*if(e.getSource()==next){
            String s=button4.getLabel();
            button4.setLabel(button9.getLabel());
            button9.setLabel(s);
            s=button1.getLabel();
            button1.setLabel(button5.getLabel());
            button5.setLabel(s);
            s=button2.getLabel();
            button2.setLabel(button7.getLabel());
            button7.setLabel(s);
        }*/
        if(e.getSource()==button1){
            String s=button1.getLabel();
            if(button2.getLabel().equals(" ")){ button2.setLabel(s); button1.setLabel(" ");}
            else if(button4.getLabel().equals(" ")){ button4.setLabel(s); button1.setLabel(" ");}
        }

        if(e.getSource()==button3){
            String s=button3.getLabel();
            if(button2.getLabel().equals(" ")){ button2.setLabel(s); button3.setLabel(" ");}
            else if(button6.getLabel().equals(" ")){ button6.setLabel(s); button3.setLabel(" ");}
        }

        if(e.getSource()==button2){
            String s=button2.getLabel();
            if(button1.getLabel().equals(" ")){ button1.setLabel(s); button2.setLabel(" ");}
            else if(button3.getLabel().equals(" ")){ button3.setLabel(s); button2.setLabel(" ");}
            else if(button5.getLabel().equals(" ")){ button5.setLabel(s); button2.setLabel(" ");}
        }
        if(e.getSource()==button4){
            String s=button4.getLabel();
            if(button1.getLabel().equals(" ")){ button1.setLabel(s); button4.setLabel(" ");}
            else if(button7.getLabel().equals(" ")){ button7.setLabel(s); button4.setLabel(" ");}
            else if(button5.getLabel().equals(" ")){ button5.setLabel(s); button4.setLabel(" ");}
        }

        if(e.getSource()==button5){
            String s=button5.getLabel();
            if(button2.getLabel().equals(" ")){ button2.setLabel(s); button5.setLabel(" ");}
            else if(button4.getLabel().equals(" ")){ button4.setLabel(s); button5.setLabel(" ");}
            else if(button6.getLabel().equals(" ")){ button6.setLabel(s); button5.setLabel(" ");}
            else if(button8.getLabel().equals(" ")){ button8.setLabel(s); button5.setLabel(" ");}
        }

        if(e.getSource()==button6){

            String s=button6.getLabel();
            if(button9.getLabel().equals(" ")){ button9.setLabel(s); button6.setLabel(" ");}
            else if(button3.getLabel().equals(" ")){ button3.setLabel(s); button6.setLabel(" ");}
            else if(button5.getLabel().equals(" ")){ button5.setLabel(s); button6.setLabel(" ");}

        }

        if(e.getSource()==button7){
            String s=button7.getLabel();
            if(button4.getLabel().equals(" ")){ button4.setLabel(s); button7.setLabel(" ");}
            else if(button8.getLabel().equals(" ")){ button8.setLabel(s); button7.setLabel(" ");}

        }

        if(e.getSource()==button8){
            String s=button8.getLabel();
            if(button7.getLabel().equals(" ")){ button7.setLabel(s); button8.setLabel(" ");}
            else if(button9.getLabel().equals(" ")){ button9.setLabel(s); button8.setLabel(" ");}
            else if(button5.getLabel().equals(" ")){ button5.setLabel(s); button8.setLabel(" ");}

        }

        if(e.getSource()==button9){
            String s=button9.getLabel();
            if(button6.getLabel().equals(" ")){ button6.setLabel(s); button9.setLabel(" ");}
            else if(button8.getLabel().equals(" ")){ button8.setLabel(s); button9.setLabel(" ");}

            if(button1.getLabel().equals("1")&&button2.getLabel().equals("2")&&button3.getLabel()
                    .equals("3")&&button4.getLabel().equals("4")&&button5.getLabel().equals("5")
                    &&button6.getLabel().equals("6")&&button7.getLabel().equals("7")&&button8.getLabel()
                    .equals("8")&&button9.getLabel().equals(" ")){
                JOptionPane.showMessageDialog(Puzzle2.this,"You won!");
            }
        }

    }


    public static void main(String[] args){
        new Puzzle2();
    }

}