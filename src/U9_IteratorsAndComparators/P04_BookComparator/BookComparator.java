package U9_IteratorsAndComparators.P04_BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int result = firstBook.getTitle().compareTo(secondBook.getTitle());
        //< 0
        // == 0
        // > 0
        if (result == 0) {
            return Integer.compare(firstBook.getYear(), secondBook.getYear());
            //< 0 -> first < second
            //== 0 -> first == second
            // > 0 -> first > second
        }
        return result;
    }


}