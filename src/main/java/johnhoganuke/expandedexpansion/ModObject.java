package johnhoganuke.expandedexpansion;

public enum ModObject {
// Machines:
blockJohnEnergyCell,            // Best I could come up with! Don't judge me! :-(

// Blocks:
blockAdamantium,

// Items:
itemXycroniumDiamond,           // src/main/java/johnhoganuke/item/XItemDiamond.java
itemAdamantiumIngot,


public final String unlocalisedName;

  private ModObject() {
    this.unlocalisedName = name();
  }

}
