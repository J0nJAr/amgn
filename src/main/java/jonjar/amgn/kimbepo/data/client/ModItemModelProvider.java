package jonjar.amgn.kimbepo.data.client;

import jonjar.amgn.Amgn;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Amgn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //withExistingParent("chocolate_ore", modLoc("block/chocolate_ore"));
        //withExistingParent("chocolate_block", modLoc("block/chocolate_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "item/chocolate_ingot");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
