package stepDefenitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.chairs_living;

public class step2_Living {
	chairs_living l;
	
	@Then("The user mouse hover to header Living")
	public void the_user_mouse_hover_to_header_living() throws InterruptedException {
	    l=new chairs_living(BaseClass.getDriver());
	    l.HoverToLiving();
	}

	@Then("User retrives the items under the sub-menu Seating&Chairs")
	public void user_retrives_the_items_under_the_sub_menu_seating_chairs() throws IOException, InterruptedException {
	    l.seatingAndChairs();
	}
}
