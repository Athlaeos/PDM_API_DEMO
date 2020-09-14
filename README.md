# PDM_API_DEMO
## API demonstration for the ProgressiveDifficulty_MOBS minecraft plugin


Access the API with <PDMApi.getAPI()>, this acts as an easy access point for all the important managers the plugin uses.

If you have your own custom monsters and would like this plugin to not customize them when they spawn, be sure to give them the following metadata in a CreatureSpawnEvent with an eventpriority higher than LOW. The metadata can contain any value, but I chose 'true' here.

I also think you don't need to specifically use the PDM API in the creation of a FixedMetadataValue, any JavaPlugin instance will probably work but I haven't tested this yet.
```
//Entities with this metadata will not be customized by PDM
Entity#setMetadata("pdm-cancel_monster_custom", new FixedMetadataValue(PDMApi.getAPI().getPlugin(), true));

//Entities with this metadata will not get cursed by PDM
Entity#setMetadata("pdm-cancel_monster_cursed", new FixedMetadataValue(PDMApi.getAPI().getPlugin(), true));
```

If you want to alter the amounts of karma players obtain, create a listener with for the PlayerKarmaGainEvent with an event priority higher than LOW and change the values however you please. The event is cancellable. 
The event also allows you to choose whether or not you want the karma values reduced by diminishing returns. Setting diminishing returns to false allows you full control over how much karma the player gains. You can also choose whether or not you want to ignore the player's karma multipliers. 

</br>
</br>
</br>
</br>
For custom abilities and items a specific format is recommended, examples of which can be viewed in this repository


If you have any questions or suggestions, visit my discord server here: https://discord.gg/dUwtmYV
