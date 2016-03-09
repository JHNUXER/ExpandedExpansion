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

@Mod(modid = MODID, name = MOD_NAME, version = VERSION, dependencies = "after:projectx;", guiFactory = "crazypants.enderio.config.ConfigFactoryEIO")
public class ExpandedExpansion {
