package pe.uni.fiis.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Principal {
    public static void main (String[] arg){
      Carro c = new Carro("Rojo",100,4);
      Moto m = new Moto("Verde",200,false);
      System.out.println("La velocidad del carro es: "+c.getVelocidad());
        System.out.println("La velocidad de la moto es: "+m.getVelocidad());

      c.acelera();
      m.acelera();
        System.out.println("La aceleracion del carro es: " + c.getVelocidad());
        System.out.println("La aceleracion de la moto es: " + m.getVelocidad());
    }
}
