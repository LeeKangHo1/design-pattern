package lotteria.material;

public class Cabbage implements Material{
    Material material;

    public Cabbage(Material material){
        this.material = material;
    }

    public Cabbage(){}

    @Override
    public void add() {
        System.out.println("양배추 추가");
        if(material != null){
            material.add();
        }
    }
}
