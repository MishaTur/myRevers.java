package Homewor2k3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setAugthor("MAHA");
        title.setTitle("Meni 13 minalo");
        content.setContent("LIRIKA");

        author.show();
        title.show();
        content.show();


    }
}
