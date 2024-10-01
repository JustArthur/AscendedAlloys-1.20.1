package net.kuma.ascendedalloys.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kuma.ascendedalloys.AscendedAlloys;
import net.kuma.ascendedalloys.block.ModBlocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ASCENDED_ALLOY_TAB_SMITHINGS = Registry.register(Registries.ITEM_GROUP, new Identifier(AscendedAlloys.MOD_ID, "smithingtemplate"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ascendedalloys.smithingtemplate"))
                    .icon(() -> new ItemStack(ModItems.ENDERITE_UPGRADE)).entries((displayContext, entries) -> {
                        //Smithing Templates
                        entries.add(ModItems.STONE_UPGRADE);
                        entries.add(ModItems.COPPER_UPGRADE);
                        entries.add(ModItems.IRON_UPGRADE);
                        entries.add(ModItems.GOLD_UPGRADE);
                        entries.add(ModItems.DIAMOND_UPGRADE);
                        entries.add(ModItems.AMETHYST_UPGRADE);
                        entries.add(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.ENDERITE_UPGRADE);
                    }).build());

    public static final ItemGroup ASCENDED_ALLOY_TAB_EQUIPMENTS = Registry.register(Registries.ITEM_GROUP, new Identifier(AscendedAlloys.MOD_ID, "tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ascendedalloys.equipment"))
                    .icon(() -> new ItemStack(ModItems.ENDERITE_PICKAXE)).entries((displayContext, entries) -> {

                        //Copper
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_SHOVEL);

                        //Amethyst
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);

                        //ENDERITE
                        entries.add(ModItems.ENDERITE_HOE);
                        entries.add(ModItems.ENDERITE_PICKAXE);
                        entries.add(ModItems.ENDERITE_SHOVEL);

                    }).build());

    public static final ItemGroup ASCENDED_ALLOY_TAB_COMBAT = Registry.register(Registries.ITEM_GROUP, new Identifier(AscendedAlloys.MOD_ID, "combat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ascendedalloys.combat"))
                    .icon(() -> new ItemStack(ModItems.ENDERITE_SWORD)).entries((displayContext, entries) -> {

                        //Swords
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.ENDERITE_SWORD);

                        //Axes
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.ENDERITE_AXE);

                        //Armors
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);
                        entries.add(ModItems.ENDERITE_HELMET);
                        entries.add(ModItems.ENDERITE_CHESPLATE);
                        entries.add(ModItems.ENDERITE_LEGGINGS);
                        entries.add(ModItems.ENDERITE_BOOTS);

                    }).build());

    public static final ItemGroup ASCENDED_ALLOY_TAB_BLOCKS = Registry.register(Registries.ITEM_GROUP, new Identifier(AscendedAlloys.MOD_ID, "blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ascendedalloys.blocks"))
                    .icon(() -> new ItemStack(ModBlocks.FORGOTTEN_DEBRIS)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.FORGOTTEN_DEBRIS);
                        entries.add(ModBlocks.ENDERITE_BLOCK);

                    }).build());

    public static final ItemGroup ASCENDED_ALLOY_INGREDIENTS = Registry.register(Registries.ITEM_GROUP, new Identifier(AscendedAlloys.MOD_ID, "ingredients"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ascendedalloys.ingredients"))
                    .icon(() -> new ItemStack(ModItems.ENDERITE_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_INGOT);

                    }).build());



    public static void registerItemGroup() {
        AscendedAlloys.LOGGER.info("Registered Item Group for " + AscendedAlloys.MOD_ID);
    }
}
