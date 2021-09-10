public class NachoChipDinnerTest {
    public static void main(String[] args) {
        Dinner santitas = new SantitasNacho();
        Dinner tostitos = new TostitosNacho();
        Nacho nacho = santitas.serveNacho("Santitas Tortilla");
        
        }
}
