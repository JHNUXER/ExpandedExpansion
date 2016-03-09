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
}
