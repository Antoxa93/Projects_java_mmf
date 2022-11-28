public class Alcohol extends Item{

    int ob;

    Item(){
        this.type = "liquid";
    }

    Item(float price, String name){
        super(price, name, "liquid");
    }

    public int getOb(){
        return ob;
    }

    public void setOb(int ob){
        this.ob = ob;
    }
}
