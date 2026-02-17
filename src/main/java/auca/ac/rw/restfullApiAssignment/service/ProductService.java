package auca.ac.rw.restfullApiAssignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import auca.ac.rw.restfullApiAssignment.modal.ecommerce.Product;
import auca.ac.rw.restfullApiAssignment.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public String addNewProduct(Product product) {
      Optional<Product> existProduct = productRepository.findById(product.getId());
      if(existProduct.isPresent()) {
        return "Product with id " + product.getId() + " already exists";
      }else{
              productRepository.save(product);

        return "Product added successfully";
      }
    }

    public List<Product> searchProductByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public List<Product> findByBrand(String brand) {
        return productRepository.findByBrand(brand);
    }

    public String updateProduct(Long id, Product product) {
        Optional<Product> existProduct = productRepository.findById(id);
        if(existProduct.isPresent()) {
            product.setId(id);
            productRepository.save(product);
            return "Product updated successfully";
        }else{
            return "Product with id " + id + " not found";
        }
    }

    public String deleteProduct(Long id) {
        Optional<Product> existProduct = productRepository.findById(id);
        if(existProduct.isPresent()) {
            productRepository.deleteById(id);
            return "Product deleted successfully";
        }else{
            return "Product with id " + id + " not found";
        }
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
