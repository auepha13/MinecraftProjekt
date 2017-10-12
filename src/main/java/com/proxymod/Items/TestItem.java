package com.proxymod.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

    public class TestItem extends Item {
        public TestItem(String name) {
            setUnlocalizedName(name);
            setRegistryName(name);
            setCreativeTab(CreativeTabs.MISC);
        }
    }


