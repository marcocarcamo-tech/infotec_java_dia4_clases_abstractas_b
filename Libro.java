package tarea_clase_abstracta_b;

public class Libro extends Publicacion implements PrestaLibro{

    private boolean prestado = false;

    public Libro(String codigo, String titulo, String estado, int añoPublicacion) {
        super(codigo, titulo, estado, añoPublicacion);
        
    }
    

    public boolean isPrestado() {
        return this.prestado;
    }

    public boolean getPrestado() {
        return this.prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String toString(){
        return "Código: " + this.getCodigo() + "\n" +
        "Título: " + this.getTitulo() + "\n" +
        "Estado: " + this.getEstado() + "\n" +
        "Año de publicación: " + this.getAñoPublicacion() + "\n" + 
        "Prestado: " + this.getPrestado() + "\n";
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
    public String prestado() {
        
        return null;
    }
}
