package Javafees;
import java.time.LocalDate;

public class paymentRecord {
    private String paymentID;
    private LocalDate duedate;
    private double amount;
    private boolean status;

// Constructor
    public paymentRecord(String paymentID, LocalDate duedate, double amount, boolean status) 
    {
        this.paymentID = paymentID;
        this.duedate = duedate;
        this.amount = amount;
        this.status = status;
    }
// Getter
    public String getPaymentID() 
    {
        return paymentID;
    }
    public LocalDate getDuedate() 
    {
        return duedate;
    }
    public double getAmount() 
    {
        return amount;
    }
    public boolean getStatus() 
    {
        return status;
    }
// Setter
    public void setPaymentID(String paymentID) 
    {
        this.paymentID = paymentID;
    }
    public void setDuedate(LocalDate duedate) 
    {
        this.duedate = duedate;
    }
    public void setAmount(double amount) 
    {
        this.amount = amount;
    }
    public void setStatus(boolean status) 
    {
        this.status = status;
    }
}