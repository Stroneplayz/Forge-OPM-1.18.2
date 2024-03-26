package net.stronegames.opm.entity.client.armour;

import net.minecraft.resources.ResourceLocation;
import net.stronegames.opm.OPM;
import net.stronegames.opm.item.custom.SaitamaArmourItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SaitamaArmourModel extends AnimatedGeoModel<SaitamaArmourItem> {
    @Override
    public ResourceLocation getModelLocation(SaitamaArmourItem saitamaarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"geo/saitama_suit.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SaitamaArmourItem saitamaarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"textures/models/armor/saitama_suit.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SaitamaArmourItem saitamaarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"animations/armour_nothing.json");
    }
}
