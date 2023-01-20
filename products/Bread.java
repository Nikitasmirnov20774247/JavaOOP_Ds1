package JavaOOP_Ds1.products;

public class Bread extends FoodProduct 
{
    private String typeOfFlour;

    public Bread(String name, double price, int quantity, String unit, String expirationDate, String typeOfFlour) 
    {
        super(name, price, quantity, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    public String getTypeOfFlour() 
    {
        return this.typeOfFlour;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, expiration date: %s, type of flour: %s", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getExpDate(), getTypeOfFlour());
    }
}
