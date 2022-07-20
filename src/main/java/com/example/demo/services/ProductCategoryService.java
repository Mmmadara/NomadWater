package com.example.demo.services;

import com.example.demo.entities.ProductCategory;
import com.example.demo.repositories.ProductCategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

    private final ProductCategoryRepo productCategoryRepo;

    public ProductCategoryService(ProductCategoryRepo productCategoryRepo) {
        this.productCategoryRepo = productCategoryRepo;
    }

    public ProductCategory createProductCategory(ProductCategory productCategory){
        return productCategoryRepo.save(productCategory);
    }

    public ProductCategory updateProductCategory(String productCategoryId, String name){
        ProductCategory toUpdateProductCategory = productCategoryRepo.findById(Long.parseLong(productCategoryId)).orElseThrow();
        toUpdateProductCategory.setName(name);

        return productCategoryRepo.save(toUpdateProductCategory);
    }

    public void deleteProductCategory(String ProductCategoryId){
        ProductCategory toDeleteProductCategory = productCategoryRepo.findById(Long.parseLong(ProductCategoryId)).orElseThrow();
        productCategoryRepo.delete(toDeleteProductCategory);
    }

    public List<ProductCategory> getAllProductCategorys(){
        return productCategoryRepo.findAll();
    }
}
