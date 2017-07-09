
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Paths;

public class Compilador {
    public static void main(String[] args) throws Exception {
        LexAnalyzer lexico = null;
        Parser p = null;
        boolean verificador = true;
        String file = "C:/Users/rodri/Documents/Eclipse-Workspace/Compilador/src/input.txt";
        
            lexico = new LexAnalyzer(new FileReader(file));
            p = new Parser (lexico);
            Arvore result = (Arvore)p.parse().value;
            System.out.println(result.toString());
            
    }
    
}
