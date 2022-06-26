package com.flutterDemo.flutterDemo.controller.impl;

import com.flutterDemo.flutterDemo.controller.BaseController;
import com.flutterDemo.flutterDemo.controller.OrderController;
import com.flutterDemo.flutterDemo.model.Order;
import com.flutterDemo.flutterDemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

public class OrderControllerImpl extends BaseController implements OrderController {

    @Autowired
    private final OrderService orderService;

    public OrderControllerImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    public Response listOrders(){

        return buildResponse(
                true,
                "Success",
                orderService.listOrders()
        );

    }

    public  Response placeOrder(@RequestBody Order order){
         orderService.placeOrder(order);
        return buildResponse(
                true,
                "Order placed Successfully",
                null
        );
    }

    public  Response
    updateOrder(@RequestBody Order order,
                   @PathVariable("id") Long orderId)
    {
         orderService.updateOrder(
                order, orderId);
        return buildResponse(
                true,
                "Updated Successfully",
                 null
        );
    }

    // Delete operation
    public  Response deleteOrderById(@PathVariable("id")
                                     Long orderId)
    {
        orderService.deleteOrderById(
                orderId);

        return buildResponse(
                true,
                "Deleted Successfully",
                null
        );
    }
}
