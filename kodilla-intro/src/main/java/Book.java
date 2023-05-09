public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        Book book1 = new Book("Liu Cixin","The three body problem");
        System.out.println(book.author);
        System.out.println(book1.author);
    }
}
