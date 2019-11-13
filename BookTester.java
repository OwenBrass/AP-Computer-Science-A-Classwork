
public class BookTester
{
    public static void main(String[] args)
    {
        Book b1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1000);
        System.out.println(b1);
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPages());
        b1.setTitle("The Silmarillion");
        System.out.println(b1.getTitle());
        b1.setAuthor("Christopher Tolkien");
        System.out.println(b1.getAuthor());
        b1.setPages(800);
        System.out.println(b1.getPages());
    }
}
