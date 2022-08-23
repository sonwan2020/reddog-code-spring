package com.microsoft.gbb.rasa.orderservice.service;


import com.microsoft.gbb.rasa.orderservice.entities.CustomerOrder;

/**
 * The interface Order service.
 */
public interface OrderService {
    /**
     * Create order string.
     *
     * @param order the order
     * @return the string
     */
    public String createOrder(CustomerOrder order);
}