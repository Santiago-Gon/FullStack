package com.credibanco.prueba_full.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProductoDto implements Serializable {

            private Integer id;
            private String title;
            private Integer price;
            private String description;
            private List<String> images;
            private Date creationAt;
            private Date updatedAt;
            private CategoryDto category;

    public ProductoDto() {
    }

    public ProductoDto(Integer id, String title, Integer price, String description, List<String> images, Date creationAt, Date updatedAt, CategoryDto category) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.images = images;
        this.creationAt = creationAt;
        this.updatedAt = updatedAt;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Date getCreationAt() {
        return creationAt;
    }

    public void setCreationAt(Date creationAt) {
        this.creationAt = creationAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }
}
