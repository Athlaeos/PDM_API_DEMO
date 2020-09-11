package me.athlaeos.pdmapitest;

import me.athlaeos.pdmapitest.abilities.TestAbility;
import me.athlaeos.pdmapitest.items.CustomItem;
import me.athlaeos.progressivelydifficultmobs.api.PDMApi;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("PDM Addon initialized");
        PDMApi.getAPI().getActiveItemManager().registerStandaloneActiveItem(new CustomItem());
        PDMApi.getAPI().getAbilityManager().registerInstantAbility("test_ability", new TestAbility());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
