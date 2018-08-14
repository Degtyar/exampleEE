package ru.degtyar.enterprise.controller;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.dao.CategoryDAO;
import ru.degtyar.enterprise.entity.Category;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ViewScoped
@ManagedBean

public class CategoryListController {

    @Inject
    private CategoryDAO categoryDAO;

    @NotNull
    public List<Category> getListCategory() {
        return categoryDAO.getCategorys();
    }

    public void removeCategoryById(@Nullable final String categoryId){
        categoryDAO.removeCategoryById(categoryId);
    }

}
