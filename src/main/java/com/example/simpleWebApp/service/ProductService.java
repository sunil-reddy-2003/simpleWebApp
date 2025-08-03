package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.service.annotation.PutExchange;

import java.util.ArrayList;
import java.util.List;



@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


    public List<Product> getProducts(){
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }


}

//
//@Service
//public class ProductService {
//
//    List<Product> products = new ArrayList<>( List.of(
//                    new Product(100, "Bulb", 3000),
//                    new Product(101, "Fan", 5000),
//                    new Product(102, "TubeLight", 2000)
//            )
//    );
//
//
//    public List<Product> getProducts(){
//        return products;
//    }
//
//
//    public Product getProductById(int prodId) {
//        for (Product p : products) {
//            if (p.getProdId()==prodId){
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public void addProduct(Product prod){
//        products.add(prod);
//    }
//
//
//    public void updateProduct(Product prod) {
//
//        int index=0;
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getProdId()==prod.getProdId()){
//                index=i;
//            }
//        }
//        products.set(index,prod);
//    }
//
//    public void deleteProduct(int prodId) {
//        int index=0;
//        for (int i=0; i<products.size(); i++) {
//            if (products.get(i).getProdId()== prodId){
//                index=i;
//            }
//        }
//        products.remove(index);
//    }
//}

