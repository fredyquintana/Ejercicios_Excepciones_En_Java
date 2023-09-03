// Base class that represents a palette
public class Paleta {
    protected String sabor;
    protected double precio;

    // Constructor of the Palette class
    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    // Method to display palette information
    public void mostrarInformacion() {
        System.out.println("Flavor: " + sabor);
        System.out.println("Price: " + precio + " pesos");
    }

    // Method to change the price of the palette
    public void cambiarPrecio(double cambio) {
        if (cambio < 0) {
            throw new IllegalArgumentException("El cambio de precio no puede ser negativo.");
        }
        precio += cambio;
    }
}

// Derived class that represents a palette of water
class PaletaAgua extends Paleta {
    private boolean baseAgua;

    // Constructor of the class PaletteWater
    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    // Method to show if the palette is water-based
    public void mostrarBaseAgua() {
        System.out.println("Water base: " + baseAgua);
    }

    // Method to freeze the water palette *Additional functionality*
    public void congelar() {
        System.out.println("The flavor palette " + sabor + " has frozen.");
    }
}

// Derived class representing a cream palette
class PaletaCrema extends Paleta {
    private boolean cremosa;

    // Constructor of the CreamPalette class
    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    // Method to show if the palette has a creamy texture
    public void mostrarTexturaCremosa() {
        System.out.println("Creamy texture: " + cremosa);
    }

    // Method to melt the cream palette *Additional functionality*
    public void derretir() {
        System.out.println("The flavor palette " + sabor + " has melted.");
    }

    // Override the changePrice method to adjust the change by an additional 6 pesos
    @Override
    public void cambiarPrecio(double cambio) {
        if (cambio < 0) {
            throw new IllegalArgumentException("El cambio de precio no puede ser negativo.");
        }
        super.cambiarPrecio(cambio + 6);
    }
}

