package pe.uni.fiis.Polimorfismo.bean;

/**
 * Created by usuario on 05/06/2015.
 */
public class Numero {
    private Integer num1=0;
    private Double num2=0.0;

    public void set(Integer num){
      num1=num;
    }
    public void set(Double num){
        num2=num;
    }
    public void set(Integer num1,Double num2){
        this.num1=num1;
        this.num2=num2;
    }
    //Get
    public Integer getNum1() {
        return num1;
    }

    public Double getNum2() {
        return num2;
    }
}
