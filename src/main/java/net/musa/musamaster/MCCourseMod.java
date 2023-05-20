package net.musa.musamaster;

import net.fabricmc.api.ModInitializer;
import net.musa.musamaster.block.ModBlocks;
import net.musa.musamaster.item.ModItems;
import net.musa.musamaster.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer{
	public static final String MOD_ID = "mccourse";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();


	}
}
