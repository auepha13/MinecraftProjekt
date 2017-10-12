package com.proxymod.proxy;

import com.ersterversuch.testmod.items.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        GameRegistry.addShapedRecipe(new ResourceLocation("Test"),null,
                new ItemStack(Items.ARROW),
                "XYX",
                "XZX",
                " ",
                'X', Items.REDSTONE,
                'Y', Items.STICK,
                'Z', ModItems.KEY_GRAY);

    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
    }
}
