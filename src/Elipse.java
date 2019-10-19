
import static java.lang.Math.PI;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Elipse implements FiguraGeometrica{
   
   NumberFormat formatter = new DecimalFormat("#0.00");
   private double radioMayor;
   private double radioMenor;
   private double area;

   public Elipse(double radioMayor, double radioMenor){
      this.radioMayor = radioMayor;
      this.radioMenor = radioMenor;
      this.calcularArea();
   }
   
   @Override
   public void calcularArea() {
      this.setArea(PI * this.getRadioMayor() * this.getRadioMenor());
   }
   
   public String toString(){
      return "Elipse, Radio Mayor: " + formatter.format(this.getRadioMayor()) + ", Radio Menor: " +
         formatter.format(this.getRadioMenor()) + ", Area: " + formatter.format(this.getArea()) + ";";
   }

   public double getRadioMayor() {
      return radioMayor;
   }

   public void setRadioMayor(double radioMayor) {
      this.radioMayor = radioMayor;
   }

   public double getRadioMenor() {
      return radioMenor;
   }

   public void setRadioMenor(double radioMenor) {
      this.radioMenor = radioMenor;
   }

   public double getArea() {
      return area;
   }

   public void setArea(double area) {
      this.area = area;
   }
}
