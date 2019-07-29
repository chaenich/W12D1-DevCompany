import org.junit.Before;
import org.junit.Test;

import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void setup() {
    manager = new Manager("Bill", "NE123456A", 100000.0, "Research2");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Research2", manager.getDeptName());
    }
    @Test
    public void canGetName() {
        assertEquals("Bill", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("NE123456A", manager.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals("100000.0", manager.getSalary().toString());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(20000.0);
        assertEquals("120000.0", manager.getSalary().toString());
    }

    @Test
    public void canPayBonus() {
        assertEquals("1000.0", manager.payBonus().toString());
    }
}

