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

    // printar las dos request (en este caso las dos primeras frases)
    private void setRequest(String request){
        //split divide un objeto de tipo String en un array de cadenas mediante la separación de la cadena en subcadenas
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

    // este método tiene que seleccionar una de las dos frases de la request
    public void sayMessageOnRequest(){
        // variables de los mensajes que queremos mostrar
        String ohYea = "Oh, yeah!";
        String canDo = " Can do!";
        String yesMaAm = ", Yes ma 'am!";

        //creamos una lista con las posibles respuesta de esta request
        ArrayList<String> message = new ArrayList<String>();
        message.add(canDo);
        message.add(yesMaAm);

        // buscará un objeto random de la lista y lo printeará
        for (int i = 1; i < message.size(); i++){
            int index = (int)(Math.random() * message.size());

            // printear el request
            System.out.println(ohYea + message.get(index));
        }
    }
}
