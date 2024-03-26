package net.stronegames.opm.entity.client.armour;

import net.minecraft.resources.ResourceLocation;
import net.stronegames.opm.OPM;
import net.stronegames.opm.item.custom.WeightsMArmourItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WeightsMArmourModel extends AnimatedGeoModel<WeightsMArmourItem> {
    @Override
    public ResourceLocation getModelLocation(WeightsMArmourItem weightsmarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"geo/weights.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WeightsMArmourItem weightsmarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"textures/models/armor/weights_medium.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WeightsMArmourItem weightsmarmouritem) {
        return new ResourceLocation(OPM.MOD_ID,"animations/armour_nothing.json");
    }
}
