package net.leloomi.vanillarubies;

import net.fabricmc.api.ModInitializer;
import net.leloomi.vanillarubies.block.ModBlocks;
import net.leloomi.vanillarubies.item.ModItems;
import net.leloomi.vanillarubies.world.feature.ModConfiguredFeatures;
import net.leloomi.vanillarubies.world.generation.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaRubies implements ModInitializer
{
	public static final String MOD_ID = "vanillarubies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();

		VanillaRubies.LOGGER.debug(VanillaRubies.MOD_ID + ": Initialization done!");
	}
}
