package ru.degtyar.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.dao.CategoryDAO;
import ru.degtyar.enterprise.dao.ItemDAO;
import ru.degtyar.enterprise.entity.Category;
import ru.degtyar.enterprise.entity.Item;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class ItemEditController {

    @Inject
    private ItemDAO itemDAO;

    @Inject
    private CategoryDAO categoryDAO;

    @Nullable
    private String categoryId;

    @Nullable
    private String id;

    @NotNull
    private Item item = new Item();

    public void init(){
        @Nullable final Item item = itemDAO.getItemById(id);
        if (item != null) this.item = item;
    }

    private String name = "";

    private Integer coast;

    public Integer getCoast() {
        return coast;
    }

    public void setCoast(Integer coast) {
        this.coast = coast;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    public String save(){
      if (categoryId != null) item.setCategory(categoryDAO.getCategoryById(categoryId));
      itemDAO.merge(item);
      return "items-list";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
