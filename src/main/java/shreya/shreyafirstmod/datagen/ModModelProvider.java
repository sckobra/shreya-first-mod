package shreya.shreyafirstmod.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import shreya.shreyafirstmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output){
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators){

    }


    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators){
        itemModelGenerators.generateFlatItem(ModItems.TOOTHPASTE, ModelTemplates.FLAT_ITEM);
    }
}
