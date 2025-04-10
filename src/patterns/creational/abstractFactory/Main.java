package patterns.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory absFactory = FactoryProducer.getFactory(true);

        Shape rs = absFactory.getShape("Square");

        rs.draw();

        Shape rc = absFactory.getShape("circle");

        rc.draw();


        Shape rr = absFactory.getShape("rectangle");
        rr.draw();

        AbstractFactory absFactoryNormal = FactoryProducer.getFactory(false);
        Shape ns = absFactoryNormal.getShape("Square");

        ns.draw();

        Shape nc = absFactoryNormal.getShape("circle");

        nc.draw();


        Shape nr = absFactoryNormal.getShape("rectangle");
        nr.draw();
    }
}