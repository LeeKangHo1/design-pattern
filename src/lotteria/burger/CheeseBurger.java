package lotteria.burger;

import lotteria.material.Material;

public class CheeseBurger implements Burger {

    Material material;

    public CheeseBurger(){}

    public CheeseBurger(Material material) {
        this.material = material;
    }

    public void make(){
        System.out.println("치즈버거 생성");
        if(material != null) material.add();
    }
}
