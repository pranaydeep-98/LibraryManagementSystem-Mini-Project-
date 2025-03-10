import java.text.SimpleDateFormat;
import java.util.Date;

public class BookInfo {
    private String name;
    private String rollNumber;
    private String bookId;
    private String bookName;
    private Date borrowDate;
    private Date returnDate;

    public BookInfo() {
    }

    public BookInfo(String name, String rollNumber, String bookId, String bookName, Date borrowDate, Date returnDate) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.bookId = bookId;
        this.bookName = bookName;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy");
        return "Name : "+name+"\nRoll No : "+rollNumber+"\nBook ID : "+bookId+"\nBook Name : "+bookName+"\nBorrowed Date : "+formater.format(borrowDate)+"\nReturned Date : "+formater.format(returnDate);
    }

}
