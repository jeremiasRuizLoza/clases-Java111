

package tiposyobjetos;

import java.awt.Color;

public class Circulo extends FigurasHerencias {
    private double radio;
    private double superficie, perimetro;
    private final double pi = 3.14159265359;
   
   
   public Circulo ( Double r, Color c, Integer x, Integer y){
       super ( c, x, y );
       radio = r;
       
       
   }
   public Circulo (Color c, Integer x, Integer y ){
        super (c, x , y);
   
                }
   public Double getRadio() {
        return radio;
    }
   public void setRadio(Double radio) {
        this.radio = radio;
    }
   public Double superficie () {
        superficie = pi*(radio*radio);
        return superficie;
    }
   public Double perimetro () {
        perimetro = (2*pi) * radio;
        return perimetro;
    }
   
   
}
