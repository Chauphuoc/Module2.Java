package Model;

public class Order {
    private long idOrder;
    private String nameCustomer;
    private long mobile;
    private String address;

    public Order() {
    }

    public Order(long idOrder, String nameCustomer, long mobile, String address) {
        this.idOrder = idOrder;
        this.nameCustomer = nameCustomer;
        this.mobile = mobile;
        this.address = address;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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
        return String.format("%10s %10s %10s %10s",this.idOrder,this.nameCustomer,this.mobile,this.address);
    }
}
