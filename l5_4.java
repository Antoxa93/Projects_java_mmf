import java.util.ArrayList;

public class l5_4 {
    public static class Town {
        private String town;

        public Town(String town) {
            this.town = town;
        }

        public Town() {
            this.town = "";
        }

        public String getTown() {
            return town;
        }

        public void setWord(String town) {
            this.town = town;
        }
    }


    public static class Region {
        private Town[] towns;

        public Region(){}

        public Region(Town[] words) {
            this.towns = words.clone();
        }

        public Town[] getTowns() {
            return towns;
        }

        public void setWords(Town[] words) {
            this.towns = words;
        }
    }

    public static class Country {
        private Region[] regions;

        public Country() {}
        public Country(Region[] text) {
            this.regions = text;
        }

        public Region[] getText() {
            return regions;
        }


    }


    public static void main(String[] args) {
        Town town1 = new Town("Kiev");
        Town town2 = new Town("Irpen");
        Town town3 = new Town("Borispol");

        Town mas[] = new Town[]{town1, town2, town3};

        Region region1 = new Region(mas);
        Region regions[] = new Region[]{region1};
        Country country = new Country(regions);


    }


}
