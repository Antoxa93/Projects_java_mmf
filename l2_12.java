import java.util.ArrayList;

public class l2_12 {
    public static class Airline{
        private String destination, typeOfAirCraft, departureTime, dayWeek;
        private int flNum;

        public Airline(String destination, String typeOfAirCraft, String departureTime, String dayWeek, int flNum) {
            this.destination = destination;
            this.typeOfAirCraft = typeOfAirCraft;
            this.departureTime = departureTime;
            this.dayWeek = dayWeek;
            this.flNum = flNum;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getTypeOfAirCraft() {
            return typeOfAirCraft;
        }

        public void setTypeOfAirCraft(String typeOfAirCraft) {
            this.typeOfAirCraft = typeOfAirCraft;
        }

        public String getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
        }

        public String getDayWeek() {
            return dayWeek;
        }

        public void setDayWeek(String dayWeek) {
            this.dayWeek = dayWeek;
        }

        public int getFlightNumber() {
            return flNum;
        }

        public void setFlightNumber(int flNum) {
            this.flNum = flNum;
        }


        public String toString() {
            String str = "";
            str += "Destination of the plane: " + getDestination() + "\n";
            str += "Flight number: " + getFlightNumber() + "\n";
            str += "Type of aircraft: " + getTypeOfAirCraft() + "\n";
            str += "Departure time: " + getDepartureTime() + "\n";
            str += "Day of the week: " + getDayWeek() + "\n";
            return str;
        }
    }

    public static void test1(ArrayList<Airline> airlines, String destination){
        System.out.println("A list of flights which fly to " + destination + " : ");
        for (Airline airline : airlines){
            if (airline.getDestination().equals(destination)){
                System.out.println("Number : " + airline.flNum +
                        ", Destination: " + airline.destination +
                        ", Type of aircraft: " + airline.typeOfAirCraft +
                        ", Day of week: " + airline.dayWeek +
                        ", Arrival time: " + airline.departureTime);
            }

        }
    }

    public static void main(String[] args) {
        ArrayList<Airline> airlines = new ArrayList<>();
        Airline airline_1 = new Airline("Kyiv",
                "transport",
                "8:40",
                "Mon",
                121);
        Airline airline_2 = new Airline("Rome",
                "pass",
                "10:10",
                "Tue",
                144 );
        Airline airline_3 = new Airline("Warsaw",
                "transport",
                "10:35",
                "Wed",
                169);
        Airline airline_4 = new Airline("Kyiv",
                "transport",
                "12:10",
                "Thu",
                196);
        Airline airline_5 = new Airline("Prague",
                "pass",
                "13:55",
                "Fri",
                225);


        airlines.add(airline_1);
        airlines.add(airline_2);
        airlines.add(airline_3);
        airlines.add(airline_4);
        airlines.add(airline_5);

        test1(airlines, "Kyiv");
    }
}
