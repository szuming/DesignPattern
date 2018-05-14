package 创建型模式.工厂模式.抽象工厂模式;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String clam;

    abstract void prepare();        //用于准备pizza的材料

    void bake(){System.out.println("Bake for 25 minutes at 350");}

    void cut(){System.out.println("Cutting the pizza into diagonal slices");}

    public void setName(String name){this.name=name;}

    public String getName() {
        return name;
    }
}
