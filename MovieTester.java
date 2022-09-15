package Movie;

public class MovieTester {
    public static void main(String[] args){
        Movie legoMovie = new Movie("The Lego Movie",2014,"Chris Miller","Chris Pratt");
       String result =  legoMovie.toString();
        System.out.println(result);

        Movie minions = new Movie();
        System.out.println(minions.toString());

        minions.setTitle("Minions The Rise of Gru");
        minions.setRelease(2022);
        minions.setDirector("Kyle Balda");
        minions.setLeading("Steve Carell");

        System.out.println("Minions full title: "+ minions.getTitle());

        System.out.println(minions);
    }
}
