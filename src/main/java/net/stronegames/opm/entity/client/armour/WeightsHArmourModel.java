package net.stronegames.opm.entity.client.armour;

import net.minecraft.resources.ResourceLocation;
import net.stronegames.opm.OPM;
import net.stronegames.opm.item.custom.WeightsHArmourItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WeightsHArmourModel extends AnimatedGeoModel<WeightsHArmourItem> {
    @Override
    public ResourceLocation getModelLocation(WeightsHArmourItem weightsharmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"geo/weights.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WeightsHArmourItem weightsharmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"textures/models/armor/weights_hard.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WeightsHArmourItem weightsharmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"animations/armour_nothing.json");
    }
}
