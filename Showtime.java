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
        screening.put("1","Mario");
        screening.put("2","Mario");
        screening.put("3","Mario");
        screening.put("4","Mario");
        screening.put("5","Mario");
        screening.put("6","Mario");
        screening.put("7","Mario");
        screening.put("8","Mario");
        screening.put("9","Mario");
        screening.put("10","Mario");
        screening.put("11","Avengers");
        screening.put("12","Avengers");
        screening.put("13","Avengers");
        screening.put("14","Avengers");
        screening.put("15","Avengers");
        screening.put("16","Avengers");
        screening.put("17","Avengers");
        screening.put("18","Avengers");
        screening.put("19","Avengers");
        screening.put("20","Avengers");
        screening.put("21","Joker");
        screening.put("22","Joker");
        screening.put("23","Joker");
        screening.put("24","Joker");
        screening.put("25","Joker");
        screening.put("26","Joker");
        screening.put("27","Joker");
        screening.put("28","Joker");
        screening.put("29","Joker");
        screening.put("30","Joker");

        
        String theater = screening.get("Pixar");
        System.out.println(theater);
        return theater;
    }
}
