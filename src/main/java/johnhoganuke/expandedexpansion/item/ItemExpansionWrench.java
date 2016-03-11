package johnhoganuke.expandedexpansion.item;

public class ItemExpansionWrench extends Item implements ITool {
  public static ItemExpansionWrench create() {
    if (Config.useSneakMouseWheelExpansionWrench) {
      PacketHandler.INSTANCE.registerMessage(ExpansionWrenchPacketProcessor.class, ExpansionWrenchPacketProcessor.class, PacketHandler.nextID(), Side.SERVER);
    }
    ItemExpansionWrench result = new ItemYetaWrench();
    result = ToolUtil.addInterfaces(result);
    //result.init();
    GameRegistry.registerItem(result, ModObject.itemExpansionWrench.unlocalisedName);

    return result;
  }
  
  protected ItemExpansionWrench() {
    setCreativeTab(ExpandedExpansionTabs.tabTools);
    setUnlocalizedName(ModObject.itemExpansionWrench.unlocalisedName);
    setMaxStackSize(1);
  }
  
  @Override
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister IIconRegister) {
    itemIcon = IIconRegister.registerIcon("expandedexpansion:expansionWrench");
  }
  
    @Override
  public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
    Block block = world.getBlock(x,y,z);
    boolean ret = false;
    if (block != null) {
      PlayerInteractEvent e = new PlayerInteractEvent(player, Action.RIGHT_CLICK_BLOCK, x, y, z, side, world);
      if (MinecraftForge.EVENT_BUS.post(e) || e.getResult() == Result.DENY || e.useBlock == Result.DENY || e.useItem == Result.DENY) {
        return false;
      }
      if (player.isSneaking() && block instanceof IDismantleable && ((IDismantleable) block).canDismantle(player, world, x, y, z)) {
        if (!world.isRemote) {
          ((IDismantleable) block).dismantleBlock(player, world, x, y, z, false);
        }
        ret = true;
      } else if (!player.isSneaking() && block.rotateBlock(world, x, y, z, ForgeDirection.getOrientation(side))) {
        if (block == Blocks.chest) {
          // This works around a forge bug where you can rotate double chests to invalid directions
          TileEntityChest te = (TileEntityChest) world.getTileEntity(x, y, z);
          if (te.adjacentChestXNeg != null || te.adjacentChestXPos != null || te.adjacentChestZNeg != null || te.adjacentChestZPos != null) {
            // Render master is always the chest to the negative direction
            TileEntityChest masterChest = te.adjacentChestXNeg == null && te.adjacentChestZNeg == null ? te : te.adjacentChestXNeg == null ? te.adjacentChestZNeg: te.adjacentChestXNeg;
            if (masterChest != te) {
              int meta = world.getBlockMetadata(masterChest.xCoord, masterChest.yCoord, masterChest.zCoord);
              world.setBlockMetadataWithNotify(masterChest.xCoord, masterChest.yCoord, masterChest.zCoord, meta ^ 1, 3);
            } else {
              // If this is the master chest, we can just rotate twice
              block.rotateBlock(world, x, y, z, ForgeDirection.getOrientation(side));
            }
          }
        ret = true;
      }
      if (ret) {
      player.swingItem();
    }
    return ret && !world.isRemote;
    }
  }
}
}
