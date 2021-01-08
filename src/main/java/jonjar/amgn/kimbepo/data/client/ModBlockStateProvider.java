package jonjar.amgn.kimbepo.data.client;


import jonjar.amgn.Amgn;
import jonjar.amgn.kimbepo.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Amgn.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.CHOCOLATE_ORE.get());
        simpleBlock(ModBlocks.CHOCOLATE_BLOCK.get());
    }
}
