package com.infrastructuresickos.rootways;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("rootways")
public class Rootways {
    public static final Logger LOGGER = LogManager.getLogger();

    public Rootways() {
        LOGGER.info("Rootways mod initialized");
    }
}
