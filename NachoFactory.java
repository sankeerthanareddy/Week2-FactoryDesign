public class NachoFactory {
    public Nacho serveNacho (String type) {
        Nacho nacho = null;

        if (type.equals("Tostitos Baked Scoops")){
            nacho = new TostitosNacho();
        }
        else if (type.equals("Santitas Tortilla")){
            nacho = new SantitasNacho();
        }
        return nacho;
    }
}
