package Javafees;
import java.time.LocalDate;

public class Invoice 
{
    private String invoice_id;
    private LocalDate duedate;
    private double amount;
    private boolean paymentStatus;

    public Invoice(String invoice_id, LocalDate duedate, double amount, boolean paymentStatus) 
    {
    this.invoice_id = invoice_id;
    this.duedate = duedate;
    this.amount = amount;
    this.paymentStatus = paymentStatus;
    }

    // getters and setters
    public String getInvoice_id() 
    {
        return invoice_id;
    }
    public void setInvoice_id(String invoice_id) 
    {
        this.invoice_id = invoice_id;
    }
    public LocalDate getDuedate() 
    {
        return duedate;
    }
    public void setDuedate(LocalDate duedate) 
    {
        this.duedate = duedate;
    }
    public double getAmount() 
    {
        return amount;
    }
    public void setAmount(double amount) 
    {
        this.amount = amount;
    }
    public boolean getPaymentStatus() 
    {
        return paymentStatus;
    }   
    public void setPaymentStatus(boolean paymentStatus) 
    {
        this.paymentStatus = paymentStatus;
    }
}
