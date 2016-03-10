package johnhoganuke.expandedexpansion;

import static johnhoganuke.expandedexpansion.ExpandedExpansion.MODID;
import static johnhoganuke.expandedexpansion.ExpandedExpansion.VERSION;
import static johnhoganuke.expandedexpansion.ExpandedExpansion.MOD_NAME;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;

import johnhoganuke.expandedexpansion.CommonProxy;
import johnhoganuke.expandedexpansion.ClientProxy;
import snowpaw.projectx.XLogger;

@Mod
(modid=ExpandedExpansion.MODID, name=ExpandedExpansion.NAME, version=ExpandedExpansion.VERSION)
public class ExpandedEpansion {
  public static final String MODID = "ExpandedExpansion";
	public static final String NAME = "ExpandedExpansion";
	public static final String VERSION = "0.0.01.0";
	public static final String INSTANCE = "expandedexpansion";
	public static final String CSIDE = "johnhoganuke.expandedexpansion.ClientProxy";
	public static final String SSIDE = "johnhoganuke.expandedexpansion.CommonProxy";
	
	@SidedProxy
	(ClientSide=ExpandedExpansion.CSIDE, ServerSide=ExpandedExpansion.SSIDE)
	public static CommonProxy proxy;
	
	@Instance
	(value=ExpandedExpansion.INSTANCE)
	public static ExpandedExpansion instance;
	
	public static ServerConfigurationManager serverMgr;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit();
		XLogger.debug("ProjectX Debugging...");
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
		// FluidUtils.init();     // From snowpaw's ProjectX.jar
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event){
		MinecraftServer server = event.getServer();
		ServerConfigurationManager mgr = server.getConfigurationManager();
		serverMgr = mgr;
		XLogger.info("I guess the server initialized successfully...");
	}

}
