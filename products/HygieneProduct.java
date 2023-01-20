package JavaOOP_Ds1.products;

public class HygieneProduct extends Product 
{
    private int piecesPerPack;

    public HygieneProduct(String name, double price, int quantity, String unit, int piecesPerPack) 
    {
        super(name, price, quantity, unit);
        this.piecesPerPack = piecesPerPack;
    }

    public int getPiecesPerPack() 
    {
        return this.piecesPerPack;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, pieces per pack: %d", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getPiecesPerPack());
    }
}