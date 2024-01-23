
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcarchiveitem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mcarchiveitem.McArchiveItemMod;

public class McArchiveItemModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McArchiveItemMod.MODID);
	public static final RegistryObject<CreativeModeTab> MC_ARCHIVE_MOD_TAB = REGISTRY.register("mc_archive_mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mc_archive_item.mc_archive_mod_tab")).icon(() -> new ItemStack(McArchiveItemModItems.PYROXENE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(McArchiveItemModItems.PYROXENE.get());
				tabData.accept(McArchiveItemModItems.BEGINNER_REINFORCED_BEAD.get());
				tabData.accept(McArchiveItemModItems.INTERMEDIATE_REINFORCED_BEAD.get());
				tabData.accept(McArchiveItemModItems.ADVANCED_REINFORCED_BEAD.get());
				tabData.accept(McArchiveItemModItems.SUPERLATIVE_REINFORCED_BEAD.get());
			})

					.build());
}
