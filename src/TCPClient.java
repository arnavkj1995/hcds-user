import java.io.*;
import java.net.*;

import com.example.tutorial.Test.test;
import com.example.tutorial.AddressBookProtos.Person;

public class TCPClient {
	static Socket clientSocket;
	static BufferedReader inFromUser;
	static DataOutputStream outToServer;
	static BufferedReader inFromServer;
	static public String collectorName="";
        static Person Data;
        
        public void setCollector(String x){
            this.collectorName=x;
        }
        
        public int[] getLRDues(){
            int ans[]=new int[6];
            ans[0]=Data.getLRRent();
            ans[1]=Data.getLRStreetLight();
            ans[2]=Data.getLRDevTax();
            ans[3]=Data.getLRExDevTax();
            ans[4]=0;
            ans[5]=Data.getLRInterest();
            return ans;
        }
        public int[] getWCDues(){
            int ans[]=new int[3];
            ans[0]=Data.getWCCharges();
            ans[2]=Data.getWCDevTax();
            ans[1]=Data.getWCInterest();
            return ans;
        }
        public int[] getLFDues(){
            int ans[]=new int[3];
            ans[0]=Data.getLFFee();
            ans[2]=Data.getLFInterest();
            ans[1]=0;//Data.getLFRebate();
//            ans[0]=Data.getADLicenseFee()-ans[2];
            
            return ans;
        }        
        
        public int[] getECDues(){
            int ans[]=new int[4];
            ans[0]=Data.getECMeterRent();
            ans[1]=Data.getECFuseCall();
            ans[3]=Data.getECRent();
            System.out.print("vbs"+Data.getECRent());
            ans[2]=Data.getECInterest();
            return ans;
        }
        
        public int getMontlyFee(){
            return Data.getMonthlyLicenseFee();
        }
        public String getCollector(){
            return this.collectorName;
        }
        
        public String getName(){
            return Data.getName();
        }
        
        public String getPlotNo(){
            return Data.getSocietyPlotNumber();
        }
        
        public String getShopNo(){
            return Data.getShopNo();
        }
        public double getPlotArea(){
            return Data.getPlotArea();
        }
        
        public String getGuardianName(){
            return Data.getNameGuardian();
        }
        
        public String getCategory(){
            return Data.getUserType();
        }
        
        public String getMouza(){
            return Data.getMouza(); 
        } 
        
        public String getPrevReading(){
            return String.valueOf(Data.getPreviousMeterReading());
        }
        
        public String getArrearDueLandRent(){
            return String.valueOf(Data.getADLandRent());
        }
                  
        public String getArrearDueWaterCharges(){
         return "";//   return String.valueOf(Data.getADWaterCharges());
        }
               
        public String getArrearDueElectricityCharges(){
            return String.valueOf(Data.getADElectricityCharges());
        }
              
        public long getID(){
            return  Data.getID();
        }
        public String getArrearDueConservanceCharges(){
            return String.valueOf(Data.getADConservancy());
        }
       public String getArrearDueLicenseFee(){
//            return String.valueOf(Data.getADLicenseFee());
           return "";
        }
        
    public void initialise(int i) throws UnknownHostException, IOException {
        inFromUser = new BufferedReader(new InputStreamReader(System.in));
       // System.out.print("fbsdkafb");
        clientSocket = new Socket("169.254.103.88", 6780);
       // System.out.print("fbsdkafb");
        outToServer = new DataOutputStream(clientSocket.getOutputStream());
	inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }
    
    public static void client(String s) throws Exception {
        String sentence;
        String modifiedSentence;
     //   sentence = inFromUser.readLine();
        outToServer.writeBytes(s + '\n');
        if(s.charAt(0)=='i' || s.charAt(0)=='p'){
            DataInputStream is = new DataInputStream(clientSocket.getInputStream());
            Data=Person.parseFrom(is);
        }
    }
    
    public static String doLogin(String s) throws Exception{
       outToServer.writeBytes(s+'\n');
       String res="";
        if(s.charAt(0)=='s'){
            DataInputStream is = new DataInputStream(clientSocket.getInputStream());
            return inFromServer.readLine();
        }
        return res;
    }
    
    public static void paymentMade(String s) throws Exception{
       outToServer.writeBytes(s+'\n');
    }
    public static String getCharges(String s) throws Exception{
        String sentence;
        String modifiedSentence;
        outToServer.writeBytes(s + '\n');
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        return inFromServer.readLine();
    }
}