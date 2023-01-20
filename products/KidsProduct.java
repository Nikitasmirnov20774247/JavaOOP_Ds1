package JavaOOP_Ds1.products;

public class KidsProduct extends Product 
{
    private int minAge;
    private String hypoallergenic;

    public KidsProduct(String name, double price, int quantity, String unit, int minAge, String hypoallergenic) 
    {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinAge() 
    {
        return this.minAge;
    }

    public String getHypoallergenic() 
    {
        return this.hypoallergenic;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, minimum age: %d, hypoallergenic: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getMinAge(), getHypoallergenic());
    }
}