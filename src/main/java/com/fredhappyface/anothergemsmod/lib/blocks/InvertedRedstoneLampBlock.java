package com.fredhappyface.anothergemsmod.lib.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;

/**
 * @author FredHappyface
 * @version latest update 2019.08.06
 *
 * Creates an inverted light block like has been present in various mods over the
 * ages.
 */
public class InvertedRedstoneLampBlock extends RedstoneLampBlock {
    /**
     * Example usage:
     * final  Block.Properties gemLightProperties = Block.Properties.create(Material.REDSTONE_LIGHT)
     * .hardnessAndResistance(0.3f, 15).lightValue(15);
     * @param blockProperties pass a set of properties into the block such as the desired
     *                        light level
     */
    public InvertedRedstoneLampBlock(final Properties blockProperties) {
        super(blockProperties);
    }

    @Override
    /*
     * getlightValue doesn't seem to be behaving so I am returning 15 as a hard coded
     * value. This is sufficient for this mod but doesn't make this the best if you
     * wish to set a different value in the blockProperties
     */
    public int getLightValue(final BlockState state) {
        return state.get(LIT) ? 0 : 15;

    }
}
