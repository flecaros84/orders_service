package shopssmart.orders_service.controller;

import org.springframework.web.bind.annotation.*;
import shopssmart.orders_service.model.Orden;
import shopssmart.orders_service.service.OrdenService;

import java.util.List;

@RestController
@RequestMapping("api/v1/ordenes")
public class OrdenController {

    private final OrdenService service;

    public OrdenController(OrdenService service) {
        this.service = service;
    }

    @PostMapping
    public Orden createOrder(@RequestBody Orden orden) {
        return service.createOrder(orden);
    }

    @GetMapping
    public List<Orden> getOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orden getOrder(@PathVariable Long id) {
        return service.getOrderById(id);
    }
}
