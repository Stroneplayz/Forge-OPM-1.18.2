package net.stronegames.opm.system.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

import java.util.HashMap;
import java.util.Map;

import static net.stronegames.opm.system.client.OPMhudType.HudElementType.POWER_GUI;

public abstract class Hud {

    /** Hud key for registering */
    private final String hudKey;

    /** Hud name for display in settings */
    private final String hudName;

    protected Map<OPMhudType.HudElementType, OPMhud> elements = new HashMap<OPMhudType.HudElementType, OPMhud>();

    /** Minecraft instance */
    protected Minecraft mc;

    public int chatOffset = 0;
    public Hud(Minecraft mc, String hudKey, String hudName) {
        this.mc = mc;
        this.hudKey = hudKey;
        this.hudName = hudName;
        this.setElements();
    }

    /**
     * Function to register all elements to this HUD.<br>
     * Has to be run in order for this HUD to function properly
     */
    public void setElements() {

               this.elements.put(POWER_GUI, setElementPower_Gui());

    }

    protected OPMhud setElementPower_Gui() {
    }


    /** get the key (String) of this HUD */
    public String getHudKey() {
        return this.hudKey;
    }

    /** get the name of this HUD */
    public String getHudName() {
        return this.hudName;
    }

    /** Function which returns a new element which is the health element */
    protected abstract OPMhud setElementHealth();



    /**
     * Draws the an element of the OPMhudType type on the screen
     *
     * @param type
     *            The type of the Element
     * @param gui
     *            The gui to draw on
     * @param zLevel
     *            The zLevel to draw at
     * @param partialTicks
     *            The partialTicks for animations
     */
    public void drawElement(OPMhudType type, Gui gui, PoseStack ms, float zLevel, float partialTicks, int scaledWidth, int scaledHeight) {
        this.elements.get(type).draw(gui, ms, zLevel, partialTicks, scaledWidth, scaledHeight);
    }

    /**
     * Checks whether the element of the specified type should be rendered
     *
     * @param type
     *            The OPMhudType to get checked
     * @return true if it should be rendered, false if not
     */
    public boolean checkElementConditions(OPMhudType type) {
        return this.elements.get(type).checkConditions();
    }

    public boolean isVanillaElement(OPMhudType type) {
        return this.elements.get(type) == null;
    }
}public abstract class Hud {

    /** Hud key for registering */
    private final String hudKey;

    /** Hud name for display in settings */
    private final String hudName;

    protected Map<OPMhudType, OPMhud> elements = new HashMap<OPMhudType, OPMhud>();

    /** Minecraft instance */
    protected Minecraft mc;

    public int chatOffset = 0;
    public Hud(Minecraft mc, String hudKey, String hudName) {
        this.mc = mc;
        this.hudKey = hudKey;
        this.hudName = hudName;
        this.setElements();
    }

    /**
     * Function to register all elements to this HUD.<br>
     * Has to be run in order for this HUD to function properly
     */
    public void setElements() {

        this.elements.put(POWER_GUI, setElementPower_Gui());

    }

    /** get the key (String) of this HUD */
    public String getHudKey() {
        return this.hudKey;
    }

    /** get the name of this HUD */
    public String getHudName() {
        return this.hudName;
    }

    /** Function which returns a new element which is the health element */
    protected abstract OPMhud setElementPower_Gui();

    /**
     * Function which returns a new element which is the experience level
     * element
     */

    /**
     * Draws the an element of the OPMhudType type on the screen
     *
     * @param type
     *            The type of the Element
     * @param gui
     *            The gui to draw on
     * @param zLevel
     *            The zLevel to draw at
     * @param partialTicks
     *            The partialTicks for animations
     */
    public void drawElement(OPMhudType type, Gui gui, PoseStack ms, float zLevel, float partialTicks, int scaledWidth, int scaledHeight) {
        this.elements.get(type).draw(gui, ms, zLevel, partialTicks, scaledWidth, scaledHeight);
    }

    /**
     * Checks whether the element of the specified type should be rendered
     *
     * @param type
     *            The OPMhudType to get checked
     * @return true if it should be rendered, false if not
     */
    public boolean checkElementConditions(OPMhudType type) {
        return this.elements.get(type).checkConditions();
    }

    public boolean isVanillaElement(OPMhudType type) {
        return this.elements.get(type) == null;
    }
}