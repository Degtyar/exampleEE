package ru.degtyar.enterprise.controller;

import ru.degtyar.enterprise.dao.CategoryDAO;
import ru.degtyar.enterprise.entity.Category;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class CategoryEditController {

    @Inject
    private CategoryDAO categoryDAO;

    private String name = "";

    public void save(){
       Category category = new Category();
       category.setName(name);
       categoryDAO.merge(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
