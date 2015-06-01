package sample;

public class Ticket {

    private String ticketId;
    private String ticketName;
    private String ticketLastName;
    private String ticketCategory;
    private String ticketFirstName;
    private String ticketUsername;
    private String ticketDescription;
    private String ticketDate;

    public String getTicketId() {
        return ticketId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public String getTicketLastName() {
        return ticketLastName;
    }

    public String getTicketCategory() {
        return ticketCategory;
    }

    public String getTicketFirstName() {
        return ticketFirstName;
    }

    public void setTicketUsername(String ticketUsername) {
        this.ticketUsername = ticketUsername;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public void setTicketFirstName(String ticketFirstName) {
        this.ticketFirstName = ticketFirstName;
    }

    public void setTicketLastName(String ticketLastName) {
        this.ticketLastName = ticketLastName;
    }

    public void setTicketCategory(String ticketCategory) {
        this.ticketCategory = ticketCategory;
    }
}
