package lotteria.burger;

import lotteria.material.Material;

public class ChickenBurger implements Burger {

    Material material;

    public ChickenBurger(){}

    public ChickenBurger(Material material) {
        this.material = material;
    }

    public void make(){
        System.out.println("치킨버거 생성");
        if(material != null) material.add();
    }
}
