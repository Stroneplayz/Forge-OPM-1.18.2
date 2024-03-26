package net.stronegames.opm.entity.client.armour;

import net.stronegames.opm.item.custom.SaitamaArmourItem;
import net.stronegames.opm.item.custom.WeightsMArmourItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class WeightsMArmourRenderer extends GeoArmorRenderer<WeightsMArmourItem> {

    public WeightsMArmourRenderer() {
        super(new WeightsMArmourModel());

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
