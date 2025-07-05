import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    // Constructor that takes a Company object
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random(); 
    }

    // requestPickup method
    public boolean requestPickup() {
        // Generating random coordinates between 0 and 100
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));

        // Creating a new Passenger with the generated locations
        Passenger passenger = new Passenger(pickup, destination);

        // scheduling the passenger using the Company
        return company.schedulePickup(passenger);
    }
}


class Location {
    private int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and possibly setters
}

class Passenger {
    private Location pickup, destination;

    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
    }

    // Getters and other logic
}

class Company {
    public boolean schedulePickup(Passenger p) {
        // Logic to find an available vehicle
        return true; // Or false if no vehicle is available
    }
}

