package org.foobarspam.proxypattern.mrmeeseeks;

import java.util.Collection;
import java.util.NavigableSet;

//singelton
public class BoxProxyMrMeeseeks {


    // Atributo
    // declara un objeto que es instanciado de la clase BoxProxyMrMeeseeks
    private static BoxProxyMrMeeseeks instanceBox;

    // Constructor
    private BoxProxyMrMeeseeks(){};


    public static BoxProxyMrMeeseeks getInstanceBox() {
        // Creamos un condional por para asegurarnos que el atributo exista siempre
        // si el atributo no estaba creado con este condicional creamos un nuevo instanceBox
        if(instanceBox == null) {
            instanceBox = new BoxProxyMrMeeseeks();
        }
        return instanceBox;
    }

    private MrMeeseeks createMrMeeseeks(){
        return new MrMeeseeks();
    }

    public void pushButton(Collection<MrMeeseeks> setMrMe) {
        // pasa coleccion y hay que añadir un mr a la colección
        MrMeeseeks newMrMeeseeks = createMrMeeseeks();
        setMrMe.add(newMrMeeseeks);
    }


}
