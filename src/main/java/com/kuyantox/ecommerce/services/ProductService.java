package com.kuyantox.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuyantox.ecommerce.exception.ResourceNotFoundException;
import com.kuyantox.ecommerce.models.entities.Product;
import com.kuyantox.ecommerce.models.repositories.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> findRange(String filterText, int page, int limit){
        return productRepo.findAll();
    }

    public Product findById(String id){
        return productRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produk dengan id " + id + " tidak ditemukan"));
    }

    public Product create(Product product){
        return productRepo.save(product);
    }

    public Product edit(Product product){
        return productRepo.save(product);
    }

    public Product changeImage(String id, String gambar){
        Product product = new Product();
        product.setGambar(gambar);
        return productRepo.save(product);
    }

    public void deleteById(String id){
        productRepo.deleteById(id);
    }
    
}
