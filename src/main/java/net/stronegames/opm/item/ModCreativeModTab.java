package net.stronegames.opm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab OnePunchMan = new CreativeModeTab("onepunchman") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GI_CHEST.get());
        }
    };
}
