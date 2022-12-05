package br.com.futurodev.projeto.LabSupermarket.controller;


import br.com.futurodev.projeto.LabSupermarket.model.CategoryModel;
import br.com.futurodev.projeto.LabSupermarket.model.ProductModel;
import br.com.futurodev.projeto.LabSupermarket.repositories.ProductRepository;

import lombok.AllArgsConstructor;


import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
@AllArgsConstructor
public class ProductController {

    ProductRepository productRepository;

   @GetMapping("/findAllProducts")
   public List<ProductModel> getAllProducts(){
       return productRepository.findAll();
   }

   @GetMapping("/findProduct/{id}")
   public  ProductModel getProductById(@PathVariable(value = "id") Long id){
       return productRepository.findById(id).get();
   }

   @PostMapping("/insertProduct")
    public ProductModel saveProduct(@RequestBody ProductModel product){

       return  productRepository.save(product);
   }

   @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct (@PathVariable Long id){
       productRepository.deleteById(id);
   }

   @PostMapping("/updateProduct")
    public ProductModel atualizeProduct(@RequestBody ProductModel product, Long id){

     return productRepository.save(product);
   };




}

