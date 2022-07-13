package ar.com.ada.online.second.interfaces;

public interface LivingBeing {
    void eat(String name); //por definición son publicos, por lo cual no es necesario el "public"
    //si pongo private, podría solo usarlo en clases con contrato
    void sleep();
    void communicate();

//public class Name implements LivingBeing {}

}
