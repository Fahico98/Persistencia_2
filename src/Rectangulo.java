
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Rectangulo implements FiguraGeometrica{
   
   NumberFormat formatter = new DecimalFormat("#0.00");
   private double ladoMenor;
   private double ladoMayor;
   private double area;
   
   public Rectangulo(double ladoMenor, double ladoMayor){
      this.ladoMenor = ladoMenor;
      this.ladoMayor = ladoMayor;
      this.calcularArea();
   }
   
   @Override
   public void calcularArea() {
      this.setArea(this.getLadoMenor() * this.getLadoMayor());
   }
   
   public String toString(){
      return "Rectangulo, Lado mayor: " + formatter.format(this.getLadoMayor()) + ", Lado menor: " +
         formatter.format(this.getLadoMenor()) + ", Area: " + formatter.format(this.getArea()) + ";";
   }
   
   public double getLadoMenor() {
      return ladoMenor;
   }
   
   public void setLadoMenor(double ladoMenor) {
      this.ladoMenor = ladoMenor;
   }
   
   public double getLadoMayor() {
      return ladoMayor;
   }
   
   public void setLadoMayor(double ladoMayor) {
      this.ladoMayor = ladoMayor;
   }
   
   public double getArea() {
      return area;
   }
   
   public void setArea(double area) {
      this.area = area;
   }
}
