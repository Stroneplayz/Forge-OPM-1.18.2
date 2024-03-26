package net.stronegames.opm.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.stronegames.opm.OPM;
import net.stronegames.opm.entity.client.armour.*;
import net.stronegames.opm.item.custom.*;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = OPM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderer(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(SaitamaArmourItem.class, new SaitamaArmourRenderer());
        GeoArmorRenderer.registerArmorRenderer(GIArmourItem.class, new GIArmourRenderer());
    }
}
