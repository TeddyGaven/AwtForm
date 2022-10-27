import java.awt.*;  
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.*;
import java.awt.event.*;

public class AwtLogin extends Frame {  
  

public AwtLogin() {

    addWindowListener (new WindowAdapter() {    
        public void windowClosing (WindowEvent e) {    
        System.exit(0);    
      }    
     }); 

Label firstName = new Label("E-Mail ID");  
firstName.setBounds(20, 150, 100, 20);  
  
Label lastName = new Label("Password");  
lastName.setBounds(20, 200, 100, 20);  

Color formColor = new Color(135, 206, 235);
setBackground(formColor);

TextField first = new TextField();
first.setBounds(150,150,200,20);

TextField sec = new TextField();
sec.setBounds(150,200,100,20);

Button sbmt = new Button("Register");  
sbmt.setBounds(20, 330, 100, 30);  
  
Button reset = new Button("Next");  
reset.setBounds(150,330,100,30);  

//reset.addActionListener(new ActionListener() {
  //  public void actionPerformed(ActionEvent e) {
    
   // }    
//});

add(firstName);  
add(lastName);  
add(first);
add(sec);
add(sbmt);  
add(reset);  

sbmt.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        Vector v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        
        String a = first.getText();
        v.add("E-mail ID = " + a);

        String b = sec.getText();
        v.add("Password = " + b);

        System.out.println("The Email-ID and Password is => ");
        System.out.println(v);

    }
});

setTitle("Registration for Singing"); 
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  

public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtLogin awt = new AwtLogin();    
}
}

