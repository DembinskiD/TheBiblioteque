package pl.biblioteka.biblioteka;

import java.util.ArrayList;
import java.util.List;


//will be singleton
public class BookOrderArchive {
    public static final BookOrderArchive INSTANCE = new BookOrderArchive();
    private List<BookOrder> archive;

    private BookOrderArchive() {
        archive = new ArrayList<>();
    }

    public boolean submit(BookOrder bookOrder) {
        return this.archive.add(bookOrder);
    }

    public List<BookOrder> getArchive() {
        return this.archive;
    }
}
