import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Currency;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class CurrencyConverterMain {
    public static void main(String[] args) throws IOException {
        // esta linea usa funcional. stream = itemize the string. for each itera(e->"imprime cada iteracion")
       // Currency.getAvailableCurrencies().stream().forEach(e-> System.out.println(e));

            //converts from MXN to dollars
        System.out.println("enter desired currency");
            Scanner sc1 = new Scanner(System.in);
            String currency = sc1.next();

            currencyInput (currency);
        double amount = sc1.nextDouble();

        double exchangeRate = 19.95;

        double convertion = 0;

        }
    public static String currencyInput(String input) {
        for (Currency element : Currency.getAvailableCurrencies()) {
            if (element.equals(input)) {
                System.out.println(input);
                return input;

            }
        }
        System.out.println(input);
        return input;
    }

}

