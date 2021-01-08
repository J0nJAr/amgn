package jonjar.amgn.kimbepo.data.client;

import jonjar.amgn.Amgn;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    /*
    아이템과 블럭의 구분을 확실히 할 것.
    아이템 모델과 블럭 State의 상관관계는 X
     */
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Amgn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("chocolate_ore", modLoc("block/chocolate_ore"));
        withExistingParent("chocolate_block", modLoc("block/chocolate_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "chocolate_ingot");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name){
        return getBuilder(name).parent(itemGenerated).texture("layer0", "assets/amgn-mod/textures/item/" + name);
        // TODO : 리소스팩에 대한 연구도 필요한가?
    }
}
