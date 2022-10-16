import java.util.Scanner;

public class l1_3 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String[] arr = get.nextLine().split(" ");

        double[] arrD= new double[arr.length];
        double count = 0;
        for(int i = 0; i < arr.length; ++i){
            arrD[i] = Double.parseDouble(arr[i]);
            count += arrD[i];
        }

        double mean = count / arrD.length;
        double standardDeviation = 0;
        for (double num: arrD) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        System.out.println(mean);
        System.out.println(Math.sqrt(standardDeviation/arrD.length));
    }
}
