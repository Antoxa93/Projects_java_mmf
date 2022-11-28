public class dz2_32 {
    static String Cesar (String stroka, int sdvig){
        String result = "";
        String alphabet[] = {"a", "b", "c", "d", "e",
                            "f", "g", "h", "i", "j",
                            "k", "l", "m", "n", "o",
                            "p", "q", "r", "s", "t",
                            "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < stroka.length(); i++){
            String bukva = stroka.charAt(i) + "";
            int num_in_alp = 0;
            while (true){
                if (num_in_alp == alphabet.length) {
                    break;
                }
                if (bukva.equals(alphabet[num_in_alp])){
                    break;
                }
                num_in_alp++;
            }
            if (num_in_alp == alphabet.length){
                result += bukva;
            } else {
                int new_num = (num_in_alp + sdvig) % alphabet.length;
                result += alphabet[new_num];
            }
        }
        return result;
    }

    public static void main (String[] args){
        System.out.println(Cesar("Odin Dva Tri", 3));

    }
}
