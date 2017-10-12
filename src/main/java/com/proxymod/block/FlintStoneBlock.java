package com.proxymod.block;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FlintStoneBlock extends Block {

    public FlintStoneBlock(String name) {
        super(Material.ROCK);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        // Configuration of block properties:
        setHardness(2f);
        setResistance(4f);
        setSoundType(SoundType.STONE);
    }

}
