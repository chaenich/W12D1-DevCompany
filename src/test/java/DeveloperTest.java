import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setup() {
        developer = new Developer("CodingKevin", "XX123456X", 200000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("CodingKevin", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("XX123456X", developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals("200000.0", developer.getSalary().toString());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(20000.0);
        assertEquals("220000.0", developer.getSalary().toString());
    }

    @Test
    public void canPayBonus() {
        assertEquals("2000.0", developer.payBonus().toString());
    }
}
