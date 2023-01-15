public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(new ConcreteFactory1());
        factory.birlestir();
        System.out.println("----------------");
        factory = new Factory(new ConcreteFactory2());
        factory.birlestir();
    }
}