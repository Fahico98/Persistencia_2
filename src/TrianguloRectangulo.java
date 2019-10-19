
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TrianguloRectangulo implements FiguraGeometrica{

   NumberFormat formatter = new DecimalFormat("#0.00");
   private double base;
   private double altura;
   private double area;
   
   public TrianguloRectangulo(double base, double altura){
      this.base = base;
      this.altura = altura;
      this.calcularArea();
   }
   
   @Override
   public void calcularArea() {
      this.setArea((this.getBase() * this.getAltura()) / 2);
   }
   
   public String toString(){
      return "Triangulo rectángulo, Base: " + formatter.format(this.getBase()) + ", Altura: " +
         formatter.format(this.getAltura()) + ", Area: " + formatter.format(this.getArea()) + ";";
   }
   
   public double getBase() {
      return base;
   }
   
   public void setBase(double base) {
      this.base = base;
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
