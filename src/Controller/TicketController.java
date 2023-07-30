package Controller;

import Model.Entity.Ticket;
import Model.Query.QGeneric;
import Model.Query.QTicket;

import java.util.List;

public class TicketController {
    private QGeneric<Ticket> qTicket;

    public TicketController() {
        qTicket = new QTicket();
    }

    public void create(Ticket ticket) {
        qTicket.create(ticket);
    }

    public void update(Ticket ticket) {
        qTicket.update(ticket);
    }

    public void delete(String idTicket) {
        qTicket.delete(idTicket);
    }

    public List<Ticket> getAll() {
        return qTicket.getAll();
    }

    public Ticket getById(String idTicket) {
        return qTicket.getById(idTicket);
    } 
}
