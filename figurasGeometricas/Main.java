public class Main {
    public static void main(String[] args) {
        // Crear instancias de las diferentes figuras geométricas
        Circulo circulo = new Circulo("Círculo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", 4.0, 6.0);
        Triangulo triangulo = new Triangulo("Triángulo", 0.0, 4.0);

        // Calcular y mostrar el área y el perímetro de cada figura
        System.out.println("Information on geometric figures:");
        System.out.println("---------------------------------------");
        System.out.println(circulo.nombre + ":");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("---------------------------------------");
        System.out.println(rectangulo.nombre + ":");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        System.out.println("---------------------------------------");
        System.out.println(triangulo.nombre + ":");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("---------------------------------------");
    }
}
