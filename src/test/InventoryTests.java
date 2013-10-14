package test;

import static org.junit.Assert.*;

import main.core.service.InventoryService;
import main.events.InventoryReadEvent;
import main.events.InventoryRequestEvent;
import main.persistence.repository.InventoryInMemoryRepsoitory;
import main.persistence.service.InventoryPersistenceEventHandler;
import main.persistence.service.InventoryPersistenceService;

import org.junit.Test;

public class InventoryTests {

	@Test
	public void getDealerInventoryTest() {
		InventoryPersistenceService persistence = new InventoryPersistenceEventHandler(new InventoryInMemoryRepsoitory());
		InventoryRequestEvent requestEvent = new InventoryRequestEvent("56113");
		InventoryService service = new InventoryService(persistence);
		InventoryReadEvent readEvent = service.getDealerInventory(requestEvent);
		
		assertNotNull(persistence);
		assertNotNull(requestEvent);
		assertNotNull(service);
		assertNotNull(readEvent);
		
		long expected = 1;
		long actual = readEvent.getInventorySize();
		assertEquals(expected , actual);
	}

}
