/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Fatimah Salih)
 * @version (09-28-26)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    //Return the author
    public String getAuthor ()
    {
        return author;
    }
    //Return the title 
    public String getTitle()
    {
        return title;
    }
    
    //Method to display author
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    // Method to display title
    public void printTitle()
    {
        System.out.println(title);
    }
    
    
    
    
}
