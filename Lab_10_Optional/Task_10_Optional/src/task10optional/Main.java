package task10optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {

    private static final String BANKS_URL = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first three digits of the bank account: ");
        String bankNumber = scanner.nextLine().trim();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                URI.create(BANKS_URL).toURL().openStream(), Charset.forName("IBM852")))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\t");
                String abbreviatedBankNumber = fields[0].trim();
                String bankName = fields[1].trim();

                if (abbreviatedBankNumber.equals(bankNumber)) {
                    System.out.println("Your account is in: " + bankName);
                    return;
                }
            }
        }
        System.out.println("No bank found for number " + bankNumber);
    }
}
