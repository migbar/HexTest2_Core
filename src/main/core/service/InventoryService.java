package main.core.service;

import java.util.ArrayList;
import java.util.List;

import main.core.domain.Vehicle;
import main.events.InventoryReadEvent;
import main.events.InventoryRequestEvent;
import main.persistence.domain.VehicleDTO;
import main.persistence.service.InventoryPersistenceService;

public class InventoryService {

	private InventoryPersistenceService persistence = null;
	
	public InventoryService(InventoryPersistenceService aPersistence) {
		this.persistence = aPersistence;
	}

	public InventoryReadEvent getDealerInventory(InventoryRequestEvent aEvent) {
		main.persistence.events.InventoryRequestEvent persistenceRequestEvent = new main.persistence.events.InventoryRequestEvent(aEvent.getDealerCode());

		List<VehicleDTO> dtos = this.persistence.getDealerInventory(persistenceRequestEvent);
		List<Vehicle> inventory = new ArrayList<Vehicle>();
		
		for(int index = 0, size = dtos.size(); index < size; index++)
		{
			VehicleDTO dto = dtos.get(index);
			inventory.add(new Vehicle(dto.getModel(), dto.getModelYear()));
		}
		
		return new InventoryReadEvent(inventory);		
	}

}
