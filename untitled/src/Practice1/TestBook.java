package Practice1;

public class TestBook {
    public static void main(String[] args)
    {
        Book b1 = new Book("Romance", 560, "Pushkin");
        Book b2 = new Book("Fantasy", 800);
        b2.setAuthor("Pushkin");
        System.out.println(b1);
        System.out.println(b1.output());
        System.out.println(b2.output());
    }
}
