package adam_bishop_exercises.javabeans;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class BeanTest {
    public static void main(String[] args) {
        Album giantSteps = new Album();
        giantSteps.setName("Giant Steps");
        giantSteps.setArtist("John Coltrane");
        giantSteps.setReleaseDate(1960);
        giantSteps.setGenre("Jazz");
        giantSteps.setSales(1234.56);

        Author joe = new Author();
        joe.setFirstName("Joe");
        joe.setLastName("Mama");

        Quote aQuote = new Quote();
        aQuote.setAuthor(joe);
        aQuote.setContent("uhhhhhhhhhhh");

        Author forsen = new Author("Sebastian", "Fors");
        Quote forsenQuote1 = new Quote(forsen, "You snus, you lose.");
        Quote forsenQuote2 = new Quote(forsen, "The run was dead anyways.");
        Quote forsenQuote3 = new Quote(forsen, "What is this, a game for ants?");

        ArrayList<Quote> forsenLines = new ArrayList<>(List.of(forsenQuote1, forsenQuote2, forsenQuote3));

        printQuotes(forsenLines);
    }

    private static void printQuotes(ArrayList<Quote> forsenLines) {
        for (Quote forsenLine : forsenLines) {
            System.out.println(forsenLine);
        }
    }
}
