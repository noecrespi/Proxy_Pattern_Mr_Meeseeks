package org.foobarspam.proxypattern.mrmeeseeks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MrMeeseeks {

    // 1 crear la clase
    //2 crear los atributos

    // ATRIBUTOS
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    private Integer Id;
    private String messageOnRequest;
    private String messageOnDone;
    private String messageOnExplore;
    // lista de string []
    private String[] request;
    private List<String> requetAsList;

    public MrMeeseeks(){
        Id = ID_GENERATOR.incrementAndGet();
    }

    //Contructores
    public Integer getId() {
        return Id;
    }

    // esta mal, no lo entiendo

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
