import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
    private Company company;

    @Before
    public void setUp() {
        company = new Company();
    }

    // Test 1: Successful pickup
    @Test
    public void testSchedulePickupSuccess() {
        Vehicle vehicle = new Vehicle(4); // A vehicle with 4 seats
        company.addVehicle(vehicle);

        Passenger passenger = new Passenger(
            new Location(10, 20),
            new Location(40, 60)
        );

        boolean scheduled = company.schedulePickup(passenger);
        assertTrue("Expected pickup to be scheduled", scheduled);
    }

    // Test 2: Failed pickup due to no available vehicles
    @Test
    public void testSchedulePickupFailure() {
        Passenger passenger = new Passenger(
            new Location(5, 5),
            new Location(90, 90)
        );

        boolean scheduled = company.schedulePickup(passenger);
        assertFalse("Expected pickup to fail with no available vehicles", scheduled);
    }
}


public class Company {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public boolean schedulePickup(Passenger p) {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.assignPassenger(p);
                return true;
            }
        }
        return false;
    }
}

