package org.foobarspam.proxypattern.mrmeeseeks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks {



    //ATRIBUTO CONSTANTE
// inicializamos y decimoa que empiece a partir del número mil
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    // ATRIBUTOS
    private Integer Id;
    private String messageOnRequest;
    private String messageOnDone;
    private String messageOnExplore;
    // lista llamda request que contiene string[]
    //string[] -> otra forma de llamar a las listas
    private String[] request;
    //lista llamanda requetAsList que contiene Strings
    private List<String> requetAsList;

    //contructor
    public MrMeeseeks(){
        Id = ID_GENERATOR.incrementAndGet();
        sayMessageOnCreate();
    }

    //Método
    public Integer getId() {
        return Id;
    }

    private void sayMessageOnCreate(){
        System.out.println("I'm Mr Meeseeks " + getId() + ". Look at meeee!") ;
    }

    @Override
    public String toString() {
        // tenemos que pasar un String el id pero el id es un número numerioco tenemos que ...
        return getId().toString();
    }

    private String getMessageOnRequest(int numMessageOnRequest){
        return messageOnRequest;
    }


    
    public void formulateRequest(String request){}

    public void sayMessageOnExplode() {
    }

    public String getRequest() {
        return null;
    }
}
