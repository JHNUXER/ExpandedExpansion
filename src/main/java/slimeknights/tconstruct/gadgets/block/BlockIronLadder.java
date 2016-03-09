package slimeknights.tconstruct.gadgets.block;

import net.minecraft.block.BlockLadder;

import slimeknights.tconstruct.library.TinkerRegistry;

public class BlockStoneLadder extends BlockLadder {

  public BlockIronLadder() {
    this.setHardness(0.3F); // three times that of the stone ladder from original TConstruct
    this.setStepSound(soundTypeStone);  // I'll leave this until I figure out if Iron uses a different sound.

    this.setCreativeTab(ExpandedExpansionRegistry.tabTCGadgets);
  }
}
