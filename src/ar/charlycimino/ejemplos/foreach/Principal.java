package ar.charlycimino.ejemplos.foreach;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("FakeCar");

        c.agregarAuto(new Auto("123", "Rojo"));
        c.agregarAuto(new Auto("234", "Verde"));
        c.agregarAuto(new Auto("546", "Azul"));

        c.mostrarAutos();

    }

}
