package ru.degtyar.enterprise.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.entity.Category;

import javax.ejb.Stateless;

import java.util.List;

@Stateless
public class CategoryDAO extends AbstractDAO{

    public Category merge(Category category){
        return em.merge(category);
    }

    @NotNull
    public List<Category> getCategorys() {
        return em.createQuery("select e from Category e ORDER BY e.name desc", Category.class).getResultList();

    }

    public void removeCategoryById(@Nullable final String categoryId) {
        @Nullable final Category category = getCategoryById(categoryId);
        if (category == null) return;
        em.remove(category);
    }

    @Nullable
    public Category getCategoryById(@Nullable final String categoryId) {
        if (categoryId == null || categoryId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM Category e WHERE e.id = :id", Category.class)
                .setParameter("id", categoryId)
                .setMaxResults(1));
    }

}
