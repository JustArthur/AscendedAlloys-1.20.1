package net.kuma.ascendedalloys.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kuma.ascendedalloys.AscendedAlloys;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.List;

public class ModItems {
    //Smithing Template
    public static final Item STONE_UPGRADE = registerItemWithTooltip("stone_upgrade_smithing_template", "item.ascendedalloys.stone_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.stone_upgrade_smithing_template.appliesTo", "item.ascendedalloys.stone_upgrade_smithing_template.ingredient");
    public static final Item COPPER_UPGRADE = registerItemWithTooltip("copper_upgrade_smithing_template", "item.ascendedalloys.copper_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.copper_upgrade_smithing_template.appliesTo", "item.ascendedalloys.copper_upgrade_smithing_template.ingredient");
    public static final Item IRON_UPGRADE = registerItemWithTooltip("iron_upgrade_smithing_template", "item.ascendedalloys.iron_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.iron_upgrade_smithing_template.appliesTo", "item.ascendedalloys.iron_upgrade_smithing_template.ingredient");
    public static final Item GOLD_UPGRADE = registerItemWithTooltip("gold_upgrade_smithing_template", "item.ascendedalloys.gold_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.gold_upgrade_smithing_template.appliesTo", "item.ascendedalloys.gold_upgrade_smithing_template.ingredient");
    public static final Item DIAMOND_UPGRADE = registerItemWithTooltip("diamond_upgrade_smithing_template", "item.ascendedalloys.diamond_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.diamond_upgrade_smithing_template.appliesTo", "item.ascendedalloys.diamond_upgrade_smithing_template.ingredient");
    public static final Item AMETHYST_UPGRADE = registerItemWithTooltip("amethyst_upgrade_smithing_template", "item.ascendedalloys.amethyst_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.amethyst_upgrade_smithing_template.appliesTo", "item.ascendedalloys.amethyst_upgrade_smithing_template.ingredient");
    public static final Item ENDERITE_UPGRADE = registerItemWithTooltip("enderite_upgrade_smithing_template", "item.ascendedalloys.enderite_upgrade_smithing_template.upgradeTo", "item.ascendedalloys.enderite_upgrade_smithing_template.appliesTo", "item.ascendedalloys.enderite_upgrade_smithing_template.ingredient");

    //Copper Items
    public static final Item COPPER_AXE = registerItem("copper_axe", new AxeItem(ModToolsMaterial.COPPER, 6, -3f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe", new HoeItem(ModToolsMaterial.COPPER, -2, 0f, new FabricItemSettings()));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe", new PickaxeItem(ModToolsMaterial.COPPER, 1, -2.8f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel", new ShovelItem(ModToolsMaterial.COPPER, 1, -3f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new SwordItem(ModToolsMaterial.COPPER, 3, -2.4f, new FabricItemSettings()));
    public static final Item COPPER_HELMET = registerItem("copper_helmet", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESPLATE = registerItem("copper_chestplate", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots", new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //Amethyst Items
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe", new AxeItem(ModToolsMaterial.AMETHYST, 5, -3f, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe", new HoeItem(ModToolsMaterial.AMETHYST, -3, 0f, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe", new PickaxeItem(ModToolsMaterial.AMETHYST, 1, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel", new ShovelItem(ModToolsMaterial.AMETHYST, 1, -3f, new FabricItemSettings()));
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword", new SwordItem(ModToolsMaterial.AMETHYST, 3, -2.4f, new FabricItemSettings()));
    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_CHESPLATE = registerItem("amethyst_chestplate", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots", new ArmorItem(ModArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //Enderite Items
    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe", new AxeItem(ModToolsMaterial.ENDERITE, 5, -2.5f, new FabricItemSettings()));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe", new HoeItem(ModToolsMaterial.ENDERITE, -5, 1f, new FabricItemSettings()));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe", new PickaxeItem(ModToolsMaterial.ENDERITE, 1, -2.4f, new FabricItemSettings()));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel", new ShovelItem(ModToolsMaterial.ENDERITE, 1, -2f, new FabricItemSettings()));
    public static final Item ENDERITE_SWORD = registerItem("enderite_sword", new SwordItem(ModToolsMaterial.ENDERITE, 3, -2f, new FabricItemSettings()));
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDERITE_CHESPLATE = registerItem("enderite_chestplate", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots", new ArmorItem(ModArmorMaterials.ENDERITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    //Smithing Template with Tooltip
    private static Item registerItemWithTooltip(String name, String upgradeTo, String appliesTo, String ingredient) {
        return registerItem(name, new Item(new FabricItemSettings()) {
            @Override
            public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable(upgradeTo).formatted(Formatting.GRAY));
                tooltip.add(Text.of(""));
                tooltip.add(Text.translatable("item.ascendedalloys.appliesTo_title").formatted(Formatting.GRAY));
                tooltip.add(Text.translatable(appliesTo).formatted(Formatting.BLUE));
                tooltip.add(Text.translatable("item.ascendedalloys.ingredient_title").formatted(Formatting.GRAY));
                tooltip.add(Text.translatable(ingredient).formatted(Formatting.BLUE));
            }
        });
    }



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AscendedAlloys.MOD_ID, name), item);
    }

    public static void registeredModItems() {
        AscendedAlloys.LOGGER.info("Initialize " + AscendedAlloys.MOD_ID);
    }
}
