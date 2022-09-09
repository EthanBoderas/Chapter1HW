package Movie;

/**
 * class: Movie
 * this Movie type class has four attributes
 * attribute/data part
 * title of a movie
 * released year
 * name of a director
 * name of the leading role actor or actress.
 *
 * constructors
 * (1) no-arg constructors with default value you want to assign but you must
 * apply a constructor with all attributes as parameters.
 * (2)constructor takes all attributes
 *
 * methods
 * getters, setters, toString
 * toString method should display information about the movie in a nice format.
 *
 */
public class Movie {
    private String title;
    private int release;
    private String director;
    private String leading;
    
    
    public void Movie(String name,String year,String direct,String lead){
        title = name;
        release = year;
        director = direct;
        leading = lead;
    }
    
    public void toString(){
        System.out.println("Title of a movie: "+ title);
        System.out.println("Year of release: "+ release);
        System.out.println("Name of a director: "+ director);
        System.out.println("Name of the leading role actor or actress: "+ leading);
    }
    
    //Setters
    
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setRelease(int newRelease){
        this.release = newRelease;
    }
    
    public void setDirector(String newDirector){
        this.director = newDirector;
    }

    public void setLeading(String newLeading){
        this.leading = newLeading;
    }
    
    
    //Getters
    
    public String getTitle(){
        return this.title;
    }

    public int getRelease(){
        return this.release;
    }

    public String getDirector(){
        return this.director;
    }

    public String getLeading(){
        return this.leading;
    }
}
