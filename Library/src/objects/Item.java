package objects;

public class Item {
	private String Type;
	private int IID;
	private int quantity;

	public Item(String type, int iID, int quantity) {
		Type = type;
		IID = iID;
		this.quantity = quantity;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getIID() {
		return IID;
	}

	public void setIID(int iID) {
		IID = iID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
