
import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Paths;

public class Compilador {
    public static void main(String[] args) {
        LexAnalyzer lexico = null;
        Parser p = null;
        boolean verificador = true;
        String file = "C:/Users/rodri/Documents/Eclipse-Workspace/Compilador/src/input.txt";
        try{
            lexico = new LexAnalyzer(new FileReader(file));
            p = new Parser (lexico);
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
