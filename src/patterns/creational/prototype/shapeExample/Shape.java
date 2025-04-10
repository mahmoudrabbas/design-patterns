package patterns.creational.prototype.shapeExample;

public abstract class Shape implements Cloneable{
    private String id;
    private String type;

    abstract void draw();

    public Object clone() {

        Object clone = null;
        try {
            clone =  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
