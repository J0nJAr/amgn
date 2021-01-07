package jonjar.amgn.kimbepo.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class ModItems {

    public static final RegistryObject<Item> DIRT_INGOT = Registration.ITEMS.register("dirt_ingot", () ->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register() { }

}
