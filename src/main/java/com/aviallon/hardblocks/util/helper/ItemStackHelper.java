package com.aviallon.hardblocks.util.helper;

import com.aviallon.hardblocks.reference.Colors;
import com.aviallon.hardblocks.reference.NBTType;
import com.aviallon.hardblocks.reference.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.UUID;

public class ItemStackHelper {

    public static void resetStatefulTags(ItemStack itemStack) {

        if (ItemStackHelper.hasTag(itemStack, Names.NBT.IS_CRAFTING_GUI_OPEN)) {
            ItemStackHelper.setBoolean(itemStack, Names.NBT.IS_CRAFTING_GUI_OPEN, false);
        }
        else if (ItemStackHelper.hasTag(itemStack, Names.NBT.IS_TRANSMUTATION_GUI_OPEN)) {
            ItemStackHelper.setBoolean(itemStack, Names.NBT.IS_TRANSMUTATION_GUI_OPEN, false);
        }
        else if (ItemStackHelper.hasTag(itemStack, Names.NBT.IS_ALCHEMICAL_BAG_GUI_OPEN)) {
            ItemStackHelper.setBoolean(itemStack, Names.NBT.IS_ALCHEMICAL_BAG_GUI_OPEN, false);
        }
    }

    public static boolean hasTag(ItemStack itemStack, String keyName) {

        return itemStack != null && itemStack.getTagCompound() != null && itemStack.getTagCompound().hasKey(keyName);
    }

    public static boolean hasTag(ItemStack itemStack, String keyName, NBTType nbtType) {

        return itemStack != null && itemStack.getTagCompound() != null && itemStack.getTagCompound().hasKey(keyName, nbtType.ordinal());
    }

