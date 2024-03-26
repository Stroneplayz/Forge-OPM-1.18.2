package net.stronegames.opm.system.client;

import net.minecraft.client.resources.language.I18n;

public class OPMhudType {
    public enum HudElementType {

        POWER_GUI("name.power_gui");

        private String displayName;

        private HudElementType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return I18n.get(this.displayName);
        }
    }
}
