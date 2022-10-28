
class class3_1 {
    String str;
}
class class3_2 {
    String s1 = "stroka 1";
    String s2;
    public class3_2() {
        s2 = "stroka 2";
    }
    void print() {
        System.out.println(s1);
        System.out.println(s2);
    }
}

class class3_3 {
    public class3_3() {
        System.out.println("stroka 3");
    }
}

class class3_4 {
    public class3_4() {
        System.out.println("stroka 4");
    }
    public class3_4(String text) {
        this();
        System.out.println(text);
    }
}
public class l3_3_1_2_3_4 {
    static void task3_1() {
        class3_1 s = new class3_1();
        System.out.println(s.str);
    }

    static void task3_2() {
        class3_2 c = new class3_2();
        c.print();
    }
    static void task3_3() {
        class3_3 q = new class3_3();
    }
    static void task3_4() {
        class3_4 t = new class3_4("stroka 5");
    }


    public static void main(String[] args) {
        System.out.println("\ntask3_1");
        task3_1();

        System.out.println("\ntask3_2");
        task3_2();

        System.out.println("\ntask3_3");
        task3_3();

        System.out.println("\ntask3_4");
        task3_4();
    }
}