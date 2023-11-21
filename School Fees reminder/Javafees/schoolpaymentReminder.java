package Javafees;

public class schoolpaymentReminder 
{
    private String name;
    private String title;
    private String description;
    private String paymentRecord;
    // Constructor
    public schoolpaymentReminder(String name,String title, String description, String paymentrecord)
    {
        this.name=name;
        this.title=name;
        this.description=description;
        this.paymentRecord=paymentrecord;
    }
    //Getter and Setter
    public String getname()
    {
        return this.name;
    }
    public String titlle()
    {
        return this.title;
    }
    public void setname(String title)
    {
        this.title=title;
    }
    }
    public String description()
    {
        return this.description;
    }
    public void setname(String description)
    {
        this.description=description;
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
