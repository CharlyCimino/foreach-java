package ar.charlycimino.ejemplos.foreach;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Concesionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
            /*for (int i = 0; i < autos.size(); i++) {
                Auto a = autos.get(i);
                System.out.println(a);
            }*/

            for (Auto a : autos) {
                System.out.println(a);
            }
        }
    }

}
