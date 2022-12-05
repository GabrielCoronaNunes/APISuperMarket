package br.com.futurodev.projeto.LabSupermarket.model;


import jakarta.persistence.*;



@Entity
@Table(name = "TB_CATEGORY")
public class CategoryModel {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = false, length = 100)
    private String name;

    @Column(nullable = true, unique = false, length = 100)
    private String description;

    public CategoryModel(Long idCategory) {
        this.id= idCategory;
    }

    public CategoryModel(String name) {
        this.name = name;
    }

    public CategoryModel() {

    }

    //GETTERS AND SETTERS
    public Long getIdCategory() {
        return id;
    }

    public void setIdCategory(Long idCategory) {
        this.id = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
