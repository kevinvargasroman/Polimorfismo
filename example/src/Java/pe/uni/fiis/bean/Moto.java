package pe.uni.fiis.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Moto extends Vehiculo {
        private Boolean repararCadena;
 //Constructor
    public Moto (String color, int cv, Boolean repararCadena){
        super(color,cv,2,30);
        this.repararCadena = repararCadena;
    }


}
