package snowpaw.projectx.core;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import snowpaw.projectx.core.proxy.CommonProxy;
import snowpaw.projectx.core.render.RenderTickHandler;
import snowpaw.projectx.lib.util.FluidUtils;

@Mod
(modid=ProjectX.MODID, name=ProjectX.NAME, version=ProjectX.VERSION)

public class ProjectXExpansion {
	
	public static int idCounter;
	public static int countBlocks = 80;
	
	@SidedProxy
	(clientSide=ProjectX.CSIDE, serverSide=ProjectX.SSIDE)
	public static CommonProxy proxy;
	
	@Instance
	(value=ProjectX.INSTANCE)
	public static ProjectX instance;
	
	public static ServerConfigurationManager serverMgr;
	
	public static final String MODID = "ProjectXExpansion";
	public static final String NAME = "ProjectXExpansion";
	public static final String VERSION = "0.0.01.0";
	public static final String INSTANCE = "projectxexpansion";
	//public static final String CSIDE = "snowpaw.projectx.core.proxy.ClientProxy";
	//public static final String SSIDE = "snowpaw.projectx.core.proxy.CommonProxy";
	public static final String CSIDE = "johnhoganuke.ExpandedExpansion.core.proxy.ClientProxy;
	public static final String SSIDE = "johnhoganuke.ExpandedExpansion.core.proxy.CommonProxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit();
		XLogger.debug("ProjectX Expansion Debugging...");
		XConfig.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init();
		XLogger.info("Core Module Initialized !");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit();
		FluidUtils.init();
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event){
		MinecraftServer server = event.getServer();
		ServerConfigurationManager mgr = server.getConfigurationManager();
		serverMgr = mgr;
		XLogger.info("I guess the server initialized successfully...");
	}

}
