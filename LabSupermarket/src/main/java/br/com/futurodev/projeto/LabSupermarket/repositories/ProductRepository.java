package br.com.futurodev.projeto.LabSupermarket.repositories;


import br.com.futurodev.projeto.LabSupermarket.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository  extends JpaRepository<ProductModel, Long> {

}
