package InsuranceManagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsuranceUtil {
    String url="jdbc:mysql://localhost:3306/Insurance_Management_System";
    String user="root";
    String password="root";
    public void addCustomerDetailsForRegistration(int Customer_Id,String Customer_Name,String Email,String Password,String Address,String Nominee_Name,String Relationship,String Contact_Number){
        try{
            String query1="INSERT INTO Customer_Registration values("+Customer_Id+",'"+Customer_Name+"','"+Email+"','"+Password+"','"+Address+"','"+Nominee_Name+"','"+Relationship+"','"+Contact_Number+"')";
            System.out.println(query1);
            Connection con= DriverManager.getConnection(url,user,password);

            Statement stmt= con.createStatement();
            int i=stmt.executeUpdate(query1);
            if(i==1){
                System.out.println("Customer Registered successfully.....");
                System.out.println(query1);
            }else{
                System.out.println("Customer Registration failed!!!");
            }
            stmt.close();
            con.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void Customerlogin(String User_name,String password){
        try{
            String query2="SELECT Customer_Id,Customer_Name,Email FROM Customer_Registration WHERE Customer_Name='"+User_name+"' and Password='"+password+"' ";
            System.out.println(query2);
            Connection con= DriverManager.getConnection(url,user,password);

            Statement stmt= con.createStatement();
            ResultSet resultSet =stmt.executeQuery(query2);
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));

            }
            if(resultSet!=null){
                System.out.println("Login successfully.....");
                //System.out.println(query2);
            }else{
                System.out.println("Entered Customer name or Password wrong!!!");
            }

            stmt.close();
            con.close();



        }catch(Exception e){
            System.out.println(e);
        }

    }
}
