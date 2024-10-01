package net.kuma.ascendedalloys.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.kuma.ascendedalloys.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.IRON_UPGRADE, 1),
                            3, 10,0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(ModItems.IRON_UPGRADE, 2),
                            5, 6,0.07f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(ModItems.ENDERITE_UPGRADE, 1),
                            1, 20,0.3f));
                });
    }
}
