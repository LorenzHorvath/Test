package at.htlleonding;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldHaveAnId()
    {
        Building building = new Building(1, "");
        assertNotNull(building.getId());
    }

    @Test
    public void shouldHaveAnInitialResident()
    {
        Building building = new Building(1, "John Smith");
        assertNotNull(building.getInitialResident());
    }

    @Test
    public void shouldHaveInitialResidents()
    {
        Building building = new Building(1, new String[]{"John Smith", "Mary Smith"});
        assertNotNull(building.getInitialResidents());
    }
}
