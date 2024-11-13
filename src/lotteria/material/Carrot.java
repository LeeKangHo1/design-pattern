package lotteria.material;

public class Carrot implements Material{

    Material material;

    public Carrot(Material material){
        this.material = material;
    }

    public Carrot(){}

    @Override
    public void add() {
        System.out.println("당근 추가");
        if(material != null){
            material.add();
        }
    }
}
