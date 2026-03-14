package shopssmart.orders_service.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String status;

    private Double total;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrdenItem> items;
}
