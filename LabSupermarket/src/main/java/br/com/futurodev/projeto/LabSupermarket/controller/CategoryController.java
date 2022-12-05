package br.com.futurodev.projeto.LabSupermarket.controller;


import br.com.futurodev.projeto.LabSupermarket.model.CategoryModel;
import br.com.futurodev.projeto.LabSupermarket.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CategoryController {
    CategoryRepository categoryRepository;

    @GetMapping("/findAllCategories")
    public List<CategoryModel> getAllCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping("/findCategorie/{id}")
    public Optional<CategoryModel> getCategoryById(@PathVariable Long id){
        return  categoryRepository.findById(id);
    }

    @PostMapping("/insertCategorie")
    public CategoryModel saveCategory (@RequestBody CategoryModel category){
        return categoryRepository.save(category);
    }

    @DeleteMapping("/deleteCategorie/{id}")
    public void deleteCategory (@PathVariable Long id){
        categoryRepository.deleteById(id);
    }


}
