package tarea_clase_abstracta_b;

public class Publicacion {
    private String codigo;
    private String titulo;
    private String estado;
    private int añoPublicacion;

    public Publicacion (String codigo, String titulo, String estado, int añoPublicacion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.estado = estado;
        this.añoPublicacion = añoPublicacion;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public String toString(){
        return null;
    }
}
