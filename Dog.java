public class Dog {
    private String name;
    private String say;

    Dog(String name, String say){
        this.name = name;
        this.say = say;
    }

    public void display(){
        System.out.printf("%s say %s \n", this.name, this.say);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");

        dog1.display();
        dog2.display();
        Dog dog3 = dog1;

        System.out.println(dog3 == dog1);
        System.out.println(dog3.equals(dog1));
    }
}