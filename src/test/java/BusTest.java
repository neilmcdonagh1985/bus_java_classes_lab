import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 3);
    }

    @Test
    public void BusStartEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void checkCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void canAddPerson() {
        bus.addPerson(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRejectPerson() {
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals("Get off moi bus", bus.addPerson(person));

    }

    @Test
    public void canRemovePerson() {
        bus.addPerson(person);
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(1, bus.passengerCount());
    }
}
