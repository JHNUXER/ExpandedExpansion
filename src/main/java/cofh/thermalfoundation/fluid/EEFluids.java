package cofh.thermalfoundation.fluid;

import cofh.core.util.fluid.DispenserEmptyBucketHandler;
import cofh.core.util.fluid.DispenserFilledBucketHandler;
import cofh.thermalfoundation.item.TFItems;

import net.minecraft.block.BlockDispenser;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class EEFluids {

	public static void preInit() {

		fluidRedstone = new Fluid("xycroniumred").setLuminosity(7).setDensity(1200).setViscosity(1500).setTemperature(300).setRarity(EnumRarity.uncommon);
		registerFluid(fluidXycroniumRed, "xycroniumred");
	}

	public static void initialize() {

	}

	public static void postInit() {

	}

	public static void registerFluid(Fluid fluid, String fluidName) {

		if (!FluidRegistry.isFluidRegistered(fluidName)) {
			FluidRegistry.registerFluid(fluid);
		}
		fluid = FluidRegistry.getFluid(fluidName);
	}

	public static void registerDispenserHandlers() {

		BlockDispenser.dispenseBehaviorRegistry.putObject(EEItems.itemBucket, new DispenserFilledBucketHandler());
		BlockDispenser.dispenseBehaviorRegistry.putObject(Items.bucket, new DispenserEmptyBucketHandler());
	}

	public static Fluid fluidXycroniumRed;

}
