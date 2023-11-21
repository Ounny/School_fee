package Javafees;

public class schoolpaymentReminder 
{
    private String name;
    private String paymentRecord;
    // Constructor
    public schoolpaymentReminder(String name, String paymentrecord)
    {
        this.name=name;
        this.paymentRecord=paymentrecord;
    }
    //Getter and Setter
    public String getname()
    {
        return this.name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
     public String getpaymentrecord()
    {
        return this.paymentRecord;
    }
    public void setpaymentrecord(String paymentRecord)
    {
        this.paymentRecord=paymentRecord;
    }
}
