package section7classesobjectsintro;

/**
 * Represents a book with author, title, genre, and page count
 */
public class Book {
    private String author;
    private String title;
    private String genre;
    private int numPages;

    /**
     * Creates a new book with the specified details
     * 
     * @param author   book's author
     * @param title    book's title
     * @param genre    book's genre
     * @param numPages number of pages in the book
     */
    public Book(String author, String title, String genre, int numPages) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.numPages = numPages;
    }

    /**
     * Returns the book's author
     * 
     * @return author's name
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the book's title
     * 
     * @return book title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the book's genre
     * 
     * @return book genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Returns the number of pages in the book
     * 
     * @return number of pages
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * Prints the book's details to the console
     */
    public void printBookDetails() {
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println("has " + numPages + " pages, and its genre is " + genre);
        System.out.println();
    }
}
