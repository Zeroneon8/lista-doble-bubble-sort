package listadobleordenamiento;

import listadobleordenamiento.entidad.ListaDoblementeEnlazada;
import listadobleordenamiento.entidad.Informacion;

public class Main {

    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        
        lista.insertarFinal(new Informacion(2, "info2", 300));
        lista.insertarFinal(new Informacion(5, "info5", 990));
        lista.insertarFinal(new Informacion(4, "info4", 670));
        lista.insertarFinal(new Informacion(3, "info3", 100));
        lista.insertarFinal(new Informacion(1, "info1", 720));
        
        System.out.println("Lista antes de ordenar: ");
        lista.imprimirLista();
        
        lista.ordenarPorCodigo();
        
        System.out.println("Lista despues de ordenar: ");
        lista.imprimirLista();
        
        System.out.println("Lista impresa de mayor a menor: ");
        lista.imprimirListaInversa();
        
        System.out.println("Lista impresa de menor a mayor: ");
        lista.imprimirLista();
    }
    
}
