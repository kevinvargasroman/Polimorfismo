package pe.uni.fiis.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Vehiculo {
    private String color;
    private int cv, ruedas;
    private int velocidad;
 //Constructor
    public Vehiculo(String color, int cv, int ruedas,int velocidad){
         this.color = color;
         this.cv = cv;
         this.ruedas = ruedas;
         this.velocidad = velocidad;
    }

 //Gets and Set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

 //Metodos
    public void acelera(){
        velocidad = cv/20;
    }
    public void frena(){
        velocidad = 0;
    }

}
