package compilador;

import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Paths;

public class Compilador {
    public static void main(String[] args) {
        LexAnalyzer lexico = null;
        parser p = null;

        String file = "C:/Users/Familia/Desktop/UFF/trabalhoCompiladores/2017.1/input.txt";
        try{
            lexico = new LexAnalyzer(new FileReader(file));
            p = new parser (lexico);
            p.parse();
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
