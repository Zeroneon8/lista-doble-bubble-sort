package listadobleordenamiento.entidad;

public class Informacion {
    public int codigo;
    public String nombre;
    public int valor;

    public Informacion(int codigo, String nombre, int valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo;
    }
    
}
