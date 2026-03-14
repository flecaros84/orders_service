package shopssmart.orders_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopssmart.orders_service.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
