import java.util.Date;

public class Venta {
    private String ticketNumber;
    private Date fecha;
    private String customer;
    private double discount;
    private double totalAmount;

    public Venta(String ticketNumber, Date fecha, String customer, double discount, double totalAmount) {
        this.ticketNumber = ticketNumber;
        this.fecha = fecha;
        this.customer = customer;
        this.discount = discount;
        this.totalAmount = totalAmount;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCustomer() {
        return customer;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}