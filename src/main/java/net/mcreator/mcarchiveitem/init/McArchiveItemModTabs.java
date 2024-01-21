
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcarchiveitem.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mcarchiveitem.McArchiveItemMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McArchiveItemModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McArchiveItemMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(McArchiveItemModItems.ENCHANCE_STONE_MEDIUM.get());
			tabData.accept(McArchiveItemModItems.ENHANCE_STONE_LOW.get());
			tabData.accept(McArchiveItemModItems.ENCHANCE_STONE_HIGH.get());
			tabData.accept(McArchiveItemModItems.ENCHANCE_STONE_HIGHEST.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(McArchiveItemModItems.BLUE_ARCHIVE_STONE.get());
		}
	}
}
