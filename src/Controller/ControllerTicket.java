package Controller;

import Model.Business.BusinessTicket;
import Model.Entity.Ticket;

import java.util.List;

public class ControllerTicket {
    private BusinessTicket businessTicket;

    public ControllerTicket() {
        businessTicket = new BusinessTicket();
    }

    public void create(Ticket ticket) {
        businessTicket.create(ticket);
    }

    public void update(Ticket ticket) {
        businessTicket.update(ticket);
    }

    public void delete(String idTicket) {
        businessTicket.delete(idTicket);
    }

    public List<Ticket> getAll() {
        return businessTicket.getAll();
    }

    public Ticket getById(String idTicket) {
        return businessTicket.getById(idTicket);
    } 
}
