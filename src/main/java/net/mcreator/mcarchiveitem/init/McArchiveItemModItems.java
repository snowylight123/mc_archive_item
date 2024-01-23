
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mcarchiveitem.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mcarchiveitem.item.SuperlativeReinforcedBeadItem;
import net.mcreator.mcarchiveitem.item.PyroxeneItem;
import net.mcreator.mcarchiveitem.item.IntermediateReinforcedBeadItem;
import net.mcreator.mcarchiveitem.item.BeginnerReinforcedBeadItem;
import net.mcreator.mcarchiveitem.item.AdvancedReinforcedBeadItem;
import net.mcreator.mcarchiveitem.McArchiveItemMod;

public class McArchiveItemModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McArchiveItemMod.MODID);
	public static final RegistryObject<Item> PYROXENE = REGISTRY.register("pyroxene", () -> new PyroxeneItem());
	public static final RegistryObject<Item> BEGINNER_REINFORCED_BEAD = REGISTRY.register("beginner_reinforced_bead", () -> new BeginnerReinforcedBeadItem());
	public static final RegistryObject<Item> INTERMEDIATE_REINFORCED_BEAD = REGISTRY.register("intermediate_reinforced_bead", () -> new IntermediateReinforcedBeadItem());
	public static final RegistryObject<Item> ADVANCED_REINFORCED_BEAD = REGISTRY.register("advanced_reinforced_bead", () -> new AdvancedReinforcedBeadItem());
	public static final RegistryObject<Item> SUPERLATIVE_REINFORCED_BEAD = REGISTRY.register("superlative_reinforced_bead", () -> new SuperlativeReinforcedBeadItem());
}
