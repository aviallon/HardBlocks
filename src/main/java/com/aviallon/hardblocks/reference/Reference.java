package com.aviallon.hardblocks.reference;

public class Reference {

    public static final String MOD_ID = "hardblocks";
    public static final String MOD_NAME = "HardBlocks";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String MOD_VERSION = "@MOD_VERSION@";
    public static final String DEPENDENCIES = "";
    public static final String SERVER_PROXY_CLASS = "com.aviallon.hardblocks.proxy.ServerProxy";
    public static final String CLIENT_PROXY_CLASS = "com.aviallon.hardblocks.proxy.ClientProxy";
    //public static final String GUI_FACTORY_CLASS = "com.aviallon.hardblocks.client.gui.GuiFactory";

    public static enum HBBlocks {
        HARDENEDROCK("hardenedRock", "BlockHardenedRock"),
        NONFLAMMABLEWOOD("nonflammableWood", "BlockNonflammableWood"),
        REINFORCEDROCK("reinforcedRock", "BlockReinforcedRock");

        private String unlocalizedName;
        private String registryName;

        HBBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }

    public static enum HBItems {
        TEST("copperOre", "BlockCopperOre");

        private String unlocalizedName;
        private String registryName;

        HBItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName(){
            return unlocalizedName;
        }

        public String getRegistryName(){
            return registryName;
        }
    }
}
