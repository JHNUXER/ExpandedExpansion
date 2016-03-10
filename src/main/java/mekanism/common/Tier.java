package mekanism.common;

import io.netty.buffer.ByteBuf;
import mekanism.api.EnumColor;
import mekanism.common.multipart.TransmitterType;
import mekanism.common.util.LangUtils;
import net.minecraft.util.ResourceLocation;

/**
 * Tier information for Mekanism.  This currently includes tiers for Energy Cubes and Smelting Factories.
 * @author aidancbrady
 *
 */
public final class Tier
{
	/** The default tiers used in Mekanism.
	 * @author aidancbrady
	 */
	public static enum BaseTier
	{
		BASIC("Basic", EnumColor.BRIGHT_GREEN),
		ADVANCED("Advanced", EnumColor.DARK_RED),
		ELITE("Elite", EnumColor.DARK_BLUE),
		ULTIMATE("Ultimate", EnumColor.PURPLE),     // might rename to "PENULTIMATE" later, though, in hindsight, I may need my own version of mekanism for that...
		// Here's where I (Johnhoganuke JHNUXER) add my bit...
		
		EXTRAULTIMATE("Extra Ultimate", EnumColor.PINK),
		
		// Aaaannd... here's where it ends.
		CREATIVE("Creative", EnumColor.BLACK);
		
		public String getName()
		{
			return name;
		}
		
		public String getLocalizedName()
		{
			return LangUtils.localize("tier." + getName());
		}
		
		public EnumColor getColor()
		{
			return color;
		}
		
		public boolean isObtainable()
		{
			return this != CREATIVE;
		}
		
		private String name;
		private EnumColor color;
		
		private BaseTier(String s, EnumColor c)
		{
			name = s;
			color = c;
		}
	}
