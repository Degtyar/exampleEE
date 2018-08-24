package ru.degtyar.enterprise.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.entity.Category;
import ru.degtyar.enterprise.entity.Game;
import ru.degtyar.enterprise.interceptor.LogInterceptor;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

import java.util.List;

@Stateless
@Interceptors(LogInterceptor.class)
public class GameDAO extends AbstractDAO{

    @Inject
    CategoryDAO categoryDAO;

    @Nullable
    public Game merge(@Nullable final Game game){
        if(game == null) return null;
        return em.merge(game);
    }

    public Game createByCategoryId(String categoryId) {
        final Category category = categoryDAO.findOne(categoryId);
        final Game game = new Game();
        game.setCategory(category);
        return em.merge(game);
    }

    @NotNull
    public List<Game> getListGames() {
        return em.createQuery("select e from Game e ORDER BY e.name desc", Game.class).getResultList();

    }

    public void removeGameById(@Nullable final String itemId) {
        @Nullable final Game game = getGameById(itemId);
        if (game == null) return;
        em.remove(game);
    }

    @Nullable
    public Game getGameById(@Nullable final String itemId) {
        if (itemId == null || itemId.isEmpty()) return null;
        return getEntity(em.createQuery("SELECT e FROM Game e WHERE e.id = :id", Game.class)
                .setParameter("id", itemId));
    }

}