package Personaje;

// Base class
public class Personaje {
    String nombre;
    int nivel;

    public Personaje(String nombre, int nivel) {
        if (nivel < 1) {
            throw new IllegalArgumentException("El nivel no puede ser menor que 1.");
        }
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void atacar() {
        if (nivel < 5) {
            throw new RuntimeException(nombre + " no puede atacar porque su nivel es menor que 5.");
        }
        System.out.println(nombre + " is attacking");
    }
}




// Subclass Player
class Jugador extends Personaje {
    String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    public void usarHabilidadEspecial() {
        System.out.println(nombre + " he is using his special ability as " + clase + ".");
    }
}

// Enemy Subclass
class Enemigo extends Personaje {
    String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    public void gritar() {
        System.out.println(nombre + " is screaming like a " + tipo + ".");
    }
}
