package net.yak.lenientsuggestions;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LenientSuggestions implements ModInitializer {
	public static final String MOD_ID = "lenientsuggestions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("hey, mom made pancakes");
	}
}