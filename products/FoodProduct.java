package JavaOOP_Ds1.products;

public class FoodProduct extends Product 
{
    private String expirationDate;

    public FoodProduct(String name, double price, int quantity, String unit, String expirationDate) 
    {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    public String getExpDate() 
    {
        return this.expirationDate;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, expiration date: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getExpDate());
    }
}