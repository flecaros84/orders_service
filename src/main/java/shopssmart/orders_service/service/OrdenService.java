package shopssmart.orders_service.service;

import org.springframework.stereotype.Service;
import shopssmart.orders_service.model.Orden;
import shopssmart.orders_service.repository.OrdenRepository;

import java.util.List;

@Service
public class OrdenService {

    private final OrdenRepository repository;

    public OrdenService(OrdenRepository repository) {
        this.repository = repository;
    }

    public Orden createOrder(Orden orden) {
        return repository.save(orden);
    }

    public List<Orden> getAllOrders() {
        return repository.findAll();
    }

    public Orden getOrderById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
