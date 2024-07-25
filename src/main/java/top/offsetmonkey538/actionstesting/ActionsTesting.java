package top.offsetmonkey538.actionstesting;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import top.offsetmonkey538.actionstesting.block.ModBlocks;

import top.offsetmonkey538.actionstesting.item.ModItems;

import top.offsetmonkey538.actionstesting.config.ModConfig;
import top.offsetmonkey538.monkeylib538.config.ConfigManager;
import top.offsetmonkey538.monkeylib538.utils.IdentifierUtils;

public class ActionsTesting implements ModInitializer {
	public static final String MOD_ID = "actions-testing";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static ModConfig config;

	@Override
	public void onInitialize() {
		config = ConfigManager.init(new ModConfig(), LOGGER::error);
		ConfigManager.save(config, LOGGER::error);
		ModBlocks.register();
		ModItems.register();
	}

	public static Identifier id(String path) {
		return IdentifierUtils.INSTANCE.of(MOD_ID, path);
	}
}
