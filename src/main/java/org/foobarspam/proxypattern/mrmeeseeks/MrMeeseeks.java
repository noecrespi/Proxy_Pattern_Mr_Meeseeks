package org.foobarspam.proxypattern.mrmeeseeks;

import java.util.ArrayList;
import java.util.Arrays;
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
    //string[] -> otra forma de llamar a las listas, longitud fija
    private String[] request;
    //list llamanda requetAsList que contiene Strings, longitud variables, metodos definidos
    private List<String> requetAsList;

    //contructor
    public MrMeeseeks(){
        Id = ID_GENERATOR.incrementAndGet();
        sayMessageOnCreate();
    }

    //Método

    //Crear el id
    public Integer getId() {
        return Id;
    }

    // muestra el 1º mensaje que sale en consola
    // I'm Mr Meeseks 1000. Look at meeee!
    private void sayMessageOnCreate(){
        System.out.println("I'm Mr Meeseeks " + getId() + ". Look at meeee!") ;
    }

    // Hay que sobreescribir el método para poder usarlo de tipo string
    @Override
    public String toString() {
        // tenemos que pasar un String y como el id es de tipo numerico tenemos que convertirlo de tipo String
        return getId().toString();
    }

    // obtener el mensaje de la request
    private String getMessageOnRequest(int numMessageOnRequest){
        return messageOnRequest;
    }


    private void setRequest(String request){
        //split lista...
        this.request = request.split(" ");
        this.requetAsList = Arrays.asList(this.request);
    }
    
    public void formulateRequest(String request){
        // 1r llama al set request
        setRequest(request);
        fulfillRequest();
    }

    // llama a las funciones de la request (son las tres últimas frases)
    public void fulfillRequest(){
        //llama para a los Request para que se muestren en pantalla
        sayMessageOnRequest();
        doRequest(getRequest());
        sayMessageOnDone();
    }

    //Supuestamente deberia pasrse dos parametros pero en la app solo se pasa uno por lo que dejo en uno
    public void doRequest(String request) {
        System.out.println(request);
    }

    public String getRequest() {
        return String.join(" ", this.request);
    }

    // pof que se ejecuta cuando se borra
    public void sayMessageOnExplode() {
        System.out.println("Pooooof " + getId());
    }

    // Mensaje que tiene que devolver All done!
    private void sayMessageOnDone(){
        System.out.println("All done!");
    }

    // all done private se ejecuta "say message on done"
    // oh ye se ejecuta en say "message on request" ejecita un metodo llamado getmessage on request y te devuelve un
    // mensaje random entre dos

    // este método tiene que seleccionar una frase random de la request
    public void sayMessageOnRequest(){

    }
}
