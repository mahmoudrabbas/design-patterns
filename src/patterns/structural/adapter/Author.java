package patterns.structural.adapter;

public class Author {
    private String name;

    public Author(String name){
        this.name = name;
    }

    public void printAuthorName(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
