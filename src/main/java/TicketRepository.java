public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];



    public void save(Ticket tckt) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = tckt;
        tickets = tmp;
    }

    // Принимаем за истину, что id уникальный для каждого билета
    public void deleteById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int countToIndex = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getId() != id) {
                tmp[countToIndex] = tickets[i];
            }
            countToIndex++;
        }
        tickets = tmp;
    }

    public Ticket[] getTickets() {
        return tickets;
    }
}
