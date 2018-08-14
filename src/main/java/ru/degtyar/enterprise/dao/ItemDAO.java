package ru.degtyar.enterprise.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.entity.Category;
import ru.degtyar.enterprise.entity.Item;

import javax.ejb.Stateless;

import java.util.List;

@Stateless
public class ItemDAO extends AbstractDAO{

    public Item merge(Item item){
        return em.merge(item);
    }

    @NotNull
    public List<Item> getListItems() {
        return em.createQuery("select e from Item e ORDER BY e.name desc", Item.class).getResultList();

    }

    public void removeItemById(@Nullable final String itemId) {
        @Nullable final Item item = getItemById(itemId);
        if (item == null) return;
        em.remove(item);
    }

    @Nullable
    public Item getItemById(@Nullable final String itemId) {
        if (itemId == null || itemId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM Item e WHERE e.id = :id", Item.class)
                .setParameter("id", itemId));
    }

}