package com.aviallon.hardblocks.proxy;

import com.aviallon.hardblocks.client.settings.KeyBindings;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding(KeyBindings.release);
    }
}