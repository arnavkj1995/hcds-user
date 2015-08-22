/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;      
import java.awt.event.*; 
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author arnav
 */
public class collection {
        //JDBC name and database URL
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL= "jdbc:mysql://localhost/hcds";

    //Databas credentials
    static final String USER="root";
    static final String PASS= "1234";

    static String startQuery="INSERT into Collector values ('";
    static String endQuery=", CURDATE() );";
    static Connection conn=null;
    static String nameOfCollector="";
    
    public collection(){
        
    }   
    
    public static void updateLandRent(int v[]) throws ClassNotFoundException, SQLException{
        TCPClient clnt=new TCPClient();
        int total=0;
        for(int x:v)
            total+=x;
        String query=startQuery+
                clnt.getCollector()+"', '"+
                clnt.getName()+"',"+
                clnt.getID()+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+v[0]+
                ","+v[1]+
                ","+v[2]+
                ","+v[3]+
                ","+v[4]+
                ","+v[5]+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+total+
                endQuery;
                Statement stmt=null;
        Connection conn=null;
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to databse...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            
        }
        catch(Exception e){
            stmt.executeUpdate(query);
            e.printStackTrace();
        }
    }
    public static void updateElectricityCharge(int v[]) throws ClassNotFoundException, SQLException{
        TCPClient clnt=new TCPClient();
        int total=0;
        for(int x:v)
            total+=x;
        String query=startQuery+
                clnt.getCollector()+"', '"+
                clnt.getName()+"',"+
                clnt.getID()+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+v[0]+
                ","+v[1]+
                ","+v[2]+
                ","+v[3]+
                ","+total+
                endQuery;
                Statement stmt=null;
        Connection conn=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to databse...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void updateWaterCharge(int v[]) throws ClassNotFoundException, SQLException{
        TCPClient clnt=new TCPClient();
        int total=0;
        for(int x:v)
            total+=x;
        String query=startQuery+
                clnt.getCollector()+"', '"+
                clnt.getName()+"',"+
                clnt.getID()+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+v[0]+
                ","+v[1]+
                ","+v[2]+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+total+
                endQuery;
                Statement stmt=null;
        Connection conn=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to databse...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            
        }
        catch(Exception e){
            
        }
    }
    public static void updateLicenseFeeCharge(int v[]) throws ClassNotFoundException, SQLException{
        TCPClient clnt=new TCPClient();
        int total=0;
        for(int x:v)
            total+=x;
        String query=startQuery+
                clnt.getCollector()+"', '"+
                clnt.getName()+"',"+
                clnt.getID()+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+v[0]+
                ","+v[1]+
                ","+v[2]+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+total+
                endQuery;
                Statement stmt=null;
        Connection conn=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to databse...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            
        }
        catch(Exception e){
            
        
        }
    }
    public static void updateOtherCharge(int v[]) throws ClassNotFoundException, SQLException{
        TCPClient clnt=new TCPClient();
        int total=0;
        for(int x:v)
            total+=x;
        String query=startQuery+
                clnt.getCollector()+"', '"+
                clnt.getName()+"',"+
                clnt.getID()+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+v[0]+
                ","+v[1]+
                ","+v[2]+
                ",default"+
                ",default"+
                ",default"+
                ",default"+
                ","+total+
                endQuery;
                Statement stmt=null;
        Connection conn=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to databse...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);            
        }
        catch(Exception e){
            
        
        }        
    }
    public static void updateOtherCharge2(int chargeID[], String collName, String userName, int userID) throws ClassNotFoundException, SQLException{
        TCPClient clnt=new TCPClient();
        int total=0;
        
        String query=startQuery+
        collName + "', '" +
        userName + "'," +
        userID;
        for(int i=0;i<chargeID.length;i++){
            if(chargeID[i]==0)
                query += ", default" ; 
            else
                query += ", "+ chargeID[i];
            }
        query += endQuery;
        Statement stmt=null;
        Connection conn=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to databse...");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            
        }
        catch(Exception e){           
            e.printStackTrace();
        }
        
    }

    void updateLicenseFee(int[] v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}