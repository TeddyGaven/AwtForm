
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

public class AwtForm extends Frame {  
  

protected static Object java;
public AwtForm() {

    addWindowListener (new WindowAdapter() {    
        public void windowClosing (WindowEvent e) {    
        System.exit(0); 
      }    
     }); 
    
Label firstName = new Label("Favourite genere");  
firstName.setBounds(20, 50, 100, 20);  
  
Color formColor = new Color(135, 206, 235);
setBackground(formColor);


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
  
Button reset = new Button("Next");  
reset.setBounds(150,330,100,30);  

sbmt.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
        Vector v = new Vector<>();
        Scanner sc = new Scanner(System.in);
                
            String a = Fav.getText();
            v.add("Favourite Composer = " + a);
        
            String b = firstNameTF.getText();
            v.add("Favourite genere = " + b);

            lastNameTF.setLabel("YES"); 
            Object c = lastNameTF.getSelectedObjects() ;
            v.add("Click YES = " + c);
            
            last.setLabel("NO"); 
            Object d = last.getSelectedObjects() ; 
            v.add("Click No = " + d);
        
            System.out.println("The entered info on page 3 is => ");
            System.out.println(v);
        
         }
 });


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
 
setTitle("Registration for Singing"); 
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtForm awt = new AwtForm();    
}  
}  