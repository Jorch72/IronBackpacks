package main.ironbackpacks.util;

import main.ironbackpacks.ModInformation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

public class IronBackpacksConstants {

    //A lot (but not all) of the constants used in this mod

    public static final class General{

    }

    public static final class Backpacks{
        public static final int BASIC_ID = 1;
        public static final int IRON_ID = 2;
        public static final int GOLD_ID = 3;
        public static final int DIAMOND_ID = 4;
    }

    public static final class Upgrades{

        //=============IDs====================
        public static final int BUTTON_UPGRADE_ID = 1;
        public static final int NESTING_UPGRADE_ID = 2;
        public static final int DAMAGE_BAR_UPGRADE_ID = 3;
        public static final int KEEP_ON_DEATH_UPGRADE_ID = 4;
        //Alternate Gui
        public static final int RENAMING_UPGRADE_ID = 5;
        public static final int FILTER_UPGRADE_ID = 6;
        public static final int HOPPER_UPGRADE_ID = 7;
        public static final int CONDENSER_UPGRADE_ID = 8;

        //================Upgrade Info===================
        public static final String[] BUTTON_DESCRIPTION = {"Adds buttons to quickly move items","to and from your backpack, as well as","a button to sort your backpack quickly."};
        public static final String[] NESTING_DESCRIPTION = {"Allows you to place any backpack","of a previous tier inside the backpack."};
        public static final String[] DAMAGE_BAR_DESCRIPTION = {"Adds a damage bar to visually represent","how full the backpack is at a glance."};
        public static final String[] KEEP_ON_DEATH_DESCRIPTION = {"Allows you to keep the backpack when you die.", "The upgrade disappears after death though", "(you will have to reapply it if you want it again)."};
        //Alternate Gui
        public static final String[] RENAMING_DESCRIPTION = {"Allows you to rename the backpack."};
        public static final String[] FILTER_DESCRIPTION = {"Adds a configurable filter of items","that the backpack will automatically collect."};
        public static final String[] HOPPER_DESCRIPTION = {"Allows you to specify an item to keep stocked","in your inventory/hotbar","which is supplied from your backpack."};
        public static final String[] CONDENSER_DESCRIPTION = {"Allows you to specify a set of items","to be compressed upon entering your backpack."};
        //All together now

        public static final String[] LOCALIZED_NAMES = {StatCollector.translateToLocal("emptyUpgradeSlot"),
                StatCollector.translateToLocal("item.ironbackpacks:buttonUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:nestingUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:damageBarUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:keepOnDeathUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:renamingUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:filterUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:hopperUpgrade.name"),
                StatCollector.translateToLocal("item.ironbackpacks:condenserUpgrade.name")};

    }

    public static final class Gui{

    }

    public static final class Resources {
        public static final ResourceLocation WIDGETS = new ResourceLocation(ModInformation.ID, "textures/guis/widgets.png");
    }

    public static final class Miscellaneous{
        public static final String MOST_SIG_UUID = "MostSigUUID";
        public static final String LEAST_SIG_UUID = "LeastSigUUID";
    }

}