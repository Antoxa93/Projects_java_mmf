/** Represents a l1_8 untitled1209.
 * @author Anton Nemirovich
 * @version 1.0
 * @since 1.0
 */

public class l1_8 {
    /**
    * Username input from command line
     */
    private String username;

    public static void main(String args[]){
        l1_8 obj = new l1_8();


        if(args.length < 1){
            System.out.println("Incorrect input");
        } else {
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}