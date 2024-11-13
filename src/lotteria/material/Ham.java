package lotteria.material;

public class Ham implements Material{
    Material material;

    public Ham(Material material){
        this.material = material;
    }

    public Ham(){}

    @Override
    public void add() {
        System.out.println("햄 추가");
        if(material != null){
            material.add();
        }
    }
}
