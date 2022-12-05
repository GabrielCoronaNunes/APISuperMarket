package br.com.futurodev.projeto.LabSupermarket.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.io.Serializable;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TB_PRODUCT")
public class ProductModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @Column(nullable = false, unique = false, length = 100)
    private String name;

    @Column(nullable = false, unique = false, length = 1000)
    private Integer price;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "categoryId")
    private CategoryModel categoryId;


    private Boolean productStatus;




    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }



    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
