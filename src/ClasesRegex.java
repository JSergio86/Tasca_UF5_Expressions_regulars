import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasesRegex {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("src/santako.txt");
        Scanner sc = new Scanner(fileReader);

        List<String> casas = new ArrayList<>();

        while (sc.hasNext()){

            casas.add(sc.nextLine());
        }


        for(int i= 0; i< casas.size(); i++){
            String linea = casas.get(i);

            String expresion = String.valueOf(linea.matches("\\*<]:-DOo"));


        }


    }
}