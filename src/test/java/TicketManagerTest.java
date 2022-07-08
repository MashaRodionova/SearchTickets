import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    Ticket ticket1 = new Ticket(1, 1005, "SVO", "AYT", 240);
    Ticket ticket2 = new Ticket(2, 10023, "VKO", "AYT", 240);
    Ticket ticket3 = new Ticket(3, 1007, "DME", "TBS", 320);
    Ticket ticket4 = new Ticket(4, 1004, "SVO", "AYT", 600);
    Ticket ticket5 = new Ticket(5, 10051, "SVO", "TBS", 430);
    Ticket ticket6 = new Ticket(6, 1006, "VKO", "AYT", 40);
    Ticket ticket7 = new Ticket(7, 1007, "SVO", "TBS", 400);
    Ticket ticket8 = new Ticket(8, 1008, "SVO", "AYT", 430);
    Ticket ticket9 = new Ticket(9, 1007, "SVO", "TBS", 400);


    TicketManager manager = new TicketManager();

    @Test
    public void test1() {
        manager.getRepo().save(ticket1);
        manager.getRepo().save(ticket2);
        manager.getRepo().save(ticket3);
        manager.getRepo().save(ticket4);
        manager.getRepo().save(ticket5);
        manager.getRepo().save(ticket6);
        manager.getRepo().save(ticket7);
        manager.getRepo().save(ticket8);
        Ticket[] expected = {ticket7, ticket5};
        Ticket[] actual = manager.findAll("SVO", "TBS");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {
        manager.getRepo().save(ticket1);
        manager.getRepo().save(ticket2);
        manager.getRepo().save(ticket3);
        manager.getRepo().save(ticket4);
        manager.getRepo().save(ticket5);
        manager.getRepo().save(ticket6);
        manager.getRepo().save(ticket7);
        manager.getRepo().save(ticket8);
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("SVO", "VKO");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test3() {
        manager.getRepo().save(ticket1);
        manager.getRepo().save(ticket2);
        manager.getRepo().save(ticket3);
        manager.getRepo().save(ticket4);
        manager.getRepo().save(ticket5);
        manager.getRepo().save(ticket6);
        manager.getRepo().save(ticket7);
        manager.getRepo().save(ticket8);
        manager.getRepo().save(ticket9);
        Ticket[] expected = {ticket7, ticket9, ticket5};
        Ticket[] actual = manager.findAll("SVO", "TBS");
        Assertions.assertArrayEquals(expected, actual);

    }

}
