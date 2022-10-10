import java.awt.*;  
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener; 


public class AwtForm extends Frame {  
  

public AwtForm() {
Label firstName = new Label("Favourite genere");  
firstName.setBounds(20, 50, 100, 20);  
  
Label lastName = new Label("Can you play any instrument");  
lastName.setBounds(20, 80, 150, 20);  
  
Label dOb = new Label("Yes");
dOb.setBounds(200,80,50 ,20);  

Label doB = new Label("No");  
doB.setBounds(200, 100, 50, 20);  

Label fav = new Label("Favourite Composer");  
fav.setBounds(20, 130, 120, 20);

TextField Fav = new TextField();  
Fav.setBounds(150, 130, 100, 20);  

TextField firstNameTF = new TextField();  
firstNameTF.setBounds(130, 50, 100, 20);  
  
Checkbox lastNameTF = new Checkbox();  
lastNameTF.setBounds(250, 80, 100, 20);  

Checkbox last = new Checkbox();  
last.setBounds(250,100,100,20);



Button sbmt = new Button("Submit");  
sbmt.setBounds(20, 330, 100, 30);  
  
Button reset = new Button("Reset");  
reset.setBounds(150,330,100,30);  


add(firstName);  
add(lastName);  
add(firstNameTF);  
add(lastNameTF);   
add(fav);
add(Fav);
add(dOb);
add(doB);
add(sbmt);  
add(reset);  
add(last);
  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtForm awt = new AwtForm();    
}  
}  