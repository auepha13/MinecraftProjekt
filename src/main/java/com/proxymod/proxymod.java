package com.proxymod;
import com.ersterversuch.testmod.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = proxymod.MODID, version = proxymod.VERSION)
public class proxymod {
    public static final String MODID = "proxy";
    public static final String VERSION = "0.1";
    @Mod.Instance
    public static proxymod instance;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(proxymod.MODID + ":preInit");
        ModItems.init();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(proxymod.MODID + ":init");
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(proxymod.MODID + ":postInit");
    }
}



