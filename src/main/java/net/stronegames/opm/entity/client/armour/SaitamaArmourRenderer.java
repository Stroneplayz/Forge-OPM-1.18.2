package net.stronegames.opm.entity.client.armour;

import net.stronegames.opm.item.custom.SaitamaArmourItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class SaitamaArmourRenderer extends GeoArmorRenderer<SaitamaArmourItem> {

    public SaitamaArmourRenderer() {
        super(new SaitamaArmourModel());

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
