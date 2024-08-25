package com.Quiz0824.One;

import java.util.Optional;

public class OrderRepositoryimple  implements OrderRepository{

	private Optional<String> itemid;

	@Override
	public void saveorder(String itemId) {
		// TODO Auto-generated method stub
		this.itemid = Optional.of(itemId);
	}

	public Optional<String> getItemid() {
		return itemid;
	}

}
