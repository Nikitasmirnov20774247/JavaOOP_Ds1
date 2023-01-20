package JavaOOP_Ds1.products;

public class Diaper extends KidsProduct
{
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diaper(String name, double price, int quantity, String unit, int minAge, 
    String hypoallergenic, String size, int minWeight, int maxWeight, String type) 
    {
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public int getMinWeight() 
    {
        return this.minWeight;
    }

    public int getMaxWeight() 
    {
        return this.maxWeight;
    }

    public String getSize() 
    {
        return this.size;
    }

    public String getType() 
    {
        return this.type;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, minimum age: %d, hypoallergenic: %s, minWeight: %d, maxWeight: %d, size: %s, type: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getMinAge(), getHypoallergenic(), getMinWeight(), getMaxWeight(), getSize(), getType());
    }
}