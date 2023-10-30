package InsuranceManagement;

public class CustomerRegistration {
    int Customer_Id;
    String Customer_Name;
    String Email;
    String Password;
    String Address;
    String Nominee_Name;
    String Relationship;
    String Contact_Number;

    public CustomerRegistration(int Customer_Id,String Customer_Name,String Email,String Password,String Address,String Nominee_Name,String Relationship,String Contact_Number){
        this.Customer_Id=Customer_Id;
        this.Customer_Name=Customer_Name;
        this.Email=Email;
        this.Password=Password;
        this.Address=Address;
        this.Nominee_Name=Nominee_Name;
        this.Relationship=Relationship;
        this.Contact_Number=Contact_Number;
    }

    public int getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        Customer_Id = customer_Id;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNominee_Name() {
        return Nominee_Name;
    }

    public void setNominee_Name(String nominee_Name) {
        Nominee_Name = nominee_Name;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String relationship) {
        Relationship = relationship;
    }

    public String getContact_Number() {
        return Contact_Number;
    }

    public void setContact_Number(String contact_Number) {
        Contact_Number = contact_Number;
    }
}
