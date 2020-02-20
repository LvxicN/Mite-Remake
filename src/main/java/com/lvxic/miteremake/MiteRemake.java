package com.lvxic.miteremake;

import net.minecraftforge.fml.common.Mod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MiteRemake.MODID)
public final class MiteRemake {
    public static final String MODID = "miteremake";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    public MiteRemake() {
        LOGGER.info("Hello World !");
        LOGGER.info("This is Mod MiteRemake");
    }


}