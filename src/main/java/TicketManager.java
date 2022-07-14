import java.lang.reflect.Array;
import java.util.Arrays;

public class TicketManager {

    private TicketRepository repo = new TicketRepository();
/*
    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }
*/

    public TicketRepository getRepo() {
        return repo;
    }

    /*public Ticket[] findAll(String from, String to) {
        Arrays.sort(repo.getTickets());
        int lengthArray = 0;
        for (Ticket ticket : repo.getTickets()) {
            if (ticket.getDepartureAirport() == from && ticket.getArrivalAirport() == to) {
                lengthArray++;
            }
        }
        Ticket[] tmp = new Ticket[lengthArray];
        int count = 0;
        for (Ticket ticket : repo.getTickets()) {
            if (ticket.getDepartureAirport() == from && ticket.getArrivalAirport() == to) {
                tmp[count] = ticket;
                count++;
            }
        }

        return tmp;

    }*/

    public Ticket[] findAll(String from, String to) {
        int lengthArray = 0;
        for (Ticket ticket : repo.getTickets()) {
            String departureAirport = ticket.getDepartureAirport();
            String arrivalAirport = ticket.getArrivalAirport();
            if (departureAirport.equals(from) && arrivalAirport.equals(to)) {
                lengthArray++;
            }
        }
        Ticket[] tmp = new Ticket[lengthArray];
        int count = 0;
        for (Ticket ticket : repo.getTickets()) {
            String departureAirport = ticket.getDepartureAirport();
            String arrivalAirport = ticket.getArrivalAirport();
            if (departureAirport.equals(from) && arrivalAirport.equals(to)) {
                tmp[count] = ticket;
                count++;
            }
        }
        Arrays.sort(tmp);
        return tmp;

    }

}
