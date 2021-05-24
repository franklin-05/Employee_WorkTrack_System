/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mambadatabase;
import java.sql.*;


/**
 *
 * @author franklin
 */
public class MambaDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection myconObj=null;
        Statement mystatObj=null;
        ResultSet myresObj=null;
        String query="SELECT * FROM MAMBA.MAMBA_STUDIO";
        
        
        
        try {
        myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/blackmamba","mamba", "12345");
        mystatObj=myconObj.createStatement();
        myresObj=mystatObj.executeQuery(query);
        while(myresObj.next()){
            int EMPLOYEE_ID=myresObj.getInt("EMPLOYEE_ID");
            String F_NAME=myresObj.getString("F_NAME");
            String L_NAME=myresObj.getString("L_NAME");
            String PROJECT=myresObj.getString("PROJECT");
            Date START_DATE= myresObj.getDate("START_DATE");
            Date FINISH_DATE= myresObj.getDate("FINISH_DATE");
            System.out.println(EMPLOYEE_ID + "\t    "+ F_NAME + "\t   " +L_NAME+ "\t  " +"\t " +PROJECT+"\t"+"\t  "+ START_DATE+ "\t   "+ FINISH_DATE);
        }
    }
    catch (SQLException e){
        e.printStackTrace();
        
    }
}
} 