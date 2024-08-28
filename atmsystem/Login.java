package atmsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton login,clear;
    JTextField cardtextfield;
    JPasswordField pinnoField;

    Login()
    {
        setLayout(null);
        setTitle("ATM");
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        JLabel text=new JLabel("Welcome to ATM! ");
        text.setFont(new Font("Osward", Font.BOLD, 32));
        text.setBounds(250,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card No: ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 32));
        cardno.setBounds(150,150,150,40);
        add(cardno);
        cardtextfield =new JTextField();
        cardtextfield.setBounds(320,150,250,40);
        add(cardtextfield);

        JLabel pin =new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 32));
        pin.setBounds(150,220,250,40);
        add(pin);
        pinnoField =new JPasswordField();
        pinnoField.setBounds(320,220,250,40);
        add(pinnoField);
        
        login=new JButton("ENTER");
        login.setBounds(320,300,100,30);
        login.setBackground(Color.blue);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        getContentPane().setBackground(Color.WHITE);

        clear=new JButton("CLEAR");
        clear.setBounds(470,300,100,30);
        clear.setBackground(Color.blue);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);


        getContentPane().setBackground(Color.WHITE);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == clear)
        {
            cardtextfield.setText("");
            pinnoField.setText("");
        }
        else if(ae.getSource()== login)
        {

        }
    }
    public static void main(String args[])
    {
        Login l1=new Login();

    }
}