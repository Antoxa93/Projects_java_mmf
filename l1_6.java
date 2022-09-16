public class l1_6 {

    public static void main(String args[]){

        double summ = 0;

        for(String arg: args) {
            summ += Double.parseDouble(arg);
        }

        System.out.println("Sum : "+ summ);
    }
}