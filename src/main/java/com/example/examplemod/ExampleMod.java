package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "falcon";
    public static final String NAME = "FalconCraft";
    public static final String VERSION = "1.0";

    private static Logger logger;
    
    //Steel items
    public static final ToolMaterial steel;
    static Item steelPickaxe;
    static Item steelAxe;
    static Item steelShovel;
    static Item steelHoe;
    static Item steelSword;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        
        steel = EnumHelper.addToolMaterial(steel, 3, 1561, 8.0f, 3.0f, 10)
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
