package net.mykull.mykullswires.libs.multiblock;

import net.minecraft.core.BlockPos;

public interface IMultiblockPart<TYPE> {
    BlockPos getWorldPosition();
    void setController(MultiblockController controller);
    MultiblockController getController();
    void onAttached(MultiblockController controller);
    void onDetached();
    TYPE getPartType();
}