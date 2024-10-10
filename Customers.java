
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Customers {

    private String CustomerID;
    private String Name;
    private String phone;
    private Date dob;
    private String address;

    public Customers(String CustomerID, String Name, String phone, String dob, String address) throws ParseException {
        this.CustomerID = CustomerID;
        this.Name = Name;
        this.phone = phone;
        this.dob = setDob(dob);
        this.address = address;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//sai ở chỗ mm là phút còn MM mới là tháng
        return sdf.format(dob);
    }

    public Date setDob(String dob) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.parse(dob);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customers{" + "CustomerID=" + CustomerID + ", Name=" + Name + ", phone=" + phone + ", dob=" + dob + ", address=" + address + '}';
    }

    public <U> U getPhoneNumber() {
        return null;
    }
}
