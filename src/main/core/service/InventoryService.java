package main.core.service;

import main.events.InventoryReadEvent;
import main.events.InventoryRequestEvent;

public interface InventoryService {

	public abstract InventoryReadEvent getDealerInventory(
			InventoryRequestEvent aEvent);

}