package gse.airfrance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

public class TestFlight {

    Flight flight1;
    Date date = new Date();
    Pilot captain;
    Pilot firstCoPilot;
    Pilot secondCoPilot;
    Pilot thirdCoPilot;
    @Before
    public void setup() {
        flight1 = new Flight(date, (short) 5);
        captain = new Pilot("John Doe");
        firstCoPilot = new Pilot("Jane Doe");
        secondCoPilot = new Pilot("James Dodo");
        thirdCoPilot = new Pilot("Too many");
    }

    @Test
    public void PilotCreationTest() {
        Assert.assertNotNull(flight1);
        flight1.setCaptain(captain);
        Assert.assertNotNull(captain);
        Assert.assertEquals(captain, flight1.getCaptain());
        Assert.assertEquals("John Doe", captain.getName());
    }
    
    @Test
    public void CoPilotCreationTest() {
        Assert.assertNotNull(flight1);
        flight1.addCoPilot(firstCoPilot);
        flight1.addCoPilot(secondCoPilot);
        flight1.addCoPilot(thirdCoPilot);
        Assert.assertNotNull(firstCoPilot);
        Assert.assertNotNull(secondCoPilot);
        Assert.assertEquals(2, flight1.getCoPilots().length);
    }

    @Test @Ignore
    public void GeneralFailTest() {
        Assert.assertNotNull(null);
    }
}
