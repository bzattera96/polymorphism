package ar.com.ada.online.second.superclass;

import java.util.Date;

public class CanastaBasica extends Articulo {
    //constructor, con "public" porque no es abstracto
    public CanastaBasica (String identificador, String nombre, double costo, Date fechaDeVencimiento){
        super(identificador,nombre,costo,fechaDeVencimiento, true);
    }

    @Override
    public double ObtenerPrecio() {
        return costo * GANANCIA;
    }
}
