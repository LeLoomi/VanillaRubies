package net.leloomi.vanillarubies;

import net.fabricmc.api.ModInitializer;
import net.leloomi.vanillarubies.block.ModBlocks;
import net.leloomi.vanillarubies.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaRubies implements ModInitializer
{
	public static final String MOD_ID = "vanillarubies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
