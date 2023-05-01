import java.io.*;
import java.util.*;

/**
 * This class stores the film titles in a linked list that allows the user to determine what they want to see so long as the information of the title is associated to a value on the list
 *
 * @author Don "Ghengis_Don" Santiago
 * @version Alpha May 1st 2023
 */
public class FilmTitles
{
    // instance variables - replace the example below with your own
        
    private LinkedList<String>Films=new LinkedList<>();
    
    public FilmTitles()
    {
        /**
         * addition of film titles to linked list
         */
        Films.add("The Super Mario Brothers Movie");
        Films.add("Are You There God? It's Me, Margaret");
        Films.add("John Wick:Chapter 4");
        Films.add("Sisu");
        Films.add("Chevalier"); 
    
        System.out.println("The movies available are "+Films);
    
        BufferedReader br=new BufferedReader(newInputStreamReader(System.in));
        String element;
        int position, choice=0;
    
    while (choice<6)
        {
        System.out.println("\n THE CURRENT MOVIE LIST IS AS FOLLOWS");
        System.out.println("1. The Super Mario Brothers Movie");
        System.out.println("2. Are You There God? It's Me Margaret");
        System.out.println("3. John Wick: Chapter 4");
        System.out.println("4. Sisu");
        System.out.println("5. Chevalier");
        System.out.println("6. Exit");
        
        System.out.println("Enter a numeric choice value");
        choice=Integer.parseInt(br.readLine());
        
        switch(choice)
            {
            case 1:
                System.out.println("You have selected to watch 'The Super Mario Brothers Movie' ");
            
            case 2:
                System.out.println("You have selected to watch 'Are You There God? It's Me Margaret' ");
                
            case 3:
                System.out.println("You have selected to watch 'John Wick: Chapter 4' ");
            
            case 4:
                System.out.println("You have selected to watch 'Sisu' ");
                
            case 5:
                System.out.println("You have selected to watch 'Chevalier' ");
            
            case 6:
                System.out.println("You have selected to not watch any movie. ");
                System.exit(0);
                default:
                    return;
            }
        }
    }
}