import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader fileReader = new FileReader("src/santako.txt");
        Scanner sc = new Scanner(fileReader);

        List<String> casas = new ArrayList<>();

        while (sc.hasNext()){

            casas.add(sc.nextLine());
        }

        for(int i= 0; i< casas.size(); i++){
            String linea = casas.get(i);

            Pattern todo = Pattern.compile("(\\*<]:-DOo) (>:o\\)) (<]:-D)");
            Matcher todos = todo.matcher(linea);

            while(todos.find()){
                System.out.println("Pare Noel ("+ todos.group(1) +")");
                System.out.println("Rens ("+ todos.group(2) +")");
                System.out.println("Follet ("+ todos.group(3) +")");
            }


        }



    }
}