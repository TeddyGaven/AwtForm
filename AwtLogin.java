import java.awt.*;  
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener; 


public class AwtLogin extends Frame {  
  

public AwtLogin() {
Label firstName = new Label("E-Mail ID");  
firstName.setBounds(20, 150, 100, 20);  
  
Label lastName = new Label("Password");  
lastName.setBounds(20, 200, 100, 20);  

TextField first = new TextField();
first.setBounds(150,150,200,20);

TextField sec = new TextField();
sec.setBounds(150,200,100,20);

Button sbmt = new Button("Register");  
sbmt.setBounds(20, 330, 100, 30);  
  
Button reset = new Button("Reset");  
reset.setBounds(150,330,100,30);  


add(firstName);  
add(lastName);  
add(first);
add(sec);
add(sbmt);  
add(reset);  

setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtLogin awt = new AwtLogin();    
}  
}  