package tarea_clase_abstracta_b;

public class Revista extends Publicacion implements PrestaRevista{

    private int numero;

    public Revista(String codigo, String titulo, String estado, int añoPublicacion, int numero) {
        super(codigo, titulo, estado, añoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String toString(){
        return "Código: " + this.getCodigo() + "\n" +
        "Título: " + this.getTitulo() + "\n" +
        "Estado: " + this.getEstado() + "\n" +
        "Año de publicación: " + this.getAñoPublicacion() + "\n" + 
        "Número: " + this.getNumero() + "\n";
    }

    @Override
    public String prestar() {
       
        return null;
    }

    @Override
    public String devolver() {
        
        return null;
    }

    @Override
    public String numero() {
        
        return null;
    }
}
