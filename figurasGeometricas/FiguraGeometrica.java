// Define the base class GeometricShape
public class FiguraGeometrica {
    protected String nombre;

    // GeometricShape Constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Method to calculate the area (must be implemented by derived classes)
    public double calcularArea() {
        return 0.0;
    }
    
   // Method to calculate the perimeter (must be implemented by derived classes)
    public double calcularPerimetro() {
        return 0.0;
    }
}

// Define the Circle derived class
class Circulo extends FiguraGeometrica {
    private double radio;

    // Circle Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Override the calculateArea method for the circle
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    // Overrides the calculatePerimeter method for the circle
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Definition of the Rectangle derived class
class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Rectangle Constructor
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // Sobrescribe el método calcularArea para el rectángulo
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    // Override the calculatePerimeter method for the rectangle
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

// Definition of the Triangle derived class
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    // Triangle constructor
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base y altura deben ser mayores que cero. Error: División entre cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    // Override the calculateArea method for the triangle
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    // Overrides the calculatePerimeter method for the triangle
    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }
}


