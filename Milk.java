public class Milk extends Item{

    int fat;

    Item(){
        this.type = "liquid";
    }

    Meal(float price, String name){
        super(price, name, "liquid");
    }

    public int getFat(){
        return fat;
    }

    public void setFat(int fat){
        this.fat = fat;
    }
}
