class l6_1_4_1{
    protected  int a = 10;

}

public class l1_4 extends  l6_1_4_1{
    static int b = 5;
    l1_4(){
        b += super.a;
    }
    public void getName(){
        System.out.println(b);
    };

    public static   void main(String[] args){
        l1_4 temp = new l1_4();
        temp.getName();
    }
}

