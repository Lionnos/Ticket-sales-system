package Controller;

import Model.Entity.Ticket;
import Model.Query.QGeneric;
import Model.Query.QTicket;

import java.util.List;

import IDGenerator.IDGenerator;

public class TicketController {
    private QGeneric<Ticket> qTicket;

    public TicketController() {
        qTicket = new QTicket();
    }

    public void create(Ticket ticket) {
        String id = IDGenerator.generateCustomID();

        if (ticket.getIdTicket() == null || ticket.getIdTicket().isEmpty()) {
            ticket.setIdTicket(id);
        }
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
