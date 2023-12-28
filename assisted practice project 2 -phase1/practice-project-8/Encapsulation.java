package assistedPractice;
class Encapsulate 
{ 
    private String username; 
    private int password; 
private int userid;
   
    public String getusername()  
    { 
      return username; 
    } 
    public int getpassword()  
    { 
       return password; 
    } 
    public int getuserid()  
    { 
      return userid; 
    } 
    public void setuserid( int newuserid) 
    { 
      userid = newuserid; 
    } 

   
    public void setusername(String newusername) 
    { 
      username = newusername; 
    } 
    public void setpassword( int newpassword)  
    { 
      password= newpassword; 
    } 
}
public class Encapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate e = new Encapsulate(); 
        e.setusername("sharik"); 
        e.setuserid(12453); 
        e.setpassword(2346273); 
        System.out.println("username: " + e.getusername()); 
        System.out.println("userid: " + e.getuserid()); 
        System.out.println("password: " + e.getpassword());      
    } 
}

