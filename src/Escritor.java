
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;

public class Escritor {
   
   private static final String
      DIRECTORIO_PRINCIPAL = System.getProperty("user.dir").replaceAll(Matcher.quoteReplacement("\\"), "/"),
      RUTA_PERSISTENTE = DIRECTORIO_PRINCIPAL + "/src/persistente.txt";
   
   private PrintWriter pw;
   private FileWriter fw;
   
   public void escribir(String line){
      this.abrir();
      this.pw.println(line);
      this.cerrar();
   }
   
   public void abrir(){
      try{
         this.fw = new FileWriter(RUTA_PERSISTENTE, true);
         this.pw = new PrintWriter(this.fw);
      }catch(IOException e){
         System.out.println("ERROR: " + e.getMessage());
      }
   }
   
   public void cerrar(){
      try{
         this.fw.close();
         this.pw = null;
      }catch(IOException e){
         System.out.println("ERROR: " + e.getMessage());
      }
   }
}
