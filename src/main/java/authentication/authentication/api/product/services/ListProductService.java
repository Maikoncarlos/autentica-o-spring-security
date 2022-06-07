package authentication.authentication.api.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.authentication.api.product.repositories.ProductRepository;
import authentication.authentication.api.product.entities.Product;

@Service
public class ListProductService {

  @Autowired
  ProductRepository productRepository;

  public List<Product> listAll() {
    return productRepository.findAll();
  }
}
