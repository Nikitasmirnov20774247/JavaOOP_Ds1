package JavaOOP_Ds1;

import JavaOOP_Ds1.products.*;
import java.util.ArrayList;
import java.util.List;

public class Program 
{

    public static void printProducts(Object element) 
    {
        System.out.printf("\n %s", element);
    }
  
    public static void main(String[] args) 
    {

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Скрепки", 82, 100, "шт"));
        products.add(new Product("Тетратки", 370, 20, "шт"));
        products.add(new Product("Ручки", 138, 2, "упаковки"));

        products.add(new FoodProduct("Колбаса", 334.99, 2, "л", "30.12.2023"));
        products.add(new FoodProduct("Сыр", 740.4, 1, "кг", "27.11.2023"));
        products.add(new Bread("Чёрный хлеб", 83.5 , 1, "шт", "23.11.2023", "rye"));
        products.add(new Bread("Белый хлеб", 216.3, 2, "шт", "12.12.2023", "wheat"));
        products.add(new Eggs("Яйца куриные", 258.7, 1, "упаковка", "15.11.2023", 30));
        
        products.add(new DrinkProduct("Pepsi Cola", 421, 2, "бутылка", 2));
        products.add(new Lemonade("Лимонад газированный", 178, 2, "бутылка", 0.5));
        products.add(new Milk("Молоко простоквашино", 189, 1, "бутылка", 0.93, 3.4, "16.11.2023"));
        
        products.add(new HygieneProduct("Зубная паста colgate", 248, 1, "упаковка", 1));
        products.add(new HygieneProduct("Одноразовая бритва gillette", 632, 1, "упаковка", 8));
        products.add(new Masks("Маска для лица", 480.4, 1, "упаковка", 5));
        products.add(new ToiletPaper("Туалетная бумага Zeva", 391, 1, "упаковка", 8, 3));

        products.add(new KidsProduct("Пюре ФрутоНяня", 189, 3, "шт", 1, "Yes"));
        products.add(new Pacifier("Соска силиконовая", 541, 1, "шт", 0, "Yes"));
        products.add(new Diaper("Подгузники Pumpers", 599, 20, "шт", 0, "Yes", "2", 3, 6, "New Baby Dry"));
        
        for(Product element : products)
        {
            printProducts(element);
        }
    }
}