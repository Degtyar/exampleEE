package ru.degtyar.enterprise.dto;

import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.entity.Category;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CategoryDTO {
    @Nullable
    private String id;

    @Nullable
    private String name;

    public CategoryDTO(){

    }

    public CategoryDTO(@Nullable Category category){
        if (category == null ) return;
        id = category.getId();
        name = category.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
