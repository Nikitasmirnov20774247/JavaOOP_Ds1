package JavaOOP_Ds1.products;

public class Pacifier extends KidsProduct 
{
    public Pacifier(String name, double price, int quantity, String unit, int minAge, String hypoallergenic) 
    {
        super(name, price, quantity, unit, minAge, hypoallergenic);
    }

    @Override
    public String toString()
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, minimum age: %d, hypoallergenic: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getMinAge(), getHypoallergenic());
    }
}