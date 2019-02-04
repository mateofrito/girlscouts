package girlscouts;

import java.util.Collection;
import java.util.HashMap;

public class OrderMasterList {
	
	
	private HashMap<String, Order> ordersList = new HashMap<String, Order>();
	
	
	
	
	

	public OrderMasterList(HashMap<String, Order> hashMap) {
		
		
	}

	public OrderMasterList() {
		// TODO Auto-generated constructor stub
	}

	public int getTotalVarietyOrdered() {
		return ordersList.size();
		
	}
	
	public HashMap<String, Order> getOrders(){
		return ordersList;
		
	}
	
	public Collection<Order> getVarietyQuantities() {
		return ordersList.values();
	}

	public void addOrder(Order orderToAdd) {
		ordersList.put(orderToAdd.getVariety(), orderToAdd);
		
		// TODO Auto-generated method stub
		
	}
	
	public void removeVariety(String variety) {
		ordersList.remove(variety);
		
	}
	
	public Order getQuantityofBoxes(String variety) {
		return ordersList.get(variety);
		
		
		
	}

	
		
		
		
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	


