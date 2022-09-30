public class l2_6 {

    public static void main(String args[]){

        int summ = 0;

        for(String arg: args) {
            summ += Integer.parseInt(arg);
        }

        System.out.println("Sum : " + summ);
    }
}
