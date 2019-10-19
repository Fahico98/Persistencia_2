
import static java.lang.Math.PI;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circulo implements FiguraGeometrica{
   
   NumberFormat formatter = new DecimalFormat("#0.00");
   private double radio;
   private double area;
   
   public Circulo(double radio){
      this.radio = radio;
      this.calcularArea();
   }
   
   @Override
   public void calcularArea(){
      this.setArea((PI * this.getRadio() * this.getRadio()));
   }
   
   public String toString(){
      return "Circulo, Radio: " + formatter.format(this.getRadio()) + ", Area: " + formatter.format(this.getArea()) + ";";
   }
   
   public double getRadio() {
      return radio;
   }
   
   public void setRadio(double radio) {
      this.radio = radio;
   }
   
   public double getArea() {
      return area;
   }
   
   public void setArea(double area) {
      this.area = area;
   }
}
