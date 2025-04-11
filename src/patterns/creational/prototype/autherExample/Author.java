package patterns.creational.prototype.autherExample;

public class Author implements Prototype<Author>{
    private String name;
    private String job;

    public Author() {
    }

    public Author(String name, String job){
        iamCallingDatabase();
        this.name = name;
        this.job = job;
        System.out.println("Calling Database Is Done.");
    }

    private void iamCallingDatabase(){
        try {
            System.out.println("Loading data from database...");
            Thread.sleep(4000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public Author clone() {
        Author copy = new Author();

        copy.setName(this.getName());
        copy.setJob(getJob());


        return copy;
    }


    public void printInfo(){
        System.out.println("Name: "+this.name+", Job is "+this.job);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


