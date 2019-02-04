package girlscouts;

public class Order {

	private int numBoxes;
	private String variety;
	private String orderNum;
	private int addBoxes;
	
	
	
	public Order(String variety, int numBoxes) {
		
		this.variety = variety;
		this.numBoxes= numBoxes;
		
		
	}

	public Order(int numBoxes) {
		this.numBoxes = numBoxes;
		
	}



	public String getVariety() {
		return variety;
		
		
		
	}
	
	public int numOfBoxes() {
		return numBoxes;
	}

	public int numberOfBoxes() {
		
			
		return numBoxes;
	}

	public int addBoxes(int addBoxes) {
		this.addBoxes = addBoxes;
		int moreBoxes =  addBoxes;
		numBoxes += moreBoxes;
		return moreBoxes;
		
		// TODO Auto-generated method stub
		
	}

}