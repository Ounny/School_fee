package Javafees;
public class adminstrators 
{
    private int admin_id;
    private String name;
    private int passsowrd;

// Constructor
    public adminstrators(int admin_id, String name, int password) 
    {
        this.admin_id = admin_id;
        this.name = name;
        this.passsowrd = password;
    }
// Getter
    public int getAdminID() 
    {
        return admin_id;
    }
    public String getName() 
    {
        return name;
    }
    public int getpassword() 
    {
        return passsowrd;
    }
// Setter
    public void setAdminID(int admin_id) 
    {
        this.admin_id = admin_id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setpassword(int password) 
    {
        this.passsowrd = password;
    }
}
