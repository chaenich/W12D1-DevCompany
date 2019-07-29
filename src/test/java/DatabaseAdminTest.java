import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void setup() {
        databaseAdmin = new DatabaseAdmin("AdminAnn", "YY123456X", 300000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("AdminAnn", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals("YY123456X", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals("300000.0", databaseAdmin.getSalary().toString());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(20000.0);
        assertEquals("320000.0", databaseAdmin.getSalary().toString());
    }

    @Test
    public void canPayBonus() {
        assertEquals("3000.0", databaseAdmin.payBonus().toString());
    }
}
