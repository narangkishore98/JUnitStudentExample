import org.junit.Test;
import static  org.junit.Assert.*;


public class ApplicationTest {

    @Test
    public void checkApplicaton()
    {
        Application app = new Application();

        //The price of tea is 6.99 has no discount, and the price will fall in last slab and will increase by 45%
        assertEquals(10.1355, app.findPrice("Tea"), 0.001);
        //The product does not exist. the price must be 0
        assertEquals(0.0, app.findPrice("Pasta"),0.0);
        //The price of Flour is 109.99 has discount of 5%, price will increase by 30%
        assertEquals(135.83, app.findPrice("Flour"),0.01);
        //The price of Light Cup is 79.99 has increase of 35% and discount of 5% because the increse of 35% will lead the price over 100 dollars.
        assertEquals(102.58, app.findPrice("Light Cup"), 0.01);
    }
}