package net.stronegames.opm.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stronegames.opm.OPM;
import net.stronegames.opm.item.custom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, OPM.MOD_ID);

    //MOD ITEMS
    public static final RegistryObject<Item> YELLOW_SILK = ITEMS.register("yellow_silk",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> RED_SILK = ITEMS.register("red_silk",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> DARK_RED_SILK = ITEMS.register("dark_red_silk",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> SILK = ITEMS.register("silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> FINISHED_SILK = ITEMS.register("finished_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> BLUE_SILK = ITEMS.register("blue_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> BLACK_SILK = ITEMS.register("black_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> DARK_BLUE_SILK = ITEMS.register("dark_blue_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> GARY_SILK = ITEMS.register("gray_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> GREEN_SILK = ITEMS.register("green_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_SILK = ITEMS.register("light_gray_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> LIME_SILK = ITEMS.register("lime_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> ORANGE_SILK = ITEMS.register("orange_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> PINK_SILK = ITEMS.register("pink_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> VIOLET_SILK = ITEMS.register("violet_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));


// MOD ARMOUR
    public static final RegistryObject<Item> SAITAMA_SUIT_HELMET = ITEMS.register("saitama_suit_helmet",
            () -> new SaitamaArmourItem(ModArmourMaterials.SILK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModTab.OnePunchMan)));
    public static final RegistryObject<Item> SAITAMA_SUIT_CHEST = ITEMS.register("saitama_suit_chest",
            () -> new SaitamaArmourItem(ModArmourMaterials.SILK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.OnePunchMan)));
    public static final RegistryObject<Item> SAITAMA_SUIT_LEGGINGS = ITEMS.register("saitama_suit_leggings",
            () -> new SaitamaArmourItem(ModArmourMaterials.SILK, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.OnePunchMan)));
    public static final RegistryObject<Item> SAITAMA_SUIT_BOOTS = ITEMS.register("saitama_suit_boots",
            () -> new SaitamaArmourItem(ModArmourMaterials.SILK, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModTab.OnePunchMan)));

    public static final RegistryObject<Item> GI_CHEST = ITEMS.register("gi_chest",
            () -> new GIArmourItem(ModArmourMaterials.WOOL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModTab.OnePunchMan)));
    public static final RegistryObject<Item> GI_LEGGINGS = ITEMS.register("gi_leggings",
            () -> new GIArmourItem(ModArmourMaterials.WOOL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModTab.OnePunchMan)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
