package jonjar.amgn.kimbepo.data;

import jonjar.amgn.Amgn;
import jonjar.amgn.kimbepo.data.client.ModBlockStateProvider;
import jonjar.amgn.kimbepo.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Amgn.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

    /*
    굳이 resources 루트에 모델을 추가해주지 않아도 해당 클래스가 모델을 추가해준다.
    .json 을 덮어씌우는 클래스므로, json 파일을 수정하더라도 해당 클래스가 제시하는대로 json 파일이 생성?된다.

    SilentChaos의 말에 따르면,
    [1] 작은 모드의 경우는 json 양식을
    [2] 큰 모드의 경우는 획일화를 위해 class를 권장한다고 언급
    */

    private DataGenerators() { }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
    }
}
