package objects;

import java.util.ArrayList;

public class ItemsList implements Crudable {

	ArrayList<Item> itemList = new ArrayList<Item>();

	// setter
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	// getter
	public ArrayList<Item> getItemList() {
		return itemList;
	}
}
