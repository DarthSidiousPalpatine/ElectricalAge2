package org.eln2.mc

import net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.eln2.mc.common.blocks.BlockRegistry
import org.eln2.mc.common.cell.CellRegistry
import org.eln2.mc.common.items.ItemRegistry
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(Eln2.MODID)
object Eln2 {
    const val MODID: String = "eln2"

    private val LOGGER: Logger = LogManager.getLogger()

    init {

        BlockRegistry.setup(MOD_BUS)
        ItemRegistry.setup(MOD_BUS)

        // custom registries
        CellRegistry.setup(MOD_BUS)

        LOGGER.info("Prepared registries.")
    }
}