// Base class with a general VAT calculation method
class TaxCategory {
    public double calculateVAT(double amount) {
        return 0.0; 
    }
}

// Subclass for Retailer (VAT = 18%)
class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}

// Subclass for Wholesaler (VAT = 15%)
class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}

// Subclass for Importer (VAT = 10%)
class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}

// Main class to demonstrate runtime polymorphism
public class EFRISVATDemo {
    public static void main(String[] args) {
        // Creating an array of TaxCategory references
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        // Defining transaction amounts for each taxpayer type
        double[] transactionAmounts = {1000.0, 2000.0, 1500.0};

        // Calculating and printing VAT for each transaction using polymorphism
        for (int i = 0; i < taxpayers.length; i++) {
            double vat = taxpayers[i].calculateVAT(transactionAmounts[i]);
            System.out.println("Transaction " + (i + 1) + " VAT: " + vat);
        }
    }
}

