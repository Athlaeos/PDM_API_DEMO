package me.athlaeos.pdmapitest.abilities;

import me.athlaeos.progressivelydifficultmobs.managers.AbilityManager;
import me.athlaeos.progressivelydifficultmobs.pojo.Ability;
import me.athlaeos.progressivelydifficultmobs.utils.Utils;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

import java.util.Arrays;

public class TestAbility extends Ability {
    public TestAbility(){
        this.name = Utils.chat("&7&lExample");
        this.description = Arrays.asList(
                Utils.chat("&7Monsters with this ability"),
                Utils.chat("&7will do something idk, probably scream"));
        this.icon = Material.BEDROCK;
        this.mobWhiteList = Arrays.asList(
                EntityType.CREEPER
        ); //here should go a list of EntityTypes

        AbilityManager.getInstance().registerInstantAbility("custom_ability_example", this);
    }

    @Override
    public void execute(Entity entity, Player player, Event event) {
        System.out.println("AAAAAAAAAAAAAAAAA");
    }
}
