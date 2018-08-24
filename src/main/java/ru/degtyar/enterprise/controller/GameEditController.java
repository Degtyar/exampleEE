package ru.degtyar.enterprise.controller;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.degtyar.enterprise.dao.CategoryDAO;
import ru.degtyar.enterprise.dao.GameDAO;
import ru.degtyar.enterprise.entity.Game;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class GameEditController {

    @Inject
    private GameDAO gameDAO;

    @Inject
    private CategoryDAO categoryDAO;

    @Nullable
    private String categoryId;

    @Nullable
    private String id;

    @NotNull
    private Game game = new Game();

    public void init(){
        @Nullable final Game game = gameDAO.getGameById(id);
        if (game != null) this.game = game;
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

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    public String save(){
      if (categoryId != null) game.setCategory(categoryDAO.getCategoryById(categoryId));
      gameDAO.merge(game);
      return "game-list";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
