package listadobleordenamiento.entidad;

public class ListaDoblementeEnlazada {
    private NodoDoble inicio = null;
    private NodoDoble fin = null;
    
    public void insertarFinal(Informacion info) {
        NodoDoble nuevo = new NodoDoble(info);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.rLink = nuevo;
            nuevo.lLink = fin;
            fin = nuevo;
        }
    }
    
    public void ordenarPorCodigo() {
        if (inicio != null) {
            boolean cambiado;            
            do {
                cambiado = false;
                NodoDoble actual = inicio;
                
                while (actual.rLink != null) {
                    if (actual.info.codigo > actual.rLink.info.codigo) {
                        Informacion aux = actual.info;
                        actual.info = actual.rLink.info;
                        actual.rLink.info = aux;
                        cambiado = true;
                    }
                    actual = actual.rLink;
                }
            } while (cambiado);
        }
    }
    
    public void imprimirLista() {
        if (inicio == null) {
            System.out.println("La lista esta vacia.");
        } else {
            String cadena = "null <->";
            NodoDoble actual = inicio;
            while (actual != null) {
                cadena += actual.info + " <-> ";
                actual = actual.rLink;
            }
            System.out.println(cadena + "null");
        }
    }
    
    public void imprimirListaInversa() {
        if (fin == null) {
            System.out.println("La lista esta vacia.");
        } else {
            String cadena = "null <->";
            NodoDoble actual = fin;
            while (actual != null) {
                cadena += actual.info + " <-> ";
                actual = actual.lLink;
            }
            System.out.println(cadena + "null");
        }
    }
}
