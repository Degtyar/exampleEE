package ru.degtyar.enterprise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Cart extends AbstractEntity {

    @OneToMany
    private List<Item> items;

    @Column
    private Integer summ;
}
