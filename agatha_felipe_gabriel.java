import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class agatha_felipe_gabriel {

    public static HashMap<String, Double> metais = new HashMap<>();


    public static void lerArquivo(String file){
        try{
            File obj = new File(file);
            Scanner input = new Scanner(obj);

            while (input.hasNextLine()) {
                String data = input.nextLine();
                String valores[] = data.split(" ");

                metais.put(valores[0], Double.parseDouble(valores[1]));                                                                                                                                 
            }
                                                    
            input.close();

        } catch(IOException e){
            System.out.println("Erro: ");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lerArquivo("Especies.txt");
    }
}
