package JavaOOP_Ds1.products;

public class Product 
{
    private String name;
    private double price;
    private int quantity;
    private String unit;

    public Product(String name, double price, int quantity, String unit) 
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getName() 
    {
        return this.name;
    }

    public double getPrice() 
    {
        return this.price;
    }

    public int getQuantity() 
    {
        return this.quantity;
    }

    public String getUnit() 
    {
        return this.unit;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit());
    }
}