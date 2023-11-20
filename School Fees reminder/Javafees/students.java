package Javafees;
public class students 
{
    private int studentsID;
    private String name;
    private String username;
    private String password;

// Constructor
    public students(int studentsID, String name, String username, String password) 
    {
        this.studentsID = studentsID;
        this.name = name;
        this.username = username;
        this.password = password;
    }
//Getter
    public int getStudentsID() 
    {
        return studentsID;
    }

    public String getname() 
    {
        return name;
    }

    public String getusername() 
    {
        return username;
    }

    public String password() 
    {
        return password;
    }
//Setter
    public void setStudentsID(int studentsID) 
    {
        this.studentsID = studentsID;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setusername(String username) 
    {
        this.username = username;
    }

    public void setpassword(String password) 
    {
        this.password = password;
    }
}