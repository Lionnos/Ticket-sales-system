package Model.Business;

import java.util.List;

import Model.Entity.Ticket;
import Model.Query.QGeneric;
import Model.Query.QTicket;

public class BusinessTicket {
    private QGeneric<Ticket> qTicket;

    public BusinessTicket () {
        qTicket = new QTicket();
    }

    
    public void create(Ticket ticket) {
        //
        qTicket.create(ticket);
    }

    public void update(Ticket ticket) {
        //
        qTicket.update(ticket);
    }

    public void delete(String idTicket) {
        //
        qTicket.delete(idTicket);
    }

    public List<Ticket> getAll() {
        //
        return qTicket.getAll();
    }

    public Ticket getById(String idTicket) {
        //
        return qTicket.getById(idTicket);
    }
}
