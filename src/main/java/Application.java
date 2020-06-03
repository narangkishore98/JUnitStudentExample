public class Application
{
    Product[] products = {
            new Product(1, "Tea",6.99, 40),
            new Product(2, "Coffee",7.99, 40),
            new Product(3, "Bagel",10.99, 5),
            new Product(4, "Light Cup",79.99, 200),
            new Product(5, "Flour",109.99, 40),
            new Product(6, "Ice Cream",100, 45),
            new Product(7, "Muffins",99.99, 450)
    };

    public double findPrice(String name)
    {
        for(Product p:products)
        {
            if(p.name.equalsIgnoreCase(name))
            {
                if(p.chkDiscount() != p.getPrice())
                {
                    return p.chkDiscount();
                }
                return p.getPrice();
            }
        }
        return 0.0;
    }
    public int checkStock()
    {
        int count = 0;
        for(Product p : products)
        {
            if(!p.chkStock())
            {
                count++;
            }

        }
        return count;

    }

}
