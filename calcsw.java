import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calcsw implements ActionListener {
    static JLabel lb;
    static JTextField tf1;
    static JButton b1, b2, b3, b4,b11,b12,b13,b14,b5,b6,b7,b8,b9,b0,be,bc,bm;
    static int op ;
    public static void main(String[] args) {
        
        JFrame fr = new JFrame("SWING CALCULATOR");
        fr.setLayout(null);
        tf1 = new JTextField();
        tf1.setBounds(100, 100, 230, 30); 
        b1 = new JButton("+");
        b1.setBounds(280, 150, 50, 30);
        b2 = new JButton("-");
        b2.setBounds(280, 190, 50, 30);
        b3 = new JButton("*");
        b3.setBounds(280, 230,50, 30);
        b4 = new JButton("/");
        b4.setBounds(280, 270, 50, 30);
        b11 = new JButton("1");
        b11.setBounds(100, 150, 50, 30);
        b12 = new JButton("2");
        b12.setBounds(160, 150, 50, 30);
        b13 = new JButton("3");
        b13.setBounds(220, 150, 50, 30);
        b14 = new JButton("4");
        b14.setBounds(100, 190, 50, 30);
        b5 = new JButton("5");
        b5.setBounds(160, 190, 50, 30);
        b6 = new JButton("6");
        b6.setBounds(220, 190, 50, 30);
        b7 = new JButton("7");
        b7.setBounds(100, 230, 50, 30);
        b8 = new JButton("8");
        b8.setBounds(160, 230, 50, 30);
        b9 = new JButton("9");
        b9.setBounds(220, 230, 50, 30);
        bm = new JButton("%");
        bm.setBounds(100, 270, 50, 30);
        be = new JButton("=");
        be.setBounds(160, 270, 50, 30);
        bc = new JButton("C");
        bc.setBounds(220, 270, 50, 30);
        b0 = new JButton("0");
        b0.setBounds(100, 310, 230, 30);

        b1.addActionListener(new calcsw());
        b2.addActionListener(new calcsw());
        b3.addActionListener(new calcsw());
        b4.addActionListener(new calcsw());
        b11.addActionListener(new calcsw());
        b12.addActionListener(new calcsw());
        b13.addActionListener(new calcsw());
        b14.addActionListener(new calcsw());
        b5.addActionListener(new calcsw());
        b6.addActionListener(new calcsw());
        b7.addActionListener(new calcsw());
        b8.addActionListener(new calcsw());
        b9.addActionListener(new calcsw());
        be.addActionListener(new calcsw());
        bc.addActionListener(new calcsw());
        b0.addActionListener(new calcsw());
        bm.addActionListener(new calcsw());

        fr.add(tf1);
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
        fr.add(b11);
        fr.add(b12);
        fr.add(b13);
        fr.add(b14);
        fr.add(b5);
        fr.add(b6);
        fr.add(b7);
        fr.add(b8);
        fr.add(b9);
        fr.add(b0);
        fr.add(bc);
        fr.add(be);
        fr.add(bm);
        fr.setVisible(true);
        fr.setSize(750, 750);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) throws NullPointerException {
        String x ,a,b; 
        double r;
        int  r1,r2 , i;
        if(e.getSource() == b1){
        op = 1;
        x=tf1.getText();
        tf1.setText(x+"+");     
        }        
        else if(e.getSource() == b2){                                                              
            x=tf1.getText();
            tf1.setText(x+"-");
            op = 2;  
        }
        else if(e.getSource() == b3)       {
            x=tf1.getText();
            tf1.setText(x+"*");
            op = 3;
         }
        else if(e.getSource() == b4)       {
            x=tf1.getText();
            tf1.setText(x+"/");
            op = 4; 
       }
       else if(e.getSource() == bm)      {
        x=tf1.getText();
        tf1.setText(x+"%");
        op = 5; 
       }
       else if(e.getSource() == b11){
        x=tf1.getText();
        tf1.setText(x+"1");
       }
       else if(e.getSource() == b12){
        x=tf1.getText();
        tf1.setText(x+"2");
    }
    else if(e.getSource() == b13){
        x=tf1.getText();
        tf1.setText(x+"3");
    }
    else if(e.getSource() == b14){
         x=tf1.getText();
        tf1.setText(x+"4");
    }
    else if(e.getSource() == b5){
        x=tf1.getText();
        tf1.setText(x+"5");
    }
    else if(e.getSource() == b6){
        x=tf1.getText();
        tf1.setText(x+"6");
    }
    else if(e.getSource() == b7){
        x=tf1.getText();
        tf1.setText(x+"7");
    }
    else if(e.getSource() == b8){
        x=tf1.getText();
        tf1.setText(x+"8");
    }
    else if(e.getSource() == b9){
        x=tf1.getText();
        tf1.setText(x+"9");
    }
    else if(e.getSource() == b0){
        x=tf1.getText();
        tf1.setText(x+"0");
    }
    else if(e.getSource() == bc){
        x=tf1.getText();
        x="";
        tf1.setText(x);
    }
    else if(e.getSource() == be){
        x=tf1.getText();
        int l = x.length();
        switch(op){
        case 1: 
        i=  x.indexOf("+");
        a = x.substring(0, i);
        b = x.substring(i+1,l );
        r1 = Integer.parseInt(a);
        r2 = Integer.parseInt(b);
        r = r1+r2;
        tf1.setText(String.valueOf(r));
        break;
        case 2:
            i =  x.indexOf("-");
            a = x.substring(0, i);
            b = x.substring(i+1,l );
            r1 = Integer.parseInt(a);
            r2 = Integer.parseInt(b);
            r = r1-r2;
            tf1.setText(String.valueOf(r));
            break;
        case 3:
            i = x.indexOf("*");
            a = x.substring(0, i);
            b = x.substring(i+1,l );
            r1 = Integer.parseInt(a);
            r2 = Integer.parseInt(b);
            r= r1*r2;
            tf1.setText(String.valueOf(r));
            break;
        case 4:
            i = x.indexOf("/");
            a = x.substring(0, i);
            b = x.substring(i+1,l );
            r1 = Integer.parseInt(a);
            r2 = Integer.parseInt(b);
            try{
                r = (double)r1/r2;
                tf1.setText(String.valueOf(r));
            }
            catch(ArithmeticException ae){
                if(r2 == 0)
                tf1.setText("Division by zero");
            }
            break;
        case 5:
            i = x.indexOf("%");
            a = x.substring(0, i);
            b = x.substring(i+1,l );
            r1 = Integer.parseInt(a);
            r2 = Integer.parseInt(b);
            r = r1%r2;
            tf1.setText(String.valueOf(r));
            break;
            }       
        }              
    }
}
