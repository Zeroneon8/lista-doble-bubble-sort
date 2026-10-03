package listadobleordenamiento.entidad;

public class NodoDoble {
    public Informacion info;
    public NodoDoble rLink;
    public NodoDoble lLink;

    public NodoDoble(Informacion info) {
        this.info = info;
        rLink = null;
        lLink = null;
    }
}
