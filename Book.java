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
    private int pages;
    private String refNumber;
    private int borrowed;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
        borrowed = 0;
    }

    
    
    //Return the number of pages 
    public int getPages()
    {
        return pages;
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
    //Return the reference number
    public String getReferenceNumber()
    {
        return refNumber;
    }
    
    // Returning the number of times borrowed
    public int getBorrowed()
    {
        return borrowed;
    }
    
        
    //Setting the reference number
    public void setRefNumber(String ref)
    {
        if(ref.length() >= 3) 
        {
            refNumber = ref;
        }
        else 
        {
            System.out.println("Error: Reference number too short.");
        }
    }
    
    //Increase the borrow count 
    public void borrow()
    {
        borrowed = borrowed + 1;
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
    
    //Method to display all three details at once 
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + author +
        ", Pages: " + pages);
        
        if(refNumber.length() >0) 
        {
            System.out.println("Reference: " + refNumber);
        }
        else 
        {
            System.out.println("Reference:ZZZ");
        }
        
        System.out.println("Number of times borrowed: " + borrowed);
    }
    
    
    
}
