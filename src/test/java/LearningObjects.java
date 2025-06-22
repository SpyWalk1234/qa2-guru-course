import model.Address;
import model.Flat;
import model.House;
import model.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LearningObjects {
    @Test
    public void workingWithObjects() {
        User nikita = new User("Nikita", "The Tester");
//        nikita.setFirstName("Nikita");
//        nikita.setLastName("The Tester");
        nikita.setPhone("+371 223 322 22");

        User rachel = new User("Rachel", "The Lawyer");
        rachel.setFirstName("Rachele");//Will override previously put "Rachel" firstName
//        rachel.setLastName("The Lawyer");
        rachel.setPhone("321");

        System.out.println(nikita.getFirstName() + " " + nikita.getLastName() + " " + nikita.getPhone());

        System.out.println(nikita.getFullName() + " " + nikita.getPhone());

        System.out.println(rachel.getFirstName() + " " + rachel.getPhone());
    }

    @Test
    public void workingWithFlats() {
        List<Flat> flats = new ArrayList<>();
        flats.add(new Flat(1));
        flats.add(new Flat(2));
        flats.add(new Flat(3));
        flats.add(new Flat(4));
        flats.add(new Flat(5));

        Address address = new Address("Riga", "Brivibas", 13);

        House houseNr13 = new House();
        houseNr13.setAddress(address);
        houseNr13.setNr(address.getHouseNr());
        houseNr13.setFlats(flats);

        houseNr13.printHouseDetails();
    }
}
