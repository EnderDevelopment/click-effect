package com.example.inventoryeffects.asm;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

public class InventoryEffectsCorePlugin implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"com.example.inventoryeffects.asm.InventoryEffectsTransformer"};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(java.util.Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}