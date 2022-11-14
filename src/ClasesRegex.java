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

        Pattern pareNoel = Pattern.compile("(\\*<]:-DOo)|(>:o\\))|([^\\*]<]:-D)");

        int paranoel = 0;
        int rens = 0;
        int follets = 0;


        while (sc.hasNext()) {
            String line = sc.nextLine();

            Matcher mpn = pareNoel.matcher(line);

            while (mpn.find()) {
                if (mpn.group(1) != null) paranoel++;
                if (mpn.group(2) != null) rens++;
                if (mpn.group(3) != null) follets++;
            }

            if (paranoel > 0) System.out.printf(" Pare Noel (%d)", paranoel);
            if (rens > 0) System.out.printf(" Ren (%d)", rens);
            if (follets > 0) System.out.printf(" Follet(%d)", follets);

            paranoel = follets = rens = 0;
            System.out.println();


        }
    }
}