
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Cuadrado implements FiguraGeometrica{
   
   NumberFormat formatter = new DecimalFormat("#0.00");
   private double lado;
   private double area;
   
   public Cuadrado(double lado){
      this.lado = lado;
      this.calcularArea();
   }
   
   @Override
   public void calcularArea() {
      this.setArea(this.getLado() * this.getLado());
   }
   
   public String toString(){
      return "Cuadrado, Lado: " + formatter.format(this.getLado()) + ", Area: " + formatter.format(this.getArea()) + ";";
   }
   
   public double getArea() {
      return this.area;
   }

   public double getLado() {
      return lado;
   }

   public void setLado(double lado) {
      this.lado = lado;
   }

   public void setArea(double area) {
      this.area = area;
   }
}
