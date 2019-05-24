package objects;

import java.util.ArrayList;

public class ItemsList implements Crudable {

	ArrayList<Item> itemList = new ArrayList<Item>();

	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	@Override
	public void create(Object input) {
		this.getItemList().add((Item) input);

	}

	@Override
	public String read(Object input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object input, Object change) {

	}

	@Override
	public void delete(Object input) {
		this.getItemList().remove(input);

	}
}
