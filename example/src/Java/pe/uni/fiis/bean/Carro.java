package pe.uni.fiis.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Carro extends Vehiculo {
    private int puertas;

    //Constructor
    public Carro(String color, int cv, int puertas){
        super(color,cv,4,40);
        this.puertas = puertas;

    }




}
