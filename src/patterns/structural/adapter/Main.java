package patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Mahmoud R Abbas");
        AuthorAdapter adapter = new AuthorAdapter(author);

        adapter.printName();
    }
}
