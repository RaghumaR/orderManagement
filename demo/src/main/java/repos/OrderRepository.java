package repos;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.CustomerOrderDetails;

public interface OrderRepository extends JpaRepository<CustomerOrderDetails, Integer> {

}
