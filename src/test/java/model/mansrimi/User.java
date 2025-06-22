package model.mansrimi;

public class User {
    private String firstName;
    private String lastName;
    private String pk;
    private String phoneNumber;

    public User(String firstName, String lastName, String pk, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pk = pk;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
