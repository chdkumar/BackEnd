package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Services.CustomerService;
import com.example.demo.Services.OrderService;
import com.example.demo.Services.ProductService;
import com.example.demo.Models.Customer;
import com.example.demo.Models.Orders;
import com.example.demo.Models.Products;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    private OrderService orderService;
    private ProductService productService;

    @Autowired
    public CustomerController(CustomerService customerService,OrderService orderService,ProductService productService) {
        this.customerService = customerService;
        this.orderService = orderService;
        this.productService = productService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/orders")
    public List<Orders> getAllOrders() {
        return orderService.getAllOrders();
    }
    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

}


