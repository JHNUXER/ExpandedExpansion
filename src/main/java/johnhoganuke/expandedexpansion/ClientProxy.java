package johnhoganuke.expandedexpansion

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy {

  // @formatter:off
  public static int[][] sideAndFacingToSpriteOffset = new int[][] {

      { 3, 2, 0, 0, 0, 0 },
      { 2, 3, 1, 1, 1, 1 },
      { 1, 1, 3, 2, 5, 4 },
      { 0, 0, 2, 3, 4, 5 },
      { 4, 5, 4, 5, 3, 2 },
      { 5, 4, 5, 4, 2, 3 } };
  // @formatter:on
	public static AnimationFX animationFX = null;
	public static int glowRenderId;
	
	@Override
	public void preInit(){
		registerIcons();
		glowRenderId = RenderingRegistry.getNextAvailableRenderId();
	}
	
	@Override
	public void init(){ 

		RenderingRegistry.registerBlockHandler(new RenderSimpleGlow());
	}
	
	@Override
	public void postInit(){
		
	}
	
	public void registerIcons(){
		animationFX = new AnimationFX();
	}

}
