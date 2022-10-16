import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class l1_4 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        String[] arr = get.nextLine().split(" ");

        int[] arrI = new int[arr.length];

        for(int i = 0; i < arr.length; ++i){
            arrI[i] = Integer.parseInt(arr[i]);
        }
        Map<Integer,Integer> A = new HashMap();
        for(int x: arrI){

            if(!A.containsKey(x)){
                A.put(x,1);
            }else{
                A.put(x, A.get(x) + 1);
            }
        }
        System.out.println(A);
    }
}
