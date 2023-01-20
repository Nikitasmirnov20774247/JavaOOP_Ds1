package JavaOOP_Ds1.products;

public class DrinkProduct extends Product
{
    private double volume;

    public DrinkProduct(String name, double price, int quantity, String unit, double volume)
    {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    public double getVolume() 
    {
        return this.volume;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, volume: %.2f", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getVolume());
    }
}