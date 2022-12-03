package Model;

public class User {
    private long ID;
    private String account;
    private String password;
    private String fullname;
    private long mobile;
    private String address;
    private Role role;

    public User() {
    }

    public User(long ID, String account, String password, String fullname, long mobile, String address, Role role) {
        this.ID = ID;
        this.account = account;
        this.password = password;
        this.fullname = fullname;
        this.mobile = mobile;
        this.address = address;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%10s %10s %10s %10s %10s %10s %10s", this.ID, this.fullname, this.account, this.password,this.mobile,this.address,this.role);
    }
}
