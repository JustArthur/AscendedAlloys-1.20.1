package net.kuma.ascendedalloys;

import net.fabricmc.api.ModInitializer;

import net.kuma.ascendedalloys.block.ModBlocks;
import net.kuma.ascendedalloys.item.ModItemGroups;
import net.kuma.ascendedalloys.item.ModItems;
import net.kuma.ascendedalloys.util.ModCustomTrades;
import net.kuma.ascendedalloys.util.ModLootTableModifiers;
import net.kuma.ascendedalloys.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AscendedAlloys implements ModInitializer {
	public static final String MOD_ID = "ascendedalloys";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// Create Items
		ModItemGroups.registerItemGroup();

		//Add Items and Blocks
		ModItems.registeredModItems();
		ModBlocks.registerModBlock();

		// Add to chest Loot
		ModLootTableModifiers.modifyLootTables();

		// Add to Villagers trades
		ModCustomTrades.registerCustomTrades();

		// Add Debris to World Gen
		ModWorldGeneration.generateModWorldGen();
	}
}