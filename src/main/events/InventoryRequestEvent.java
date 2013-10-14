package main.events;

public class InventoryRequestEvent {

	private String dealerCode = null;
	
	public InventoryRequestEvent(String aDelaerCode) {
		this.dealerCode = aDelaerCode;
	}

	public String getDealerCode() {
		return this.dealerCode;
	}

}
