public abstract class Nacho {
    String name;
    String sauce;

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Preparing Sauce " + sauce);
    }
    void sauce(){
        System.out.println("Adding Sauce...");
    }
    void decorate(){
        System.out.println("Decorating the Chips...");
    }
}
