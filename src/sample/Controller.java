package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    ObservableList<Ticket> ticketData = FXCollections.observableArrayList();

    @FXML
    private TableView<Ticket> tblTicket;
    @FXML
    private TableColumn<Ticket, String> clmID;
    @FXML
    private TableColumn<Ticket, String> clmTicketName;
    @FXML
    private TableColumn<Ticket, String> clmLastName;
    @FXML
    private TableColumn<Ticket, String> clmCategory;
    @FXML
    private TableColumn<Ticket, String> clmFirstName;
    boolean initialised = false;
    private int ticketcounter = 0;

    //TableView wird generiert
    private void TableViewLoad(ObservableList<Ticket> ticketData) {

        if (!initialised) {
            initialised = true;
            clmID.setCellValueFactory(new PropertyValueFactory<Ticket, String>("ticketId"));
            clmTicketName.setCellValueFactory(new PropertyValueFactory<Ticket, String>("ticketName"));
            clmLastName.setCellValueFactory(new PropertyValueFactory<Ticket, String>("ticketLastName"));
            clmCategory.setCellValueFactory(new PropertyValueFactory<Ticket, String>("ticketCategory"));
            clmFirstName.setCellValueFactory(new PropertyValueFactory<Ticket, String>("ticketFirstName"));
        }

        tblTicket.setItems(getTicketData());

    }


    public ObservableList<Ticket> getTicketData() {
        return ticketData;
    }


    @FXML
    private void btnCreateTicket_Click(ActionEvent event) {

        ticketcounter++;
        //Ein neues Ticket wird erstellt
        Ticket newticket = new Ticket();

        //Ticket Parameter werden übergeben
        String value = "some text" + ticketcounter;
        newticket.setTicketUsername(value);
        newticket.setTicketName(value);
        newticket.setTicketId(value);
        newticket.setTicketDescription(value);
        newticket.setTicketDate(value);
        newticket.setTicketFirstName(value);
        newticket.setTicketLastName(value);
        newticket.setTicketCategory(value);

        ticketData.add(newticket);

        TableViewLoad(ticketData);
    }

}
