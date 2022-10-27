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

public class AwtApp extends Frame{  
  
/**
 * 
 */
public AwtApp() {
    
addWindowListener (new WindowAdapter() {    
   public void windowClosing (WindowEvent e) {    
   System.exit(0);  
 }    
}); 

Frame frame = new Frame("solo singing"); 

Label firstName = new Label("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
Label lastName = new Label("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  
Label dob = new Label("Date of Birth");  
dob.setBounds(20, 110, 80, 20);  

Color formColor = new Color(135, 206, 235);
setBackground(formColor);

Label WhatsAppno = new Label("Contact Info");
WhatsAppno.setBounds(20,140,80,20);

Label Past = new Label("Any past singing experience?");  
Past.setBounds(20, 170, 160, 20);  

Label PaSt = new Label("Yes");  
PaSt.setBounds(200, 170, 100, 20);  

Label PasT = new Label("No");  
PasT.setBounds(200, 190, 100, 20);  

Label year = new Label("Year");  
year.setBounds(20,240, 40, 20); 

Label branch = new Label("Branch");  
branch.setBounds(200,240, 40, 20); 

Label fe = new Label("FE");  
fe.setBounds(70, 230, 100, 20);  

Label se = new Label("SE");  
se.setBounds(70, 250, 100, 20);  

Label te = new Label("TE");  
te.setBounds(70, 270, 100, 20);  

Label be = new Label("BE");  
be.setBounds(70, 290, 100, 20);  


Label comp = new Label("COMPS");  
comp.setBounds(260, 230, 30, 20);  

Label it = new Label("IT");  
it.setBounds(260, 250, 30, 20);  

Label mech = new Label("MECH");  
mech.setBounds(260, 270, 35, 20);  

Label extc = new Label("EXTC");  
extc.setBounds(260, 290, 35, 20);  

TextField firstNameTF = new TextField();  
firstNameTF.setBounds(120, 50, 100, 20);  
  
TextField lastNameTF = new TextField();  
lastNameTF.setBounds(120, 80, 100, 20);  

TextField dobTF = new TextField();  
dobTF.setBounds(120, 110, 100, 20);  

TextField WhatsAppNo = new TextField();
WhatsAppNo.setBounds(120, 140, 100, 20);

Checkbox Year = new Checkbox();
Year.setBounds(100, 230, 100, 20);

Checkbox YEar = new Checkbox();
YEar.setBounds(100, 250, 100, 20);

Checkbox YeAr = new Checkbox();
YeAr.setBounds(100, 270, 100, 20);

Checkbox YeaR = new Checkbox();
YeaR.setBounds(100, 290, 100, 20);

Checkbox com = new Checkbox();
com.setBounds(300, 230, 100, 20);

Checkbox iT = new Checkbox();
iT.setBounds(300, 250, 100, 20);

Checkbox mec = new Checkbox();
mec.setBounds(300, 270, 100, 20);

Checkbox ext = new Checkbox();
ext.setBounds(300, 290, 100, 20);

Checkbox past = new Checkbox();
past.setBounds(300, 170, 100, 20);

Checkbox pAst = new Checkbox();
pAst.setBounds(300, 190, 100, 20);
  
Button sbmt = new Button("Submit");  
sbmt.setBounds(20, 330, 100, 30);  
  
Button reset = new Button("Next");  
reset.setBounds(150,330,100,30);  

sbmt.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent e) {
     Vector v = new Vector<>();
     Scanner sc = new Scanner(System.in);
             
         String a = WhatsAppNo.getText();
         v.add("contact info = " + a);
     
         String b = firstNameTF.getText();
         v.add("first name = " + b);

         String c = lastNameTF.getText() ;
         v.add("last name = " + c);

         String d = dobTF.getText() ;
         v.add("date of birth = " + d);
           
        Year.setLabel("FE"); 
        Object z = Year.getSelectedObjects() ;
        v.add("Click FE = " + z);
           
        YEar.setLabel("SE"); 
        Object f = YEar.getSelectedObjects() ;
        v.add("Click SE = " + f);

        YeAr.setLabel("TE"); 
        Object g = YeAr.getSelectedObjects() ;
        v.add("Click TE = " + g);

        YeaR.setLabel("BE"); 
        Object  h = YeaR.getSelectedObjects() ;
        v.add("Click BE = " + h);

        com.setLabel("COMPS"); 
        Object x = com.getSelectedObjects() ;
        v.add("Click COMPS = " + x);

        iT.setLabel("IT"); 
        Object y = iT.getSelectedObjects() ;
        v.add("Click IT = " + y);

        mec.setLabel("MECH"); 
        Object m = mec.getSelectedObjects() ;
        v.add("CLick MECH = " + m);

        ext.setLabel("EXTC"); 
        Object n = ext.getSelectedObjects() ;
        v.add("Click EXTC = " + n);

        past.setLabel("YES"); 
        Object o = past.getSelectedObjects() ;
        v.add("Click YES = " + o);

        pAst.setLabel("NO"); 
        Object p = pAst.getSelectedObjects() ;
        v.add("Click NO = " + p);

         System.out.println("The entered info on page 3 is => ");
         System.out.println(v);
     
      }
});


add(comp);
add(it);
add(mech);
add(extc);
add(ext);
add(mec);
add(com);
add(iT);
add(firstName);  
add(lastName);  
add(dob);  
add(firstNameTF);  
add(lastNameTF);  
add(dobTF);  
add(WhatsAppNo);
add(WhatsAppno);
add(past);
add(Past);
add(pAst);
add(PaSt);
add(PasT);
add(year);
add(Year);
add(YEar);
add(YeAr);
add(YeaR);
add(branch);
add(fe);
add(se);
add(be);
add(te);
add(sbmt);  
add(reset);  

   
setTitle("Registration for Singing"); 
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}

public static void main(String[] args) {  
AwtApp awt = new AwtApp(); 


}  
}
