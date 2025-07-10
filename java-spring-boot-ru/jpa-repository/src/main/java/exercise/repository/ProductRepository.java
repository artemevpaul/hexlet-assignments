package exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import exercise.model.Product;

import org.springframework.data.domain.Sort;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // BEGIN
    List<Product> findAllByPriceLessThan(Integer price, Sort sort);
    List<Product> findAllByPriceGreaterThan(Integer price, Sort sort);
    List<Product> findAllByPriceBetween(Integer min, Integer max, Sort sort);
    // END
}
