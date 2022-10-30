package tarea_clase_abstracta_b;

public class Main {
    public static void main(String[] args) {

        //Instancias de ejemplo
        Libro quijote = new Libro("1234", "Don Quijote de la Mancha", "En estante", 2000);

        Revista nature = new Revista("4321", "The neuro science", "En piso 3",  2016, 150);

        //Imprimir información con el método toString()
        System.out.println(quijote.toString());
        System.out.println(nature.toString());
    }
}
