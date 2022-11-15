public class l6_3 {

    public static class Elektoprylad{

        private double power = 0;

        private String name = "";


        public Elektoprylad (double pwr, String name) {
            this.power = pwr;
            this.name = name;
        }

        public String getname(){
            return name;
        }

        public double getPower(){
            return power;
        }
    }

    public static void main(String[] args) {
        Elektoprylad pribor1 = new Elektoprylad(2000,"Plita");
        Elektoprylad pribor2 = new Elektoprylad(30,"TV");
        Elektoprylad pribor3 = new Elektoprylad(100,"Holodilnik");
    }
}
