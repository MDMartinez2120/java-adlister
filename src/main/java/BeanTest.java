import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        ArrayList<Quote> quotes = new ArrayList<>();

        Author newGaiman = new Author(2, "Neil Gaiman");

        Author newMarcel = new Author(1, "Marcel Proust");

        Quote quote1 = new Quote(1, "The real voyage of discovery consists not in seeking new landscapes, but in having new eyes.");
    }
}
