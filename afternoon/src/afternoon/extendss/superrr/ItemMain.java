package afternoon.extendss.superrr;

public class ItemMain {
    public static void main(String[] args) {
        Book book = new Book("책", 10000, "채쌤", "JSP");
        book.print();

        Album album = new Album("앨범", 20000, "뉴진스");
        album.print();
    }
}
