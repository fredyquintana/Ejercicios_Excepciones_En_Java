package Personaje;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Aragorn", 1, "Guerrero");
        Enemigo enemigo = new Enemigo("Orco Grun", 4, "Orco");

        jugador.atacar();
        jugador.usarHabilidadEspecial();

        enemigo.atacar();
        enemigo.gritar();
    }
}

