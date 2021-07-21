
import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;  
public class IP_Finder extends JFrame implements ActionListener{  
    JLabel l;  
    JTextField tf;  
    JButton b;  
IP_Finder(){  
    //super("IP Finder Tool - Javatpoint");  
    //super("IP Finder Tool - W3SCHOOL.COM");  
   // super("IP Finder Tool - GOOGLE.COM");  
   // super("IP Finder Tool - sololearn.com");  
    super("IP Finder Tool -youtube.com");  
    
    
    	
    
    // create label
    l=new JLabel("Enter URL:");  
    l.setBounds(50,70,150,20);
    
    //create textfield
    tf=new JTextField();  
    tf.setBounds(50,100,200,20);  
    
  //create button
    b=new JButton("Find IP");  
    b.setBounds(50,150,80,30);  
    b.addActionListener(this);  
    
    //adding component in the frame
    add(l);  
    add(tf);  
    add(b);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
    String url=tf.getText();  
    try {  
        InetAddress ia=InetAddress.getByName(url);  
        String ip=ia.getHostAddress();  
        JOptionPane.showMessageDialog(this,ip);  
    } catch (UnknownHostException e1) {  
        JOptionPane.showMessageDialog(this,e1.toString());  
    }  
}  
public static void main(String[] args) {  
    new IP_Finder();  
}  
}  


