import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void setup() {
        director = new Director("Bill", "NE123456A",
                100000.0, "Research2", 500000.0);
    }
    @Test
    public void canGetDeptName() {
        assertEquals("Research2", director.getDeptName());
    }
    @Test
    public void canGetName() {
        assertEquals("Bill", director.getName());
    }
    @Test
    public void canGetNiNumber() {
        assertEquals("NE123456A", director.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals("100000.0", director.getSalary().toString());
    }
    @Test
    public void canRaiseSalary() {
        director.raiseSalary(20000.0);
        assertEquals("120000.0", director.getSalary().toString());
    }
    @Test
    public void canPayBonus() {
        assertEquals("1000.0", director.payBonus().toString());
    }
    @Test
    public  void canGetBudget() {
        assertEquals("500000.0", director.getBudget().toString());
    }
}
