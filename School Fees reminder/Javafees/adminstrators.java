package Javafees;
public class schoolpaymentReminder {
    private String name;
    private String title;
    private String description;
    private String paymentRecord;

    // Constructor
    public schoolpaymentReminder(String name, String title, String description, String paymentrecord) 
    {
        this.name = name;
        this.title = name;
        this.description = description;
        this.paymentRecord = paymentrecord;
    }
    // Getter 
    public String getName() 
    {
        return name;
    }
    public String getTitle() 
    {
        return title;
    }
    public String getDescription() 
    {
        return description;
    }
    public String getPaymentRecord() 
    {
        return paymentRecord;
    }
    // Setter 
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }
    public void setPaymentRecord(String paymentRecord) 
    {
        this.paymentRecord = paymentRecord;
    }
}
