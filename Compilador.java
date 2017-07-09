
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Paths;

public class Compilador {
    public static void main(String[] args) throws Exception {
        LexAnalyzer lexico = null;
        parser p = null;
        boolean verificador = true;
        String file = "C:/Users/Familia/Documents/Eclipse/Compilador/src/input.txt";
        
            lexico = new LexAnalyzer(new FileReader(file));
            p = new parser (lexico);
            Arvore result = (Arvore)p.parse().value;
            System.out.println(result.toString());
            
    }
    
}
