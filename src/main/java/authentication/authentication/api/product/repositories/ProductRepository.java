package authentication.authentication.api.product.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import authentication.authentication.api.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
