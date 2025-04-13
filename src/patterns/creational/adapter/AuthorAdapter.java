package patterns.creational.adapter;

public class AuthorAdapter extends OldAuthor{
    Author author;
    public AuthorAdapter(Author author){
        this.author = author;
    }



    public void printName() {
        super.printName(this.author.getName());
    }
}
