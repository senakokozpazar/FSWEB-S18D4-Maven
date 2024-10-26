package com.workintech.s18d1.dao;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);

    Burger findById(long id);

    List<Burger> findAll();

    List<Burger> findByPrice(Integer price);

    List<Burger> findByBreadType(BreadType breadtype);

    List<Burger> findByContent(String content);

    Burger update(Burger burger);

    Burger remove(long id);
}