    public static void removeTag(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            itemStack.getTagCompound().removeTag(keyName);
        }
    }

    public static boolean hasUUID(ItemStack itemStack) {

        return hasTag(itemStack, Names.NBT.OBJECT_UUID_MOST_SIG_BITS, NBTType.LONG) && hasTag(itemStack, Names.NBT.OBJECT_UUID_LEAST_SIG_BITS, NBTType.LONG);
    }

    public static void setUUID(ItemStack itemStack) {

        setUUID(itemStack, UUID.randomUUID());
    }

    public static void setUUID(ItemStack itemStack, UUID uuid) {

        if (itemStack != null && uuid != null) {

            initNBTTagCompound(itemStack);
            setLong(itemStack, Names.NBT.OBJECT_UUID_MOST_SIG_BITS, uuid.getMostSignificantBits());
            setLong(itemStack, Names.NBT.OBJECT_UUID_LEAST_SIG_BITS, uuid.getLeastSignificantBits());
        }
    }

    public static boolean hasOwnerUUID(ItemStack itemStack) {

        return hasTag(itemStack, Names.NBT.OWNER_UUID_MOST_SIG_BITS, NBTType.LONG) && hasTag(itemStack, Names.NBT.OWNER_UUID_LEAST_SIG_BITS, NBTType.LONG);
    }

    public static UUID getOwnerUUID(ItemStack itemStack) {

        if (hasOwnerUUID(itemStack)) {
            return new UUID(getLong(itemStack, Names.NBT.OWNER_UUID_MOST_SIG_BITS), getLong(itemStack, Names.NBT.OWNER_UUID_LEAST_SIG_BITS));
        }

        return null;
    }

    public static void setOwnerUUID(ItemStack itemStack, EntityPlayer entityPlayer) {

        setLong(itemStack, Names.NBT.OWNER_UUID_MOST_SIG_BITS, entityPlayer.getUniqueID().getMostSignificantBits());
        setLong(itemStack, Names.NBT.OWNER_UUID_LEAST_SIG_BITS, entityPlayer.getUniqueID().getLeastSignificantBits());
    }

    public static boolean hasOwnerName(ItemStack itemStack) {

        return hasTag(itemStack, Names.NBT.OWNER_NAME, NBTType.STRING);
    }

    public static String getOwnerName(ItemStack itemStack) {

        if (hasOwnerName(itemStack)) {
            return getString(itemStack, Names.NBT.OWNER_NAME);
        }

        return null;
    }

    public static void setOwnerName(ItemStack itemStack, EntityPlayer entityPlayer) {

        setString(itemStack, Names.NBT.OWNER_NAME, entityPlayer.getDisplayNameString());
    }

    public static boolean hasOwner(ItemStack itemStack) {
        return hasOwnerName(itemStack) && hasOwnerUUID(itemStack);
    }

    public static void setOwner(ItemStack itemStack, EntityPlayer entityPlayer) {

        setOwnerName(itemStack, entityPlayer);
        setOwnerUUID(itemStack, entityPlayer);
    }

    /**
     * Initializes the NBT Tag Compound for the given ItemStack if it is null
     *
     * @param itemStack The ItemStack for which its NBT Tag Compound is being checked for initialization
     */
    private static void initNBTTagCompound(ItemStack itemStack) {

        if (itemStack != null && itemStack.getTagCompound() == null) {
            itemStack.setTagCompound(new NBTTagCompound());
        }
    }

    public static long getLong(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getLong(keyName);
        }

        return 0L;
    }

    public static void setLong(ItemStack itemStack, String keyName, long keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setLong(keyName, keyValue);
        }
    }

    public static String getString(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getString(keyName);
        }

        return "";
    }

    public static void setString(ItemStack itemStack, String keyName, String keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setString(keyName, keyValue);
        }
    }

    public static boolean getBoolean(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getBoolean(keyName);
        }

        return false;
    }

    public static void setBoolean(ItemStack itemStack, String keyName, boolean keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setBoolean(keyName, keyValue);
        }
    }

    public static byte getByte(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getByte(keyName);
        }

        return (byte) 0;
    }

    public static void setByte(ItemStack itemStack, String keyName, byte keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setByte(keyName, keyValue);
        }
    }

    public static short getShort(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getShort(keyName);
        }

        return (short) 0;
    }

    public static void setShort(ItemStack itemStack, String keyName, short keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setShort(keyName, keyValue);
        }
    }

    public static int getInteger(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getInteger(keyName);
        }

        return 0;
    }

    public static void setInteger(ItemStack itemStack, String keyName, int keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setInteger(keyName, keyValue);
        }
    }

    public static float getFloat(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getFloat(keyName);
        }

        return 0f;
    }

    public static void setFloat(ItemStack itemStack, String keyName, float keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setFloat(keyName, keyValue);
        }
    }

    public static double getDouble(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getDouble(keyName);
        }

        return 0d;
    }

    public static void setDouble(ItemStack itemStack, String keyName, double keyValue) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setDouble(keyName, keyValue);
        }
    }

    public static NBTTagList getTagList(ItemStack itemStack, String keyName, int nbtBaseType) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getTagList(keyName, nbtBaseType);
        }

        return new NBTTagList();
    }

    public static void setTagList(ItemStack itemStack, String keyName, NBTTagList nbtTagList) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setTag(keyName, nbtTagList);
        }
    }

    public static NBTTagCompound getTagCompound(ItemStack itemStack, String keyName) {

        if (itemStack != null && itemStack.getTagCompound() != null) {
            return itemStack.getTagCompound().getCompoundTag(keyName);
        }

        return new NBTTagCompound();
    }

    public static void setTagCompound(ItemStack itemStack, String keyName, NBTTagCompound nbtTagCompound) {

        if (itemStack != null) {
            initNBTTagCompound(itemStack);
            itemStack.getTagCompound().setTag(keyName, nbtTagCompound);
        }
    }

    public static boolean hasColor(ItemStack itemStack) {

        return hasTag(itemStack, Names.NBT.DISPLAY, NBTType.COMPOUND) && getTagCompound(itemStack, Names.NBT.DISPLAY).hasKey(Names.NBT.COLOR, NBTType.INT.ordinal());
    }

    public static int getColor(ItemStack itemStack) {

        if (hasColor(itemStack)) {
            return itemStack.getTagCompound().getCompoundTag(Names.NBT.DISPLAY).getInteger(Names.NBT.COLOR);
        }

        return Colors.PURE_WHITE;
    }

    public static void setColor(ItemStack itemStack, int color) {

        if (itemStack != null) {
            if (itemStack.getTagCompound() == null) {
                itemStack.setTagCompound(new NBTTagCompound());
            }

            if (itemStack.getTagCompound().hasKey(Names.NBT.DISPLAY, NBTType.COMPOUND.ordinal())) {
                itemStack.getTagCompound().getCompoundTag(Names.NBT.DISPLAY).setInteger(Names.NBT.COLOR, color);
            }
            else {
                NBTTagCompound displayTagCompound = new NBTTagCompound();
                displayTagCompound.setInteger(Names.NBT.COLOR, color);
                itemStack.getTagCompound().setTag(Names.NBT.DISPLAY, displayTagCompound);
            }
        }
    }
}