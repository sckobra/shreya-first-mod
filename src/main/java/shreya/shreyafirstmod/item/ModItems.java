package shreya.shreyafirstmod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import shreya.shreyafirstmod.ShreyaFirstMod;

import java.util.function.Function;

public class ModItems {
    public static final Item TOOTHPASTE = registerItem("toothpaste", Item::new);


    // returns an Item (defined by mc)
    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ShreyaFirstMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ShreyaFirstMod.MOD_ID, name)))));
    }



    public static void registerModItems() {
        ShreyaFirstMod.LOGGER.info("Registering Mod Items for: " + ShreyaFirstMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> output.accept(TOOTHPASTE));
    }
}
