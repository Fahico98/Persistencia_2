
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   
   static Escritor escritor = new Escritor();
   
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("**** BIENVENIDO ****\n");
      
      mainLoop:
      while(true){
         System.out.print(
            "Opciones:\n" +
            "  1. Cuadrado.\n" +
            "  2. Rectangulo.\n" +
            "  3. Triángulo rectángulo.\n" +
            "  4. Triángulo escaleno.\n" +
            "  5. Trapecio.\n" +
            "  6. Poligono irregular.\n" +
            "  7. Circulo.\n" +
            "  8. Elipse.\n" +
            "  9. Salir.\n\n-> "
         );
         String option = br.readLine();
         switch(option){
            case "1":
            case "1.":
               System.out.print("Lado: ");
               double lado = Double.parseDouble(br.readLine());
               Cuadrado cuadrado = new Cuadrado(lado);
               escritor.escribir(cuadrado.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "2":
            case "2.":
               System.out.print("Lado mas corto: ");
               double ladoMenor = Double.parseDouble(br.readLine());
               System.out.print("Lado mas largo: ");
               double ladoMayor = Double.parseDouble(br.readLine());
               Rectangulo rectangulo = new Rectangulo(ladoMenor, ladoMayor);
               escritor.escribir(rectangulo.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "3":
            case "3.":
               System.out.print("Base: ");
               double base_R = Double.parseDouble(br.readLine());
               System.out.print("Altura: ");
               double altura_R = Double.parseDouble(br.readLine());
               TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(base_R, altura_R);
               escritor.escribir(trianguloRectangulo.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "4":
            case "4.":
               System.out.print("Base: ");
               double base_E = Double.parseDouble(br.readLine());
               System.out.print("Altura: ");
               double altura_E = Double.parseDouble(br.readLine());
               TrianguloEscaleno trianguloEscaleno = new TrianguloEscaleno(base_E, altura_E);
               escritor.escribir(trianguloEscaleno.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "5":
            case "5.":
               System.out.print("Base inferior: ");
               double baseInferior = Double.parseDouble(br.readLine());
               System.out.print("Base superior: ");
               double baseSuperior = Double.parseDouble(br.readLine());
               System.out.print("Altura: ");
               double altura = Double.parseDouble(br.readLine());
               Trapecio trapecio = new Trapecio(baseInferior, baseSuperior, altura);
               escritor.escribir(trapecio.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "6":
            case "6.":
               System.out.println(
                  "Ingrese las coordenadas de los cuatro vertices del poligono irregular en parejas (x,y) separadas\n" + 
                  "por espacio comenzando por el vertice que está en la esquina superior izquierda del poligono avanzando\n" +
                  "en el sentido de las manecillas del reloj..."
               );
               String buffer;
               System.out.print("Punto 1 -> ");
               buffer = br.readLine();
               double[] p1 = new double[]{
                  Double.parseDouble(buffer.split(" ")[0]),
                  Double.parseDouble(buffer.split(" ")[1])
               };
               System.out.print("Punto 2 -> ");
               buffer = br.readLine();
               double[] p2 = new double[]{
                  Double.parseDouble(buffer.split(" ")[0]),
                  Double.parseDouble(buffer.split(" ")[1])
               };
               System.out.print("Punto 3 -> ");
               buffer = br.readLine();
               double[] p3 = new double[]{
                  Double.parseDouble(buffer.split(" ")[0]),
                  Double.parseDouble(buffer.split(" ")[1])
               };
               System.out.print("Punto 4 -> ");
               buffer = br.readLine();
               double[] p4 = new double[]{
                  Double.parseDouble(buffer.split(" ")[0]),
                  Double.parseDouble(buffer.split(" ")[1])
               };
               PoligonoIrregular poligono = new PoligonoIrregular(p1, p2, p3, p4);
               escritor.escribir(poligono.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "7":
            case "7.":
               System.out.print("Radio: ");
               double radio = Double.parseDouble(br.readLine());
               Circulo circulo = new Circulo(radio);
               escritor.escribir(circulo.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "8":
            case "8.":
               System.out.print("Radio mayor: ");
               double radioMayor = Double.parseDouble(br.readLine());
               System.out.print("Radio menor: ");
               double radioMenor = Double.parseDouble(br.readLine());
               Elipse elipse = new Elipse(radioMayor, radioMenor);
               escritor.escribir(elipse.toString());
               System.out.println("\nLos datos se almacenaron con exito...\n");
               break;
            case "9":
            case "9.":
               System.out.println("\n*** FIN DEL PROGRAMA ***");
               break mainLoop;
            default:
               System.out.println("\nLa opción ingresada es invalida.\nPor favor intentelo de nuevo.\n");
               continue;
         }
      }
   }
}
