package girlscouts;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class OrderTest {

	@Test
	public void shouldAddNewOrder() {
		//Arrange
		OrderMasterList newOrder = new OrderMasterList(new HashMap<>());
		
		
		
		
		//Act
		
		int currentOrders = newOrder.getTotalVarietyOrdered();
		newOrder.addOrder(new Order("Thin Mints", 2));
		
		int updatedOrders = newOrder.getTotalVarietyOrdered();
		
		
		//Assert
		
		assertEquals(currentOrders + 1, updatedOrders);
		
		
		
		
	}
	
	@Test 
	public void shouldRemoveVarietyFromOrder() {
		//arrange
		OrderMasterList newOrder = new OrderMasterList(new HashMap<>());
		
		//act
		newOrder.addOrder(new Order("Samoas", 5));
		int currentOrders = newOrder.getTotalVarietyOrdered();
		newOrder.removeVariety("Samoas");
		int updatedOrders = newOrder.getTotalVarietyOrdered();
		
		
		//assert
		assertEquals(updatedOrders, currentOrders - 1);
	}
	
	@Test
	public void shouldUpdateQuantityofOrder() {
		//arrange
		
		OrderMasterList underTest = new OrderMasterList(new HashMap<>());
		
		underTest.addOrder(new Order("Cookies", 5));
		String varietyChoice = "Cookies";
		
		Order varietyChoiceInput = underTest.getQuantityofBoxes(varietyChoice);
		int oldTotal = varietyChoiceInput.numOfBoxes();
		varietyChoiceInput.addBoxes(+2);
		int newTotal = varietyChoiceInput.numOfBoxes();
		
		
		//act
		
		
		
		//assert
		System.out.println(oldTotal);
		System.out.println(newTotal);
		//I just set up output to show that the function was working
		
		
		
	}

	
		@Test
		public void shouldCreateSeperateOrders() {
			//arrange
			OrderMasterList orderTest = new OrderMasterList();
			
			
			orderTest.addOrder(new OrderOne("Thin Mints", 1));
			orderTest.addOrder(new OrderTwo("Samoas", 2));
			orderTest.addOrder(new OrderThree("Tagalongs", 3));
			
			
			//act
			
				
			
				//assert
			
			//assertEquals(currentOrders + 3, updatedOrders);
		for (Order orders : orderTest.getOrders().values()) {
			
			System.out.println(orders.getVariety() + "  " + orders.numOfBoxes());
			
			
			
			
		}
		}
}
