package InsuranceManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InsuranceMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        //CustomerRegistration customer=new CustomerRegistration();
        while(true) {
            System.out.println("\n Menu");
            System.out.println("[1] Customer Registration");
            System.out.println("[2] Customer Login");
            System.out.println("[3] View Policy");
            System.out.println("[4] Select Policy");
            System.out.println("[5] Exit");

            System.out.println("Select menu: ");
            int choice=sc.nextInt();sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("----------***********----------\n Customer Registration Form \n----------***********----------" );
                    System.out.println("Enter Customer Id: ");
                    int Customer_Id=sc.nextInt();sc.nextLine();

                    System.out.println("Enter Name: ");
                    String Customer_Name=sc.nextLine();
                    while(Customer_Name.length()>50){
                        System.out.println("Max character for name is 50");
                        System.out.println("Enter Name: ");
                        Customer_Name=sc.nextLine();

                    }
                    System.out.println("Enter Email: ");
                    String Email=sc.nextLine();
                    System.out.println("Enter Password: ");
                    String Password=sc.nextLine();
                    while(Password.length()>30){
                        System.out.println("Max character for Password is 30");
                        System.out.println("Enter Password: ");
                        Password=sc.nextLine();

                    }
                    System.out.println("Enter Address: ");
                    String Address=sc.nextLine();
                    while(Address.length()>100){
                        System.out.println("Max character for Address is 100");
                        System.out.println("Enter Address: ");
                        Address=sc.nextLine();

                    }
                    System.out.println("Enter nominee Name: ");
                    String Nominee_Name=sc.nextLine();
                    System.out.println("Enter Relationship: ");
                    String Relationship=sc.nextLine();
                    System.out.println("Enter contact Number: ");
                    String Contact_Number=sc.nextLine();
                    while(Contact_Number.length()>10) {
                        System.out.println("Max character for Contact number is 10");
                        System.out.println("Enter Contact Number: ");
                        Contact_Number = sc.nextLine();
                    }
                        InsuranceUtil customer=new InsuranceUtil();
                        customer.addCustomerDetailsForRegistration(Customer_Id,Customer_Name,Email,Password,Address,Nominee_Name,Relationship,Contact_Number);
                        break;
                case 2:
                    System.out.println("**********Login Form*********");
                    System.out.println("Enter user name");
                    String User_name=sc.nextLine();
                    System.out.println("Enter password");
                    String password=sc.nextLine();
                    InsuranceUtil login=new InsuranceUtil();
                    login.Customerlogin(User_name,password);












            }
        }

    }
}
