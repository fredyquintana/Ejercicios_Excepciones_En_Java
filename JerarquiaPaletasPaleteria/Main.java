public class Main {
    public static void main(String[] args) {
        try {
            // Crear una instancia de PaletaAgua y usar sus métodos
            PaletaAgua paletaAgua = new PaletaAgua("Strawberry", -15.0, true);
            paletaAgua.mostrarInformacion();
            paletaAgua.mostrarBaseAgua();
            paletaAgua.cambiarPrecio(2);
            paletaAgua.congelar();
            System.out.println("New price: " + paletaAgua.precio + " pesos");

            // Crear una instancia de PaletaCrema y usar sus métodos
            PaletaCrema paletaCrema = new PaletaCrema("Chocolate", 20.0, true);
            paletaCrema.mostrarInformacion();
            paletaCrema.mostrarTexturaCremosa();
            paletaCrema.cambiarPrecio(2);
            paletaCrema.derretir();
            System.out.println("New price: " + paletaCrema.precio + " pesos");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
