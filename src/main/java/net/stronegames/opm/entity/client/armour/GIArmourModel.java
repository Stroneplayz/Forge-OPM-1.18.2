package net.stronegames.opm.entity.client.armour;

import net.minecraft.resources.ResourceLocation;
import net.stronegames.opm.OPM;
import net.stronegames.opm.item.custom.GIArmourItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GIArmourModel extends AnimatedGeoModel<GIArmourItem> {
    @Override
    public ResourceLocation getModelLocation(GIArmourItem giArmourItem) {
        return new ResourceLocation(OPM.MOD_ID,"geo/gi.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GIArmourItem giArmourItem) {
        return new ResourceLocation(OPM.MOD_ID,"textures/models/armor/gi.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GIArmourItem giArmourItem) {
        return new ResourceLocation(OPM.MOD_ID,"animations/armour_nothing.json");
    }
}
