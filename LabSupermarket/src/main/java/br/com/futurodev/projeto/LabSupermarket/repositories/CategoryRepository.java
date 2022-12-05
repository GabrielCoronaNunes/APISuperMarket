package br.com.futurodev.projeto.LabSupermarket.repositories;


import br.com.futurodev.projeto.LabSupermarket.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

}
