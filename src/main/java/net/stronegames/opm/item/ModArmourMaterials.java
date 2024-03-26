package net.stronegames.opm.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.stronegames.opm.OPM;
import java.util.function.Supplier;

public enum ModArmourMaterials implements ArmorMaterial {
        SILK("saitama_suit", 5, new int[]{3, 4, 7, 1}, 15, SoundEvents.ARMOR_EQUIP_LEATHER, 5.3F, 3.5F, () -> {
            return Ingredient.of(ModItems.YELLOW_SILK.get());
        }),
        METAL_W("weights", 5, new int[]{0, 15, 0, 0}, 0, SoundEvents.ARMOR_EQUIP_LEATHER, 6.3F, 5.6F, () -> {
        return Ingredient.of(ModItems.YELLOW_SILK.get());
        }),
        WOOL("gi", 5, new int[]{0, 2, 3, 0}, 10, SoundEvents.ARMOR_EQUIP_LEATHER, 2.3F, 1.5F, () -> {
            return Ingredient.of(ModItems.FINISHED_SILK.get());
        });

        private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
        private final String name;
        private final int durabilityMultiplier;
        private final int[] slotProtections;
        private final int enchantmentValue;
        private final SoundEvent sound;
        private final float toughness;
        private final float knockbackResistance;
        private final LazyLoadedValue<Ingredient> repairIngredient;

        private ModArmourMaterials(String pName, int pDurabilityMultiplier, int[] pSlotProtections, int pEnchantmentValue, SoundEvent pSound, float pToughness, float pKnockbackResistance, Supplier<Ingredient> pRepairIngredient) {
            this.name = pName;
            this.durabilityMultiplier = pDurabilityMultiplier;
            this.slotProtections = pSlotProtections;
            this.enchantmentValue = pEnchantmentValue;
            this.sound = pSound;
            this.toughness = pToughness;
            this.knockbackResistance = pKnockbackResistance;
            this.repairIngredient = new LazyLoadedValue<>(pRepairIngredient);
        }

        public int getDurabilityForSlot(EquipmentSlot pSlot) {
            return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
        }

        public int getDefenseForSlot(EquipmentSlot pSlot) {
            return this.slotProtections[pSlot.getIndex()];
        }

        public int getEnchantmentValue() {
            return this.enchantmentValue;
        }

        public SoundEvent getEquipSound() {
            return this.sound;
        }

        public Ingredient getRepairIngredient() {
            return this.repairIngredient.get();
        }

        public String getName() {
            return OPM.MOD_ID + ":" + this.name;
        }

        public float getToughness() {
            return this.toughness;
        }

        /**
         * Gets the percentage of knockback resistance provided by armor of the material.
         */
        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }

}
