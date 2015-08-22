import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Frame2 extends JFrame {
	
	final DefaultListModel model = new DefaultListModel();
	final JList list = new JList(model);
	JLabel title, userType;
	public void addToMemberModel(){
		model.addElement("Land Rental");
		model.addElement("Water Charges");
		model.addElement("Water Supply");
		model.addElement("Develpoment Tax");
		model.addElement("Admission Fee");
		model.addElement("Share Money");
		model.addElement("Mutation Fee");
		model.addElement("Survy Cost");
		model.addElement("Suspense");
	}
	
	public void addToNonMemberModel(){
		model.addElement("Water Charges");
		model.addElement("Water Supply");
		model.addElement("Develpoment Tax");
	}
	
	public void addToShopkeeperModel(){
		model.addElement("License Fee");
		model.addElement("Electricity Charges");
		model.addElement("Donation");
		model.addElement("Security Deposit");
	}
	
	public void addToOtherModel(){
		model.addElement("Burning Ghar Certificate");
		model.addElement("Community Hall Maintenance");
		model.addElement("Guest House Maintenance");
		model.addElement("Stationery and Printing");
		model.addElement("Conservancy/Garbage cleaning");
		model.addElement("Collection from cremation ground");
		model.addElement("Earnest Money Deposit");
		model.addElement("Collection from library");
		model.addElement("Advance recoup");
		model.addElement("Arrear dues");
		}
	
	Frame2(String type){
	  	super("Hijli Co-operative Society");
    	title = new JLabel("Hijli Co-operative Society", JLabel.CENTER);
    	userType=new JLabel(type, JLabel.CENTER);
		ArrayList<String> chargeType = new ArrayList<String>();
		if(type=="Member"){
			addToMemberModel();			
		}
		else if(type=="Non-Member"){
			addToNonMemberModel();
		}
		else if(type=="Shopkeeper"){
			addToShopkeeperModel();
		}
		else {
			addToOtherModel();
		}		
        this.setSize(250,150);
        this.setLayout( new FlowLayout());
		this.add(title);
        this.add(userType);
		this.add(list);
	}
}