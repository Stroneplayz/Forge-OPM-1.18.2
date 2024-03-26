package net.stronegames.opm.entity.client.armour;

import net.minecraft.resources.ResourceLocation;
import net.stronegames.opm.OPM;
import net.stronegames.opm.item.custom.WeightsWArmourItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WeightsWArmourModel extends AnimatedGeoModel<WeightsWArmourItem> {

    @Override
    public ResourceLocation getModelLocation(WeightsWArmourItem weightsarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"geo/weights.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WeightsWArmourItem weightswarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"textures/models/armor/weights_weak.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WeightsWArmourItem weightswarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"animations/armour_nothing.json");
    }
}
