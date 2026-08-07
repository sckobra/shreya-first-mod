package shreya.shreyafirstmod.creative_mode_tab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import shreya.shreyafirstmod.ShreyaFirstMod;
import shreya.shreyafirstmod.item.ModItems;

public class ModCreativeModeTabs {
    public static final CreativeModeTab TOILETRIES_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(ShreyaFirstMod.MOD_ID, "toiletries"), FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.TOOTHPASTE))
            .title(Component.translatable("creative_mod_tab.shreya_first_mod.toiletries"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.TOOTHPASTE);
            })
            .build());
    public static void registerModCreativeModeTabs() {
        ShreyaFirstMod.LOGGER.info("Registering Creative Mode Tabs for " + ShreyaFirstMod.MOD_ID);
    }
}
