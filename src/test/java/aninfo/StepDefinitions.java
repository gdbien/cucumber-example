package aninfo;

import aninfo.model.Door;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class StepDefinitions {
    private Door door;

    @Given("A door which starts close")
    public void a_door_which_starts_close() {
        door = new Door(false);
    }

    @When("Trying to open the door")
    public void trying_to_open_the_door() {
        door.open();
    }

    @Then("Door is open")
    public void door_is_open() {
        Assert.assertEquals(door.is_open(), true);
    }

    @Given("A door which starts open")
    public void a_door_which_starts_open() {
        door = new Door(true);
    }

    @When("Trying to close the door")
    public void trying_to_close_the_door() {
        door.close();
    }

    @Then("Door is close")
    public void door_is_close() {
        Assert.assertEquals(door.is_open(), false);
    }
}
