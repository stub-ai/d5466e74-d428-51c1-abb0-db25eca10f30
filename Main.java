import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Venta> ventas = new ArrayList<>(); // Assume this list is populated with Venta objects

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start date (in milliseconds): ");
        long startDateMillis = scanner.nextLong();
        System.out.println("Enter end date (in milliseconds): ");
        long endDateMillis = scanner.nextLong();

        Date startDate = new Date(startDateMillis);
        Date endDate = new Date(endDateMillis);

        System.out.println("Ticket Number | Date | Customer | Discount | Total Amount");
        for (Venta venta : ventas) {
            if (venta.getFecha().after(startDate) && venta.getFecha().before(endDate)) {
                System.out.println(venta.getTicketNumber() + " | " + venta.getFecha() + " | " + venta.getCustomer() + " | " + venta.getDiscount() + " | " + venta.getTotalAmount());
            }
        }
    }
}