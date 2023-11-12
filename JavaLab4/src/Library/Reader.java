package Library;

public class Reader {
    private String name;
    private Book book;

    public Reader() {
        name = "";
        book = new Book("", "", 0, 0);
    }

    public Reader(String readerName, String bookName, String bookAuthor, int dayBorrow, int monthBorrow) {
        this.name = readerName;
        this.book = new Book(bookName, bookAuthor, dayBorrow, monthBorrow);
    }

    public Reader(Reader a) {
        this.name = a.name;
        this.book = a.book;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setBook(Book a) {
        book = a;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void dateExpired(int dateDay, int dateMonth){
        if ((book.giveDay() <= dateDay) && (book.giveMonth() == dateMonth))
            System.out.println(name + ", you still have time to return a book");
        else
            System.out.println(name + ", the date when you was supposed to return a book has already expired");
    }
    @Override
    public String toString() {
        return new String("Reader name: " + name + "\nBook info:\n" + book);
    }

}
