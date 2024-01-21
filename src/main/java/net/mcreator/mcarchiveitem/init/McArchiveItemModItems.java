
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcarchiveitem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mcarchiveitem.item.EnhanceStoneLowItem;
import net.mcreator.mcarchiveitem.item.EnchanceStoneMediumItem;
import net.mcreator.mcarchiveitem.item.EnchanceStoneHighestItem;
import net.mcreator.mcarchiveitem.item.EnchanceStoneHighItem;
import net.mcreator.mcarchiveitem.item.BlueArchiveStoneItem;
import net.mcreator.mcarchiveitem.McArchiveItemMod;

public class McArchiveItemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McArchiveItemMod.MODID);
	public static final RegistryObject<Item> ENCHANCE_STONE_MEDIUM = REGISTRY.register("enchance_stone_medium", () -> new EnchanceStoneMediumItem());
	public static final RegistryObject<Item> ENHANCE_STONE_LOW = REGISTRY.register("enhance_stone_low", () -> new EnhanceStoneLowItem());
	public static final RegistryObject<Item> ENCHANCE_STONE_HIGH = REGISTRY.register("enchance_stone_high", () -> new EnchanceStoneHighItem());
	public static final RegistryObject<Item> ENCHANCE_STONE_HIGHEST = REGISTRY.register("enchance_stone_highest", () -> new EnchanceStoneHighestItem());
	public static final RegistryObject<Item> BLUE_ARCHIVE_STONE = REGISTRY.register("blue_archive_stone", () -> new BlueArchiveStoneItem());
}
