package com.aviallon.hardblocks.client.handler;

import com.aviallon.hardblocks.client.settings.KeyBindings;
import com.aviallon.hardblocks.reference.Key;
import com.aviallon.hardblocks.utility.LogHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

/**
 * Created by antoineviallon on 17/05/2016.
 */
public class KeyInputEventHandler {
    private static Key getPressedKeyBinding(){
        if (KeyBindings.charge.isPressed()){
            return Key.CHARGE;
        } else if (KeyBindings.release.isPressed()){
            return Key.RELEASE;
        }
        return Key.UNKNOWN;
    }


    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event){
        Key key = getPressedKeyBinding();
        switch(key){
            case CHARGE:
                LogHelper.info("Chaaarge");
                break;
            case RELEASE:
                LogHelper.info("Ok, release it");
                break;
        }
    }
}
