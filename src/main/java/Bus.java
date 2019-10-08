import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPerson(Person person) {
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
        System.out.println("Get off moi bus");
    }



    public Person removePerson() {
        return this.passengers.remove(0);
    }
}
