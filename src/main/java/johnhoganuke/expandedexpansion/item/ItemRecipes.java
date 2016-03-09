package johnhoganuke.expandedexpansion.item;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import johnhoganuke.expandedexpansion.ExpandedExpansion;
// import crazypants.enderio.EnderIO;
// import crazypants.enderio.item.darksteel.DarkSteelItems;
// import crazypants.enderio.material.MachinePart;

import static crazypants.enderio.material.Alloy.*;
import static crazypants.enderio.material.Material.VIBRANT_CYSTAL;
import static crazypants.util.RecipeUtil.addShaped;

public class ItemRecipes {

  public static void addRecipes() {
    //ItemStack basicGear = new ItemStack(EnderIO.itemMachinePart, 1, MachinePart.BASIC_GEAR.ordinal());
    //String yellowXycronium = SOULARIUM.getOreIngot();    // FIGURE THIS OUT LATER!!!

    // XycroniumDiamond
    ItemStack wrench = new ItemStack(ExpandedExpansion.XItemDiamond, 8, 0);
    addShaped(wrench, "iii", "idi", "iii", 'i', xItemIngot, 'd', Items.diamond);
    
    /*
    //Magnet
    ItemStack magnet = new ItemStack(DarkSteelItems.itemMagnet, 1, 0);
    DarkSteelItems.itemMagnet.setEnergy(magnet, 0);
    addShaped(magnet, "scc", "  v", "scc", 's', electricalSteel, 'c', conductiveIron, 'v', vibCry);

    //Dark Steel
    addShaped(DarkSteelItems.itemDarkSteelHelmet.createItemStack(), "sss", "s s", 's', darkSteel);
    addShaped(DarkSteelItems.itemDarkSteelChestplate.createItemStack(), "s s", "sss", "sss", 's', darkSteel);
    addShaped(DarkSteelItems.itemDarkSteelLeggings.createItemStack(), "sss", "s s", "s s", 's', darkSteel);
    addShaped(DarkSteelItems.itemDarkSteelBoots.createItemStack(), "s s", "s s", 's', darkSteel);

    ItemStack wing = new ItemStack(DarkSteelItems.itemGliderWing, 1, 0);
    addShaped(wing, "  s", " sl", "sll", 's', darkSteel, 'l', Items.leather);
    addShaped(new ItemStack(DarkSteelItems.itemGliderWing, 1, 1), " s ", "wsw", "   ", 's', darkSteel, 'w', wing);

    addShaped(DarkSteelItems.itemDarkSteelShears.createItemStack(), " s", "s ", 's', darkSteel);

    ItemStack dspp = new ItemStack(EnderIO.blockDarkSteelPressurePlate);
    addShaped(dspp, "ss", 's', darkSteel);

    ItemStack dsppSilent = new ItemStack(EnderIO.blockDarkSteelPressurePlate, 1, 1);
    GameRegistry.addShapedRecipe(dsppSilent, "p", "w", 'p', dspp, 'w', Blocks.wool);

    //Soul Vessel
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(EnderIO.itemSoulVessel), " s ", "q q", " q ", 's', soularium, 'q', new ItemStack(
        EnderIO.blockFusedQuartz, 1, 0)));

    //XP Rod
    addShaped(new ItemStack(EnderIO.itemXpTransfer), "  s", " v ", "s  ", 's', soularium, 'v', enAlloy);

    // DS Tools
    addShaped(DarkSteelItems.itemDarkSteelSword.createItemStack(), " s ", " s ", " w ", 's', darkSteel, 'w', "stickWood");
    addShaped(DarkSteelItems.itemDarkSteelSword.createItemStack(), " s ", " s ", " w ", 's', darkSteel, 'w', "woodStick");
    addShaped(DarkSteelItems.itemDarkSteelPickaxe.createItemStack(), "sss", " w ", " w ", 's', darkSteel, 'w', "stickWood");
    addShaped(DarkSteelItems.itemDarkSteelPickaxe.createItemStack(), "sss", " w ", " w ", 's', darkSteel, 'w', "woodStick");
    addShaped(DarkSteelItems.itemDarkSteelAxe.createItemStack(), "ss ", "sw ", " w ", 's', darkSteel, 'w', "woodStick");
    addShaped(DarkSteelItems.itemDarkSteelAxe.createItemStack(), "ss ", "sw ", " w ", 's', darkSteel, 'w', "stickWood");
    */
  }
}
