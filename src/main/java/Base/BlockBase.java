package Base;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {

    String name;
    Material material;

    public BlockBase(String name, Material material) {
        super();
        this.name=name;
        this.material=material;
    }
}
