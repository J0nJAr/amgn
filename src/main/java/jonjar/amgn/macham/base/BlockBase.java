package jonjar.amgn.macham.base;

import jdk.nashorn.internal.ir.Block;
import jdk.nashorn.internal.ir.Statement;

public class BlockBase extends Block {



    public BlockBase(long token, int finish, Statement... statements) {
        super(token, finish, statements);
    }
}
