import java.sql.*;  
public class App {
    

    //Constructor
    public App()
    {
        home();
    }

    public static void Welcome()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.print("*");
        }
        System.out.print("['Welcome To Emps']");
        for(int i=0;i<=10;i++)
        {
            System.out.print("*");
        }
    }

    public static void home()
    {  
        
    }

    public static void getEmployeelist()
    {
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/java","root","");  
            Statement stmt=con.createStatement(); 
            ResultSet rs=stmt.executeQuery("select * from emps");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
            }
            catch(Exception e){ System.out.println(e);}  
    }  

    public static void main(String[] args) throws Exception {
        Welcome();
    }
       
}
