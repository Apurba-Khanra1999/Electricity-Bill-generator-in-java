public class BillSummary {


    String custName;
    String custAddress;
    int custPhone;

    

    public BillSummary(String custName, String custAddress, int custPhone) {
        this.custName = custName;
        this.custAddress = custAddress;
        this.custPhone = custPhone;
    }

    public BillSummary() {
        
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public int getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(int custPhone) {
        this.custPhone = custPhone;
    }

    @Override
    public String toString() {
        //return "Address=" + custAddress + ", Name : " + custName + ", Phone : " + custPhone ;
        return " Name : " + custName + " \t\t\tPhone : " + custPhone + "\n Address : " + custAddress ;
    }

    public void billReport(String custName, String custAddress, int custPhone){


    };
    
    

    
}
