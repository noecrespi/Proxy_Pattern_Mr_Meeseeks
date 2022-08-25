package org.foobarspam.proxypattern.mrmeeseeks;

import java.util.Collection;
import java.util.NavigableSet;

//singelton
public class BoxProxyMrMeeseeks {


    // atributo
    // declara un objeto
    private static BoxProxyMrMeeseeks instanceBox;

    // ctructor
    private BoxProxyMrMeeseeks(){};


    public static BoxProxyMrMeeseeks getInstanceBox() {
        if(instanceBox == null) {
            instanceBox = new BoxProxyMrMeeseeks();
        }
        return instanceBox;
    }

    private MrMeeseeks createMrMeeseeks(){

    }

    public void pushButton(Collection<MrMeeseeks> setMrMe) {
    }


}
