
public class TrianguloEscaleno extends TrianguloRectangulo{
   
   public TrianguloEscaleno(double base, double altura){
      super(base, altura);
      super.calcularArea();
   }
   
   @Override
   public void calcularArea() {
      super.calcularArea();
   }
   
   public String toString(){
      return "Triangulo escaleno, Base: " + super.formatter.format(this.getBase()) + ", Altura: " +
         super.formatter.format(this.getAltura()) + ", Area: " + super.formatter.format(this.getArea()) + ";";
   }
}
