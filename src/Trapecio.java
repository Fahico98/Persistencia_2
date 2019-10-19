
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Trapecio implements FiguraGeometrica{
   
   NumberFormat formatter = new DecimalFormat("#0.00");
   private double baseInferior;
   private double baseSuperior;
   private double altura;
   private double area;
   
   public Trapecio(double baseInferior, double baseSuperior, double altura){
      this.baseInferior = baseInferior;
      this.baseSuperior = baseSuperior;
      this.altura = altura;
      this.calcularArea();
   }

   @Override
   public void calcularArea() {
      this.setArea((this.getBaseInferior() + this.getBaseSuperior()) * this.getAltura());
   }
   
   public String toString(){
      return "Trapecio, Base Inferior: " + formatter.format(this.getBaseInferior()) + ", Base Superior: " +
         formatter.format(this.getBaseSuperior()) + ", Altura: " + formatter.format(this.getAltura()) +
         ", Area: " + formatter.format(this.getArea()) + ";";
   }
   
   public double getBaseInferior() {
      return baseInferior;
   }
   
   public void setBaseInferior(double baseInferior) {
      this.baseInferior = baseInferior;
   }
   
   public double getBaseSuperior() {
      return baseSuperior;
   }
   
   public void setBaseSuperior(double baseSuperior) {
      this.baseSuperior = baseSuperior;
   }
   
   public double getAltura() {
      return altura;
   }
   
   public void setAltura(double altura) {
      this.altura = altura;
   }
   
   public double getArea() {
      return area;
   }
   
   public void setArea(double area) {
      this.area = area;
   }
}
