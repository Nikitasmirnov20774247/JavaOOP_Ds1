package JavaOOP_Ds1.products;

public class Lemonade extends DrinkProduct 
{
    public Lemonade(String name, double price, int quantity, String unit, double volume)
    {
        super(name, price, quantity, unit, volume);
    }
    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, volume: %.2f", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getVolume());
    }
}