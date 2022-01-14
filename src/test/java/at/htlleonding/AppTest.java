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

    @Test
    public void shouldAddAResident()
    {
        Building building = new Building(1, new String[]{"John Smith", "Mary Smith"});
        assertNotNull(building.getInitialResidents());
    }

    @Test
    public void residentsShouldIncludeInitialResident()
    {
        Building building = new Building(1, "John Smith");
        assertTrue(building.getResidents().contains("John Smith"));
    }

    @Test
    public void residentsShouldIncludeInitialResidents()
    {
        Building building = new Building(1, new String[]{"John Smith", "Mary Smith"});
        assertTrue(building.getResidents().contains("John Smith"));
        assertTrue(building.getResidents().contains("Mary Smith"));
    }

    @Test
    public void residentsShouldAddResident()
    {
        Building building = new Building(1, new String[]{"John Smith", "Mary Smith"});
        building.addResident("David Smith");
        assertTrue(building.getResidents().contains("David Smith"));
    }

    @Test
    public void residentsShouldRemoveResident()
    {
        Building building = new Building(1, new String[]{"John Smith", "Mary Smith"});
        building.addResident("David Smith");
        building.removeResident("David Smith");
        assertFalse(building.getResidents().contains("David Smith"));
    }
}
