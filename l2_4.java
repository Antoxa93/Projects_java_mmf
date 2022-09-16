import java.util.Scanner;
import java.text.DecimalFormat;

public class l2_4 {

    public static void main(String[] args) {
        int c = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть температуру в град. Цельсія (ціле число): ");
        c = input.nextInt();

        Double F = (9.0 * c) / 5.0 + 32.0;

        DecimalFormat format = new DecimalFormat();

        format.setDecimalSeparatorAlwaysShown(false);
        System.out.println("Температура у град. за Фаренгейтом: " + format.format(F) );
    }
}
