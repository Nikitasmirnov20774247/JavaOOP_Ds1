package JavaOOP_Ds1.products;

public class ToiletPaper extends HygieneProduct 
{
    private int layers;

    public ToiletPaper(String name, double price, int quantity, String unit, int piecesPerPack, int layers) 
    {
        super(name, price, layers, unit, piecesPerPack);
        this.layers = layers;
    }

    public int getQuantityLayers() 
    {
        return this.layers;
    }

    @Override
    public String toString() 
    {
        return String.format("name: %s, price: %.2f, quantity: %d, unit: %s, pieces per pack: %d, layers: %d", 
                                    getName(), getPrice(), getQuantity(), getUnit(), getPiecesPerPack(), getQuantityLayers());
    }
}