package main.events;

import java.util.List;

import main.core.domain.Vehicle;

public class InventoryReadEvent {

	private List<Vehicle> inventory;

	public InventoryReadEvent(List<Vehicle> aInventory) {
		this.inventory = aInventory;
	}

	public long getInventorySize() {
		return this.inventory.size();
	}

}
