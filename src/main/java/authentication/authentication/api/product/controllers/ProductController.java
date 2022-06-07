package authentication.authentication.api.product.controllers;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import authentication.authentication.api.product.entities.Product;
import authentication.authentication.api.product.services.ListProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  ListProductService listProductService;

  @ApiOperation(value = "Lista Todos Produtos")
  @GetMapping
  public List<Product> list() {
    return listProductService.listAll();
  }

}
