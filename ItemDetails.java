class Item {
	private int itemCode;
	private String itemName;
	private float itemPrice;
	
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}

public class ItemDetails {

	public static void main(String[] args) {
		Item item = new Item();
		item.setItemCode(200);
		item.setItemName("colgate");
		item.setItemPrice(200.5f);
		System.out.println(item.getItemCode()+"\n"+item.getItemName()+"\n"+item.getItemPrice());
		
		

	}

}

