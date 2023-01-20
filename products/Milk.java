package JavaOOP_Ds1.products;

public class Milk extends DrinkProduct 
{
    private double fat;
    private String expirationDate;

    public Milk(String name, double price, int quantity, String unit, double volume, double fat, String expirationDate) 
    {
        super(name, price, quantity, unit, volume);
        this.fat = fat;
        this.expirationDate = expirationDate;
    }

    public double getFat() 
    {
        return this.fat;
    }

    public String getExpDate() 
    {
        return this.expirationDate;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, volume: %.2f, fat: %.2f, expiration date: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getVolume(), getFat(), getExpDate());
    }
}