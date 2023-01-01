package com.dingshibo.mc.stones_cookbook;


import com.dingshibo.mc.stones_cookbook.item.SCFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

    public class Stones_cookbook implements ModInitializer {
        public static final String MOD_ID = "stones_cookbook";
        public static final Logger LOGGER = LoggerFactory.getLogger("stones_cookbook");

        public static final Item APPLE_PIE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.APPLE_PIE));
        public static final Item SWEETBERRY_PIE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.SWEETBERRY_PIE));
        public static final Item CHOCOLATE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.CHOCOLATE));
        public static final Item PROCESSED_PUFFERFISH = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.PROCESSED_PUFFERFISH));
        public static final Item MAGMA_PIE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.MAGMA_PIE));
        public static final Item HONEY_PIE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.HONEY_PIE));
        public static final Item COPPER_APPLE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.COPPER_APPLE));
        public static final Item LAPIS_LAZULI_APPLE = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.LAPIS_LAZULI_APPLE));
        public static final Item SEAFOOD_SANDWICH = new Item(new Item.Settings()
                .group(ItemGroup.FOOD).food(SCFoodComponents.SEAFOOD_SANDWICH));

        @Override
        public void onInitialize() {
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "apple_pie"), APPLE_PIE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "sweetberry_pie"), SWEETBERRY_PIE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "chocolate"), CHOCOLATE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "processed_pufferfish"), PROCESSED_PUFFERFISH);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "magma_pie"), MAGMA_PIE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "honey_pie"), HONEY_PIE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "copper_apple"), COPPER_APPLE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "lapis_lazuli_apple"), LAPIS_LAZULI_APPLE);
            Registry.register(Registry.ITEM, new Identifier("stones_cookbook", "seafood_sandwich"), SEAFOOD_SANDWICH);
        }
    }