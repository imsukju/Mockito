package com.Quiz0824.One;

public class Otherimpl implements OrderService{

	private final OrderRepository orderrepo;
	
    public Otherimpl(OrderRepository orderRepository) {
        this.orderrepo = orderRepository;
    }
	@Override
	public void placeOrder(String itemId) {
		// TODO Auto-generated method stub
		orderrepo.saveorder(itemId);
	}
	public OrderRepository getOrderrepo() {
		return orderrepo;
	}

}
