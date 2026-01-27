import java.util.List;
class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice [transactionId=" + transactionId + "]";
    }
}
public class InvoiceCreation {
    public static void main(String[] args) {

        List<String> transactionIds = List.of(
            "TXN1001", "TXN1002", "TXN1003"
        );
                List<Invoice> invoices =
                transactionIds.stream()
                              .map(Invoice::new)   // constructor reference
                              .toList();           // Java 16+

        invoices.forEach(System.out::println);
    }
}