package net.stronegames.opm.entity.client.armour;

import net.stronegames.opm.item.custom.SaitamaArmourItem;
import net.stronegames.opm.item.custom.WeightsHArmourItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WeightsHArmourRenderer extends GeoArmorRenderer<WeightsHArmourItem> {

    public WeightsHArmourRenderer() {
        super(new WeightsHArmourModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";

    }
}
