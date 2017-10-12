package com.proxymod.proxy;


import com.proxymod.Items.TestItem;
import com.proxymod.block.FlintStoneBlock;
import com.proxymod.proxymod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = proxymod.MODID)


public class CommonProxy {

    public static Item TEST_ITEM = new TestItem("testItem");
    public static Block FLINT_STONE_BLOCK = new FlintStoneBlock("fredblock");
    public void preInit(FMLPreInitializationEvent e) { }
    public void init(FMLInitializationEvent e) { }
    public void postInit(FMLPostInitializationEvent e) { }
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(FLINT_STONE_BLOCK);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(TEST_ITEM);
        event.getRegistry().register(new ItemBlock(FLINT_STONE_BLOCK)
                .setRegistryName(FLINT_STONE_BLOCK.getRegistryName()));
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(TEST_ITEM);
        registerRender(Item.getItemFromBlock(FLINT_STONE_BLOCK));
    }
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}
