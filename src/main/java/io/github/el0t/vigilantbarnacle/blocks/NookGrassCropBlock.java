package io.github.el0t.vigilantbarnacle.blocks;

import io.github.el0t.vigilantbarnacle.init.BlockInit;
import io.github.el0t.vigilantbarnacle.init.ItemInit;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class NookGrassCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0 ,3);
    public NookGrassCropBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected ItemLike getBaseSeedId(){
        return ItemInit.NOOK_SEEDS.get();
    }
    @Override
    public IntegerProperty getAgeProperty(){
        return AGE;
    }
    @Override
    public int getMaxAge(){
        return 3;
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder){
        builder.add(AGE);
    }
}
