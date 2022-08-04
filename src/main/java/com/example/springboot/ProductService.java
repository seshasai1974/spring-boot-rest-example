package com.example.springboot;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class ProductService implements IProductService  
{
@Override
public List<Product> findAll()
{
//creating an object of ArrayList
ArrayList<Product> products = new ArrayList<Product>();
//adding products to the List
products.add(new Product(106, "LED ", "12ZP3987", 50000.00, 4));
products.add(new Product(107, "MOBILE ", "12AP5875", 25000.00, 30));

//returns a list of product
return products;
}
}
