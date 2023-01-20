package JavaOOP_Ds1.products;

public class Masks extends HygieneProduct 
{
    public Masks(String name, double price, int quantity, String unit, int piecesPerPack) 
    {
        super(name, price, quantity, unit, piecesPerPack);
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, pieces per pack: %d", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getPiecesPerPack());
    }
}