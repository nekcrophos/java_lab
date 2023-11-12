package Library;

public class Book {
    private String name;
    private String author;
    private int day;
    private int month;

    public Book() {
        name = "";
        author = "";
        day = 0;
        month = 0;
    }

    public Book(String name, String author, int day, int month) {
        this.name = name;
        this.author = author;
        this.day = day;
        this.month = month;
    }

    public Book(Book a) {
        this.name = a.name;
        this.author = a.author;
        this.day = a.day;
        this.month = a.month;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int giveDay() {
        return day;
    }

    public int giveMonth() {
        return month;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setDay(int newDay) {
        day = newDay;
    }

    public void setMonth(int newMonth) {
        month = newMonth;
    }

    @Override
    public String toString() {
        return new String("The book name: " + name + "; The book author: " + author + "; The day, when the book needs to be returned: " + day + ";The month, when the book was borrowed: " + month);
    }
}