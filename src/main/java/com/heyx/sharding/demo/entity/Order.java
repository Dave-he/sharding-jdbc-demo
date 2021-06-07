package com.heyx.sharding.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    
    private static final long serialVersionUID = 661434701950670670L;
    
    private long orderId;
    
    private int userId;
    
    private long addressId;
    
    private String status;

    @Override
    public String toString() {
        return String.format("order_id: %s, user_id: %s, address_id: %s, status: %s", orderId, userId, addressId, status);
    }
}
