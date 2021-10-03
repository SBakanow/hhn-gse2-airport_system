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
    Airline airFrance;
    @Before
    public void setup() {
        flight1 = new Flight(date,  "AB5");
        captain = new Pilot("John Doe");
        firstCoPilot = new Pilot("Jane Dodo");
        secondCoPilot = new Pilot("James Dodo");
        thirdCoPilot = new Pilot("Too many");
        airFrance = new Airline("1234", "Air France");
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
        secondCoPilot.setName("Jane Doe");
        Assert.assertEquals("Jane Doe", secondCoPilot.getName());
    }

    @Test
    public void EmployerTest() {
        captain.setEmployer(airFrance);
        Assert.assertEquals(airFrance, captain.getEmployer());
    }
    
    @Test
    public void AssignmentTest() {
        captain.addAssignment(flight1);
        captain.addAssignment(flight1);
        Assert.assertEquals(1, captain.getAssignments().size());
    }
    
    @Test @Ignore
    public void GeneralFailTest() {
        Assert.assertNotNull(null);
    }
}
