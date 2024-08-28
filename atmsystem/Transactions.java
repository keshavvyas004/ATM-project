package atmsystem;
import javax.swing.*;
import java.awt.*;
public class Transactions extends JFrame 
{
    Transactions()
    {
        setLayout(null);
       /*ImageIcon i1=new ImageIcon(getClass().getSystemResource("/icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(0,0,900,900);*/
        ImageIcon atmIcon = new ImageIcon("src/icons/atm.jpg");
        JLabel imageLabel = new JLabel(atmIcon);
        add(imageLabel);
        imageLabel.setBounds(0, 0, 900, 900);

        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,14));
        imageLabel.add(text);

        JButton deposit =new JButton("Deposit");
        deposit.setBounds(170,410,150,32);
        imageLabel.add(deposit);

        JButton withdrawl =new JButton("Cash Withdrawl");
        withdrawl.setBounds(355,410,150,32);
        imageLabel.add(withdrawl);

        JButton fastcash =new JButton("Fast Cash");
        fastcash.setBounds(170,452,150,32);
        imageLabel.add(fastcash);

        JButton ministatement =new JButton("Mini Statement");
        ministatement.setBounds(355,452,150,32);
        imageLabel.add(ministatement);

        JButton pinchange =new JButton("Pin Change");
        pinchange.setBounds(170,493,150,32);
        imageLabel.add(pinchange);

        setSize(900,900);
        setLocation(300,0);
        //setUndercorated(true);
        setVisible(true);

    }
    public static void main(String []args)
    {
        new Transactions();
    }
}
