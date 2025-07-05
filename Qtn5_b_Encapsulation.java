public class TransactionRecord {
    // Private fields to encapsulate sensitive data
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String timestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String timestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.timestamp = timestamp;
    }

    // Public getters and setters
    public String getBuyerTIN() {
        return buyerTIN;
    }

    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    // Main method to test the encapsulated class
    public static void main(String[] args) {
        // Create a transaction
        TransactionRecord transaction = new TransactionRecord(
            "TIN123456", "TIN654321", 120000.50, "2025-07-05 09:00:00"
        );

        // Access data using getters
        System.out.println("Transaction Details:");
        System.out.println("Buyer TIN: " + transaction.getBuyerTIN());
        System.out.println("Seller TIN: " + transaction.getSellerTIN());
        System.out.println("Invoice Amount: UGX " + transaction.getInvoiceAmount());
        System.out.println("Timestamp: " + transaction.getTimestamp());

        // Update data using setters
        transaction.setInvoiceAmount(125000.00);
        System.out.println("\nUpdated Invoice Amount: UGX " + transaction.getInvoiceAmount());
    }
}

