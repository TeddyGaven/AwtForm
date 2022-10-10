import java.awt.*;  
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener; 


public class AwtApp extends Frame {  
  
public AwtApp() {

   

Frame frame = new Frame("solo singing"); 

    
Label firstName = new Label("First Name");  
firstName.setBounds(20, 50, 80, 20);  
  
Label lastName = new Label("Last Name");  
lastName.setBounds(20, 80, 80, 20);  
  
Label dob = new Label("Date of Birth");  
dob.setBounds(20, 110, 80, 20);  

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
  
Button reset = new Button("Reset");  
reset.setBounds(150,330,100,30);  

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
  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
AwtApp awt = new AwtApp();    
}  
}  
