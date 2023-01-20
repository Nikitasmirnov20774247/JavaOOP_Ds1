package JavaOOP_Ds1.products;

public class Eggs extends FoodProduct 
{
    private int piecesPerPack;

    public Eggs(String name, double price, int quantity, String unit, String expirationDate, int piecesPerPack) 
    {
        super(name, price, quantity, unit, expirationDate);
        this.piecesPerPack = piecesPerPack;
    }

    public int getPiecesPerPack() 
    {
        return this.piecesPerPack;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, expiration date: %s, pieces per pack: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getExpDate(), getPiecesPerPack());
    }
}