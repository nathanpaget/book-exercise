/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
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
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages=bookPages;
		refNumber="";
		borrowed=0;
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
	public String getRefNumber()
	{
		return refNumber;
	}
    public int getBorrowed()
    {
        return borrowed;
    }
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public void printDetails()
    {
		if(refNumber.length()==0)
			{
        		System.out.println("\nTitle:\t" + title + "\nAuthor:\t" + author + 
						   		   "\nPages:\t" + pages + "\nRef:\tZZZ" + 
								   "\nNumber of times borrowed: " + borrowed);
			}
		else
			{
        		System.out.println("\nTitle:\t" + title + "\nAuthor:\t" + author + 
						   		   "\nPages:\t" + pages + "\nRef:\t" + refNumber + 
								   "\nNumber of times borrowed: " + borrowed);
			}
    }
	public void setRefNumber(String ref)
	{
		if(ref.length()==3)
		{
			refNumber=ref;
		}	
		else 
		{	
			System.out.println("ERROR: You must use a 3 character reference number");
		}
	}
	public void borrow()
	{
		borrowed+=1;
	}
}
