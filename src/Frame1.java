import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame1 extends JFrame {
    private JTextField inputForDatabase;
    private JRadioButton idNumber, phoneNumber;
    private ButtonGroup radioGroup;
    private JButton getInput;
    private JLabel title;
    Frame1(){
    	super("Hijli Co-operative Society");
    	title=new JLabel("Hijli Co-operative Society", JLabel.CENTER);
    	idNumber= new JRadioButton("Id Number");
    	phoneNumber=new JRadioButton("Phone Number");
    	radioGroup=new ButtonGroup();
    	radioGroup.add(idNumber);
    	radioGroup.add(phoneNumber);
        inputForDatabase=new JTextField(10);
        //getInput;
        
        this.setSize(250,200);
        this.setLayout( new FlowLayout());
    	this.add(title);
        this.add(idNumber);
        this.add(phoneNumber);
        this.add(inputForDatabase);

     //  String input=inputForDatabase.getText();
        
     //   this.setVisible(true);
    }
}