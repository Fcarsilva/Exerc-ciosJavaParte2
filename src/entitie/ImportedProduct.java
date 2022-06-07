package entitie;

public class ImportedProduct extends Products {

    private Double customsFee;


    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = this.customsFee;
    }

    public Double getCustomFee() {
        return customsFee;
    }

    public void setCustomFee(Double customFee) {
        this.customsFee = customFee;
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String toString() {
        return getName()
                + "$"
                + String.format("%.2f", totalPrice())
                + "(Custom fee: $"
                        + String.format("%.2f", customsFee)
                +")";


    }
}
