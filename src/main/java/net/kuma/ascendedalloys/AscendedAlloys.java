package net.kuma.ascendedalloys;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AscendedAlloys implements ModInitializer {
	public static final String MOD_ID = "ascendedalloys";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialize AscendedAlloys...");
	}
}