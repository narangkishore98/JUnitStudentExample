public class Product {
    int no;
    String name;
    double cost;
    int stock;

    public double getPrice()
    {

        if(cost>=100)
        {
            return (cost*1.3);
        }
        else if (cost>=50 && cost<100)
        {
            return cost*1.35;
        }
        else
        {
            return cost*1.45;
        }


    }
    public boolean chkStock()
    {
        return stock>=10?true:false;

    }
    public double chkDiscount()
    {
        if(getPrice()>=100)
        {
           return getPrice() - getPrice() * 0.5 ;
        }
        if(getPrice()>=40 && getPrice()<100)
        {
            return getPrice() - getPrice() * 0.1;
        }
        return getPrice();
    }
    public Product(int no, String name, double cost, int stock) {
        this.no = no;
        this.name = name;
        this.cost = cost;
        this.stock = stock;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
