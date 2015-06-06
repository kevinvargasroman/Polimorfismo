package pe.uni.fiis.Polimorfismo.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Principal {
    public static void main(String[] arg){
       Numero num = new Numero();
        num.set(10,5.5);
        System.out.println("El valor de los atributos: num1=" +num.getNum1() +" num2=" +num.getNum2());
    }
}
