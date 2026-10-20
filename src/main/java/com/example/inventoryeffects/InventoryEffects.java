package com.example.inventoryeffects;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = InventoryEffects.MODID, version = InventoryEffects.VERSION)
public class InventoryEffects {
    public static final String MODID = "inventoryeffects";
    public static final String VERSION = "1.0.0";

    @SidedProxy(clientSide = "com.example.inventoryeffects.client.ClientProxy", serverSide = "com.example.inventoryeffects.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
}