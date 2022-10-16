public class l1_5 {
    float x = 2.0f;
    String name = "Anything";

    public void func(){
        System.out.print(this.name + this.x);
    }

    public static void main(String[] args) {
        l1_5 tmp = new l1_5();
        tmp.func();
    }
}