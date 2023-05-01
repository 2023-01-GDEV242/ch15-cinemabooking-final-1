import java.util.HashMap;

/**
 * Abstract class Showtime - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Showtime extends Alert
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String Shows(int y)
    {
        // put your code here
        HashMap<String, String> screening = new HashMap<>();
        screening.put("1","DC");
        screening.put("2","DC");
        screening.put("3","DC");
        screening.put("4","DC");
        screening.put("5","DC");
        screening.put("6","DC");
        screening.put("7","DC");
        screening.put("8","DC");
        screening.put("9","DC");
        screening.put("10","DC");
        screening.put("11","Pixar");
        screening.put("12","Pixar");
        screening.put("13","Pixar");
        screening.put("14","Pixar");
        screening.put("15","Pixar");
        screening.put("16","Pixar");
        screening.put("17","Pixar");
        screening.put("18","Pixar");
        screening.put("19","Pixar");
        screening.put("20","Pixar");
        screening.put("21","Marvel");
        screening.put("22","Marvel");
        screening.put("23","Marvel");
        screening.put("24","Marvel");
        screening.put("25","Marvel");
        screening.put("26","Marvel");
        screening.put("27","Marvel");
        screening.put("28","Marvel");
        screening.put("29","Marvel");
        screening.put("30","Marvel");

        
        String theater = screening.get("Pixar");
        System.out.println(theater);
        return theater;
    }
}
