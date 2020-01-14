package changes.java8;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class CompletableFutureExample {

	public static void main(String[] args) {
		IntStream.iterate(1, e-> e+1).limit(5).forEach(e->{
			CompletableFuture.
				supplyAsync(() -> fetchOrder(e))
				.thenApply(order -> enrichOrder(order))
				.thenApply(order -> orderPayment(order))
				.thenApply(order -> deliverOrder(order))
				.thenAccept(order -> sendDeliveryMessage(order));
				
		});	
	}
	public static Order fetchOrder(int id) {
		Order order = new Order(id);
		System.out.println("Order fetched for order "+order.getOrderId());
		return order;
	}
	
	public static Order enrichOrder(Order order) {
		System.out.println("Order enriched for order "+order.getOrderId());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}
	public static Order orderPayment(Order order) {
		System.out.println("payment done for order "+order.orderId);
		return order;
	}
	public static Order deliverOrder(Order order) {
		System.out.println("Order deliver "+order.getOrderId());
		return order;
	}
	public static void sendDeliveryMessage(Order order) {
		System.out.println("Delivery done for order "+order.getOrderId());
	}
}
class Item{
	int itemId;
	String itemName;
	double itemPrice;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
}

class Order{
	int orderId;
	String customerName;
	String address;
	List<Item> itemList;
	
	public Order(int orderId) {
		this.orderId = orderId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}

