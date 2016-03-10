package crazypants.enderio;

import java.text.DecimalFormat;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
// import snowpaw.projectx.core.ProjectX;
import snowpaw.projectx.core.render.AnimationFX;
import snowpaw.projectx.core.render.RenderSimpleGlow;

public class CommonProxy {
  
  private static final DecimalFormat FORMAT = new DecimalFormat("########0.000");
	public static AnimationFX animationFX = null;
	public static int glowRenderId;

  public CommonProxy() {
  }

  public World getClientWorld() {
    return null;
  }

  public EntityPlayer getClientPlayer() {
    return null;
  }

  //public ConduitRenderer getRendererForConduit(IConduit conduit) {
  //  return null;
  //}

  public double getReachDistanceForPlayer(EntityPlayer entityPlayer) {
    return 5;

  }

  public void load() {
  }
  
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
