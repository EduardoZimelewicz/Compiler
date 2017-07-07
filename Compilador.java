
import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Paths;

public class Compilador {
    public static void main(String[] args) {
        LexAnalyzer lexico = null;
        parser p = null;
        boolean verificador = true;
        String file = "C:/Users/Familia/Documents/Eclipse/Compilador/src/input3.txt";
        try{
            lexico = new LexAnalyzer(new FileReader(file));
            p = new parser (lexico);
            p.parse();
            
        } catch(Exception e){
        	verificador = false;
            System.out.println(e.getMessage());
        }
        if(verificador) {
        	System.out.println("Executou sem erros");	
        }
        
    }
    
}
