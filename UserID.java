
/**
 * Store personal information of User based on input data including first name, last name, and date of birth
 *
 * @author Don "Ghengis_Don" Santiago
 * @version Alpha May 1st 2023
 */
public class UserID extends CinemaBookingSystem
{
    // instance variables - replace the example below with your own
    private String userFirst; //this is user first name
    private String userLast; //this is user last name 
    private String Contactnumber; //this is the contact number of the person
    
    /**
     * Constructor for objects of class UserID
     */
    
    public UserID()
    {
        // assign null values to 
        userFirst=null;
        userLast=null;
        Contactnumber=null;
    }
    
    public void UserID(String newFirst,String newLast,String Contactnumber)
    {
        // initialise instance variables
        userFirst=newFirst;
        userLast=newLast;
        Contactnumber=newContactnumber;
    }

    public String getuserFirst()
    {
        return userFirst; //Store the first name of the user
    }
    
    public String getuserLast()
    {
        return userLast; //Store the last name of the user
    }
    
    public String getContactnumber()
    {
        return Contactnumber; //Store the phone number input of the user
    }
    
    /**
     * the following section is the print section which if everything works correctly will print on screen both the first and last name of the user as well as their given contact number
     */
    
    public void print()
    {
        System.out.println("Thanks for experiencing with us today!");
        System.out.println(userFirst+userLast);
        System.out.println("Any official messages will go to ");
        System.out.println(Contactnumber);
    }
}
