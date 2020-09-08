package com.msc.spring.springcore.activity;

import java.util.List;

public class ShoppingCart {

    private List<Item> itens;

    public ShoppingCart(){}

    public ShoppingCart(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itens=" + itens +
                '}';
    }
}
