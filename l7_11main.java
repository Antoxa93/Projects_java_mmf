import com.dz7_11.shoes;
import com.dz7_11.suit;

public class l7_11main {

    public static void main(String[] args) {
        // 7.11
        suit suit = new suit(46, "red", "cotton", "stylish");
        System.out.println(suit);

        suit.color();

        shoes shoes = new shoes(43, "brown", "leather", "izvestnyybrand");
        System.out.println(shoes);
        shoes.type();

    }

}
