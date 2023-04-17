package stringsLesson;



public class Book {

    String euro= "EUR";
    String ruble = "RUB";
    //describe a book, create all the variables we need
    // name, author, id, price in USD, availability
    // using conversion rate, calculate EUR Price of book
    // print all the books details including prices

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.createNewBook("Harry Potter", "J.K Rowling", 1, 10.5, false);
        book1.createNewBook("Anna Karenina", "L. Tolstoy", 2, 20, true);

    }

    public void createNewBook(String bookName, String authorName, int id, double priceInUSD, boolean isAvailable) {

        double priceInEUR=calculatePrice(priceInUSD,euro);
        double priceInRUBles=calculatePrice(priceInUSD,ruble);

        System.out.println("Book name is: " + bookName);
        System.out.println("Book id is: " + id);
        System.out.println("Book price: " + priceInUSD + " USD, " + priceInEUR + " EUR, "+priceInRUBles+"RUB");
        System.out.println("Book is available: " + isAvailable);

    }

    public double calculatePrice(double priceInUSD, String currency) {
        double rate = 1;
        if (currency.equals(euro)) {
            rate = 1.1;
        } else if
        (currency.equals(ruble)) {
            rate = 70;
        } else {
            System.out.println("error: unknown currency, USD price will return");
        }
        double priceAfterConversion = priceInUSD * rate;
        return priceAfterConversion;

    }
        }
