package BookStoreOOP;

public class BooksStoreMain {
    public static void main(String[] args) {

       AudioBook  book1=new AudioBook("Harry Potter", "J.K. Rowling", 1, 10.5, false,"Mp3",128, "Smith" );

       book1.printBookDetails();
      EBook book2 = new EBook("Anna Karenina", "L.Tolstoy", 2, 20, false,"www.book");
      book2.printBookDetails();

      book2.setUsdPrice(10);
//
//
//        book1.setAvailable(true);
//        book2.setUsdPrice(30);
//
//        book1.printBookDetails();
//        book2.printBookDetails();




    }
}
