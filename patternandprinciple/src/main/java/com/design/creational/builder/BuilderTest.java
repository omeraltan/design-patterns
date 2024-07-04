package src.main.java.com.design.creational.builder;

/**
 *
 * Builder Design Pattern, Java'da karmaşık nesnelerin oluşturulmasını kolaylaştırmak için kullanılan
 * yaratıcı (creational) bir tasarım desenidir.
 * Bu desen, nesnelerin inşasını adım adım kontrol etmenize ve aynı inşa sürecini kullanarak
 * farklı türde ve farklı temsillerde nesneler oluşturmanıza olanak tanır.
 *
 * Builder Design Pattern'ın Temel Özellikleri:
 * 1 - Karmaşıklığı Yönetme: Karmaşık nesnelerin oluşturulması sırasında kodun daha okunabilir ve yönetilebilir olmasını sağlar.
 * 2 - Adım Adım İnşa      : Nesne oluşturma sürecini adım adım kontrol etmenizi sağlar. Her adımda farklı özellikler eklenebilir.
 * 3 - Farklı Temsiller    : Aynı inşa sürecini kullanarak farklı türde ve temsillerde nesneler oluşturulabilir.
 *
 */

class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    // Getter ve Setter metodları
    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior + "]";
    }
}

class HouseBuilder {
    private House house;

    public HouseBuilder() {
        this.house = new House();
    }

    public HouseBuilder buildFoundation(String foundation) {
        house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder buildStructure(String structure) {
        house.setStructure(structure);
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public HouseBuilder buildInterior(String interior) {
        house.setInterior(interior);
        return this;
    }

    public House build() {
        return this.house;
    }
}

class ConstructionEngineer {

    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        return houseBuilder.buildFoundation("Concrete")
            .buildStructure("Wood")
            .buildRoof("Tiles")
            .buildInterior("Modern")
            .build();
    }
}




public class BuilderTest {

    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);
        House house = engineer.constructHouse();
        System.out.println(house);
    }

}

/**
 *
 * Builder Design Pattern, karmaşık nesnelerin inşasını yönetmek için kullanılan etkili bir yöntemdir.
 * Bu desen, özellikle nesnelerin oluşturulması sırasında esneklik ve kontrol sağlamak amacıyla tercih edilir.
 * Her adımda nesnenin özelliklerini belirleyerek daha okunabilir ve yönetilebilir bir kod yapısı elde edilir.
 *
 */
