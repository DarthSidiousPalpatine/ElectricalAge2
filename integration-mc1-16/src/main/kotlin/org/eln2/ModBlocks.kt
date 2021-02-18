package org.eln2

import net.minecraft.block.Block
import org.eln2.blocks.OreBlock
import org.eln2.node.NodeBlock
import org.eln2.utils.OreData

/**
 * Blocks added here are automatically registered.
 */
enum class ModBlocks(val block: Block) {
    ORE_ACANTHITE(OreBlock(OreData(1.0f, "acanthite",1.0F, ModItems.ORE_CHUNKS_ACANTHITE.items.defaultInstance))),
    ORE_ANTHRACITE_COAL(OreBlock(OreData(1.0f, "anthracite_coal",1.0F, ModItems.ORE_CHUNKS_ANTHRACITE_COAL.items.defaultInstance))),
    ORE_AZURITE(OreBlock(OreData(1.0f, "azurite",1.0F, ModItems.ORE_CHUNKS_AZURITE.items.defaultInstance))),
    ORE_BAUXITE(OreBlock(OreData(1.0f, "bauxite",1.0F, ModItems.ORE_CHUNKS_BAUXITE.items.defaultInstance))),
    ORE_BISMUTHINITE(OreBlock(OreData(1.0f, "bismuthinite",1.0F, ModItems.ORE_CHUNKS_BISMUTHINITE.items.defaultInstance))),
    ORE_BITUMINOUS_COAL(OreBlock(OreData(1.0f, "bituminous_coal",1.0F, ModItems.ORE_CHUNKS_BITUMINOUS_COAL.items.defaultInstance))),
    ORE_BORAX(OreBlock(OreData(1.0f, "borax",1.0F, ModItems.ORE_CHUNKS_BORAX.items.defaultInstance))),
    ORE_CASSITERITE(OreBlock(OreData(1.0f, "cassiterite",1.0F, ModItems.ORE_CHUNKS_CASSITERITE.items.defaultInstance))),
    ORE_CASSITERITE_RARE(OreBlock(OreData(1.0f, "cassiterite_rare",1.0F, ModItems.ORE_CHUNKS_CASSITERITE_RARE.items.defaultInstance))),
    ORE_CATTIERITE(OreBlock(OreData(1.0f, "cattierite",1.0F, ModItems.ORE_CHUNKS_CATTIERITE.items.defaultInstance))),
    ORE_CERUSSITE(OreBlock(OreData(1.0f, "cerussite",1.0F, ModItems.ORE_CHUNKS_CERUSSITE.items.defaultInstance))),
    ORE_CHALCOCITE(OreBlock(OreData(1.0f, "chalcocite",1.0F, ModItems.ORE_CHUNKS_CHALCOCITE.items.defaultInstance))),
    ORE_CHALCOPYRITE(OreBlock(OreData(1.0f, "chalcopyrite",1.0F, ModItems.ORE_CHUNKS_CHALCOPYRITE.items.defaultInstance))),
    ORE_CHROMITE(OreBlock(OreData(1.0f, "chromite",1.0F, ModItems.ORE_CHUNKS_CHROMITE.items.defaultInstance))),
    ORE_CINNABAR(OreBlock(OreData(1.0f, "cinnabar",1.0F, ModItems.ORE_CHUNKS_CINNABAR.items.defaultInstance))),
    ORE_COPPER(OreBlock(OreData(1.0f, "copper",1.0F, ModItems.ORE_CHUNKS_COPPER.items.defaultInstance))),
    ORE_CORUNDUM(OreBlock(OreData(1.0f, "corundum",1.0F, ModItems.ORE_CHUNKS_CORUNDUM.items.defaultInstance))),
    ORE_CRYOLITE(OreBlock(OreData(1.0f, "cryolite",1.0F, ModItems.ORE_CHUNKS_CRYOLITE.items.defaultInstance))),
    ORE_DIAMOND(OreBlock(OreData(1.0f, "diamond",1.0F, ModItems.ORE_CHUNKS_DIAMOND.items.defaultInstance))),
    ORE_ESKOLAITE(OreBlock(OreData(1.0f, "eskolaite",1.0F, ModItems.ORE_CHUNKS_ESKOLAITE.items.defaultInstance))),
    ORE_FLUORITE(OreBlock(OreData(1.0f, "fluorite",1.0F, ModItems.ORE_CHUNKS_FLUORITE.items.defaultInstance))),
    ORE_GALENA(OreBlock(OreData(1.0f, "galena",1.0F, ModItems.ORE_CHUNKS_GALENA.items.defaultInstance))),
    ORE_GRAPHITE(OreBlock(OreData(1.0f, "graphite",1.0F, ModItems.ORE_CHUNKS_GRAPHITE.items.defaultInstance))),
    ORE_HALITE(OreBlock(OreData(1.0f, "halite",1.0F, ModItems.ORE_CHUNKS_HALITE.items.defaultInstance))),
    ORE_HEMATITE(OreBlock(OreData(1.0f, "hematite",1.0F, ModItems.ORE_CHUNKS_HEMATITE.items.defaultInstance))),
    ORE_ILMENITE(OreBlock(OreData(1.0f, "ilmenite",1.0F, ModItems.ORE_CHUNKS_ILMENITE.items.defaultInstance))),
    ORE_KERNITE(OreBlock(OreData(1.0f, "kernite",1.0F, ModItems.ORE_CHUNKS_KERNITE.items.defaultInstance))),
    ORE_LEPIDOLITE(OreBlock(OreData(1.0f, "lepidolite",1.0F, ModItems.ORE_CHUNKS_LEPIDOLITE.items.defaultInstance))),
    ORE_LIGNITE(OreBlock(OreData(1.0f, "lignite",1.0F, ModItems.ORE_CHUNKS_LIGNITE.items.defaultInstance))),
    ORE_LIMONITE(OreBlock(OreData(1.0f, "limonite",1.0F, ModItems.ORE_CHUNKS_LIMONITE.items.defaultInstance))),
    ORE_MAGNETITE(OreBlock(OreData(1.0f, "magnetite",1.0F, ModItems.ORE_CHUNKS_MAGNETITE.items.defaultInstance))),
    ORE_MALACHITE(OreBlock(OreData(1.0f, "malachite",1.0F, ModItems.ORE_CHUNKS_MALACHITE.items.defaultInstance))),
    ORE_MILLERITE(OreBlock(OreData(1.0f, "millerite",1.0F, ModItems.ORE_CHUNKS_MILLERITE.items.defaultInstance))),
    ORE_NATIVE_COPPER(OreBlock(OreData(1.0f, "native_copper",1.0F, ModItems.ORE_CHUNKS_NATIVE_COPPER.items.defaultInstance))),
    ORE_NATIVE_GOLD(OreBlock(OreData(1.0f, "native_gold",1.0F, ModItems.ORE_CHUNKS_NATIVE_GOLD.items.defaultInstance))),
    ORE_NATIVE_PLATINUM(OreBlock(OreData(1.0f, "native_platnium",1.0F, ModItems.ORE_CHUNKS_NATIVE_PLATINUM.items.defaultInstance))),
    ORE_NATIVE_SULFUR(OreBlock(OreData(1.0f, "native_sulfur",1.0F, ModItems.ORE_CHUNKS_NATIVE_SULFUR.items.defaultInstance))),
    ORE_PENTLANDITE(OreBlock(OreData(1.0f, "pentlandite",1.0F, ModItems.ORE_CHUNKS_PENTLANDITE.items.defaultInstance))),
    ORE_PETALITE(OreBlock(OreData(1.0f, "petalite",1.0F, ModItems.ORE_CHUNKS_PETALITE.items.defaultInstance))),
    ORE_PSILOMELANE(OreBlock(OreData(1.0f, "psilomelane",1.0F, ModItems.ORE_CHUNKS_PSILOMELANE.items.defaultInstance))),
    ORE_PYRITE(OreBlock(OreData(1.0f, "pyrite",1.0F, ModItems.ORE_CHUNKS_PYRITE.items.defaultInstance))),
    ORE_PYROLUSITE(OreBlock(OreData(1.0f, "pyrolusite",1.0F, ModItems.ORE_CHUNKS_PYROLUSITE.items.defaultInstance))),
    ORE_QUARTZ(OreBlock(OreData(1.0f, "quartz",1.0F, ModItems.ORE_CHUNKS_QUARTZ.items.defaultInstance))),
    ORE_RHODOCHROSITE(OreBlock(OreData(1.0f, "rhodochrosite",1.0F, ModItems.ORE_CHUNKS_RHODOCHROSITE.items.defaultInstance))),
    ORE_RUTILE(OreBlock(OreData(1.0f, "rutile",1.0F, ModItems.ORE_CHUNKS_RUTILE.items.defaultInstance))),
    ORE_SCHEELITE(OreBlock(OreData(1.0f, "scheelite",1.0F, ModItems.ORE_CHUNKS_SCHEELITE.items.defaultInstance))),
    ORE_SIDERITE(OreBlock(OreData(1.0f, "siderite",1.0F, ModItems.ORE_CHUNKS_SIDERITE.items.defaultInstance))),
    ORE_SILVER(OreBlock(OreData(1.0f, "silver",1.0F, ModItems.ORE_CHUNKS_SILVER.items.defaultInstance))),
    ORE_SMITHSONITE(OreBlock(OreData(1.0f, "smithsonite",1.0F, ModItems.ORE_CHUNKS_SMITHSONITE.items.defaultInstance))),
    ORE_SPHALERITE(OreBlock(OreData(1.0f, "sphalerite",1.0F, ModItems.ORE_CHUNKS_SPHALERITE.items.defaultInstance))),
    ORE_SPHEROCOBALTITE(OreBlock(OreData(1.0f, "spherocobaltite",1.0F, ModItems.ORE_CHUNKS_SPHEROCOBALTITE.items.defaultInstance))),
    ORE_SPODUMENE(OreBlock(OreData(1.0f, "spodumene",1.0F, ModItems.ORE_CHUNKS_SPODUMENE.items.defaultInstance))),
    ORE_STANNITE(OreBlock(OreData(1.0f, "stannite",1.0F, ModItems.ORE_CHUNKS_STANNITE.items.defaultInstance))),
    ORE_SYLVITE(OreBlock(OreData(1.0f, "sylvite",1.0F, ModItems.ORE_CHUNKS_SYLVITE.items.defaultInstance))),
    ORE_TANTALITE(OreBlock(OreData(1.0f, "tantalite",1.0F, ModItems.ORE_CHUNKS_TANTALITE.items.defaultInstance))),
    ORE_TITANITE(OreBlock(OreData(1.0f, "titanite",1.0F, ModItems.ORE_CHUNKS_TITANITE.items.defaultInstance))),
    ORE_WOLFRAMITE(OreBlock(OreData(1.0f, "wolframite",1.0F, ModItems.ORE_CHUNKS_WOLFRAMITE.items.defaultInstance)))
}
