/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg251_project_group_one;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class EventTest {
    
    public EventTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEventName method, of class Event.
     */
    //Sanaa
    @Test 
    //Sanaa
    public void testGetEventName() {
        System.out.println("getEventName");
        Event instance = new Event("Cake design workshop", "02:02:23", 25, "Workshop about design cake. Held in 145G in FCIT ");
        String expResult = "Cake design workshop";
        String result = instance.getEventName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class Event.
     */
    
    @Test
    //Ftoon
    public void testGetDate() {
        System.out.println("getDate");
        Event instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSeats method, of class Event.
     */
    @Test
    //Waad
    public void testGetNumberOfSeats() {
        System.out.println("getNumberOfSeats");
        Event instance = null;
        int expResult = 0;
        int result = instance.getNumberOfSeats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescriptionOfEvent method, of class Event.
     */
    @Test
    //Taghreed
    public void testGetDescriptionOfEvent() {
        System.out.println("getDescriptionOfEvent");
        Event instance = null;
        String expResult = "";
        String result = instance.getDescriptionOfEvent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvents method, of class Event.
     */
    @Test
    ////
    public void testGetEvents() {
        System.out.println("getEvents");
        ArrayList<Event> expResult = null;
        ArrayList<Event> result = Event.getEvents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventName method, of class Event.
     */
   
    @Test
    //Sanaa
    public void testSetEventName() {
        System.out.println("setEventName");
        String EventName = "C++ course";
        Event instance = new Event("Java course", "03:02:23", 15, "C++ workshop that let you learn about basic java lessons");
        instance.setEventName(EventName);
          String expResult = "C++ course";
        String result = instance.getEventName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDate method, of class Event.
     */
    @Test
    //ftoon
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Event instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfSeats method, of class Event.
     */
    @Test
    //Waad
    public void testSetNumberOfSeats() {
        System.out.println("setNumberOfSeats");
        int NumberOfSeats = 0;
        Event instance = null;
        instance.setNumberOfSeats(NumberOfSeats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescriptionOfEvent method, of class Event.
     */
    @Test
    //Taghreed
    public void testSetDescriptionOfEvent() {
        System.out.println("setDescriptionOfEvent");
        String descriptionOfEvent = "";
        Event instance = null;
        instance.setDescriptionOfEvent(descriptionOfEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvents method, of class Event.
     */
    @Test
    ///
    public void testSetEvents() {
        System.out.println("setEvents");
        ArrayList<Event> EventsAdded = null;
        Event.setEvents(EventsAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewEvent method, of class Event.
     */
    @Test
    //Sanaa
    public void testAddNewEvent() {
        System.out.println("addNewEvent");
        Event newEventAdded = null;
        String expResult = "";
        String result = Event.addNewEvent(newEventAdded);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEvent method, of class Event.
     */
    @Test
    //Taghreed
    public void testDeleteEvent() {
        System.out.println("deleteEvent");
        String EventName = "";
        String expResult = "";
        String result = Event.deleteEvent(EventName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEvent method, of class Event.
     */
    @Test
    //Waad
    public void testSearchEvent() {
        System.out.println("searchEvent");
        String search1 = "";
        Event expResult = null;
        Event result = Event.searchEvent(search1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showEvent method, of class Event.
     */
    @Test
    //Ftoon
    public void testShowEvent() {
        System.out.println("showEvent");
        Event.showEvent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
