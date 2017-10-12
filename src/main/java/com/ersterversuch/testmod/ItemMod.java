package com.ersterversuch.testmod;


import com.ersterversuch.testmod.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ItemMod.MODID, version = ItemMod.VERSION)

public class ItemMod {

    public static final String MODID = "itemmod";
    public static final String VERSION = "0.1";

    @Mod.Instance
    public static ItemMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModItems.init();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }








}
