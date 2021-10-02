package GSE.AirFrance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

public class TestFlight {

    Flight flight1;
    Date date = new Date();
    @Before
    public void setup() {
        flight1 = new Flight(date, (short) 5);
    }

    @Test
    public void PilotCreationTest() {
        Assert.assertNotNull(flight1);
    }

    @Test @Ignore
    public void GeneralFailTest() {
        Assert.assertNotNull(null);
    }
}
