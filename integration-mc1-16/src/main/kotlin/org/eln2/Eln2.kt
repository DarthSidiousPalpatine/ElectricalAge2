package org.eln2

import net.darkhax.bookshelf.item.ItemGroupBase
import net.darkhax.bookshelf.registry.RegistryHelper
import net.minecraft.client.gui.screen.inventory.CreativeScreen
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.eln2.registry.*
import org.eln2.utils.OreGen

const val MODID = "eln2"

/**
 * The main entry point and registry holder for Electrical Age.
 */
object Eln2 {
    // Directly reference a log4j logger.
    @JvmField
    val LOGGER: Logger = LogManager.getLogger()

    private val registry: RegistryHelper = RegistryHelper(MODID, LOGGER)

    /**
     * Initialization.
     *
     * This is run at class construction time, and should do as little as possible.
     */
    fun initialize() {
        // Register Items
        ChunkItems.values().forEach { registry.items.register(it.items, it.name.toLowerCase()) }
        MiscItems.values().forEach { registry.items.register(it.items, it.name.toLowerCase()) }

        // Register Blocks
        OreBlocks.values().forEach { registry.blocks.register(it.block, it.name.toLowerCase()) }
        MiscBlocks.values().forEach { registry.blocks.register(it.block, it.name.toLowerCase()) }
        registry.initialize(FMLJavaModLoadingContext.get().modEventBus)
    }

    /**
     * Preinit handler.
     *
     * This is run in a threaded context, so we cannot communicate with other mods without using IMC.
     */
    fun setup(event: FMLCommonSetupEvent) {
        OreGen.setupOreGeneration()
    }
}