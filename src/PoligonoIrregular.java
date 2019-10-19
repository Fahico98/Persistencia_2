
import static java.lang.Math.pow;
import static java.lang.Math.acos;
import static java.lang.Math.sin;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PoligonoIrregular implements FiguraGeometrica{

   NumberFormat formatter = new DecimalFormat("#0.00");
   private double[] p1, p2, p3, p4;
   private double area;
   
   public PoligonoIrregular(double[] p1, double[] p2, double[] p3, double[] p4){
      this.p1 = p1;
      this.p2 = p2;
      this.p3 = p3;
      this.p4 = p4;
      this.calcularArea();
   }
   
   @Override
   public void calcularArea(){
      double x1 = this.getP1()[0];
      double y1 = this.getP1()[1];
      double x2 = this.getP2()[0];
      double y2 = this.getP2()[1];
      double x3 = this.getP3()[0];
      double y3 = this.getP3()[1];
      double x4 = this.getP4()[0];
      double y4 = this.getP4()[1];
      
      double d_12 = pow(pow(x1 - x2, 2) + pow(y1 - y2, 2), 0.5);
      double d_23 = pow(pow(x2 - x3, 2) + pow(y2 - y3, 2), 0.5);
      double d_34 = pow(pow(x3 - x4, 2) + pow(y3 - y4, 2), 0.5);
      double d_41 = pow(pow(x4 - x1, 2) + pow(y4 - y1, 2), 0.5);
      double d_13 = pow(pow(x1 - x3, 2) + pow(y1 - y3, 2), 0.5);
      
      double alpha_1 = acos((pow(d_23, 2) + pow(d_13, 2) - pow(d_12, 2))/(2 * d_23 * d_13));
      double h1 = d_23 * sin(alpha_1);
      double T1 = (h1 * d_13) / 2;
      
      double alpha_2 = acos(( pow(d_34, 2) + pow(d_13, 2) - pow(d_41, 2))/(2 * d_34 * d_13));
      double h2 = d_34 * sin(alpha_2);
      double T2 = (h2 * d_13) / 2;
      
      this.setArea(T1 + T2);
   }
   
   public String toString(){
      return "Poligono Irregularm, Punto 1: (" + formatter.format(this.getP1()[0]) + ", " + formatter.format(this.getP1()[1]) +
         "), Punto 2: (" + formatter.format(this.getP2()[0]) + ", " + formatter.format(this.getP2()[1]) + "), Punto 3: (" +
         formatter.format(this.getP3()[0]) + ", " + formatter.format(this.getP3()[1]) + "), Punto 4: (" +
         formatter.format(this.getP4()[0]) + ", " + formatter.format(this.getP4()[1]) + "), Area: " + 
         formatter.format(this.getArea()) + ";";
   }
   
   public double[] getP1() {
      return p1;
   }
   
   public void setP1(double[] p1) {
      this.p1 = p1;
   }
   
   public double[] getP2() {
      return p2;
   }
   
   public void setP2(double[] p2) {
      this.p2 = p2;
   }
   
   public double[] getP3() {
      return p3;
   }
   
   public void setP3(double[] p3) {
      this.p3 = p3;
   }
   
   public double[] getP4() {
      return p4;
   }
   
   public void setP4(double[] p4) {
      this.p4 = p4;
   }
   
   public double getArea() {
      return area;
   }
   
   public void setArea(double area) {
      this.area = area;
   }
}
