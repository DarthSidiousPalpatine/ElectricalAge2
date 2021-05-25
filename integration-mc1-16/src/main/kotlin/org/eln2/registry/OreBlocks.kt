package org.eln2.registry

import org.eln2.blocks.OreBlock
import org.eln2.node.NodeBlock
import org.eln2.utils.OreData

/**
 * Blocks added here are automatically registered.
 */
enum class OreBlocks(val block: OreBlock) {
    ORE_ACANTHITE(OreBlock(OreData(1.0f, "acanthite",5, ChunkItems.ORE_CHUNKS_ACANTHITE.items.defaultInstance))),
    ORE_ANTHRACITE_COAL(OreBlock(OreData(1.0f, "anthracite_coal",5, ChunkItems.ORE_CHUNKS_ANTHRACITE_COAL.items.defaultInstance))),
    ORE_AZURITE(OreBlock(OreData(1.0f, "azurite",4, ChunkItems.ORE_CHUNKS_AZURITE.items.defaultInstance))),
    ORE_BAUXITE(OreBlock(OreData(1.0f, "bauxite",1, ChunkItems.ORE_CHUNKS_BAUXITE.items.defaultInstance))),
    ORE_BISMUTHINITE(OreBlock(OreData(1.0f, "bismuthinite",2, ChunkItems.ORE_CHUNKS_BISMUTHINITE.items.defaultInstance))),
    ORE_BITUMINOUS_COAL(OreBlock(OreData(1.0f, "bituminous_coal",2, ChunkItems.ORE_CHUNKS_BITUMINOUS_COAL.items.defaultInstance))),
    ORE_BORAX(OreBlock(OreData(1.0f, "borax",3, ChunkItems.ORE_CHUNKS_BORAX.items.defaultInstance))),
    ORE_CASSITERITE(OreBlock(OreData(1.0f, "cassiterite",2, ChunkItems.ORE_CHUNKS_CASSITERITE.items.defaultInstance))),
    ORE_CASSITERITE_RARE(OreBlock(OreData(1.0f, "cassiterite_rare",3, ChunkItems.ORE_CHUNKS_CASSITERITE_RARE.items.defaultInstance))),
    ORE_CATTIERITE(OreBlock(OreData(1.0f, "cattierite",2, ChunkItems.ORE_CHUNKS_CATTIERITE.items.defaultInstance))),
    ORE_CERUSSITE(OreBlock(OreData(1.0f, "cerussite",3, ChunkItems.ORE_CHUNKS_CERUSSITE.items.defaultInstance))),
    ORE_CHALCOCITE(OreBlock(OreData(1.0f, "chalcocite",3, ChunkItems.ORE_CHUNKS_CHALCOCITE.items.defaultInstance))),
    ORE_CHALCOPYRITE(OreBlock(OreData(1.0f, "chalcopyrite",3, ChunkItems.ORE_CHUNKS_CHALCOPYRITE.items.defaultInstance))),
    ORE_CHROMITE(OreBlock(OreData(1.0f, "chromite",2, ChunkItems.ORE_CHUNKS_CHROMITE.items.defaultInstance))),
    ORE_CINNABAR(OreBlock(OreData(1.0f, "cinnabar",3, ChunkItems.ORE_CHUNKS_CINNABAR.items.defaultInstance))),
    ORE_CORUNDUM(OreBlock(OreData(1.0f, "corundum",2, ChunkItems.ORE_CHUNKS_CORUNDUM.items.defaultInstance))),
    ORE_CRYOLITE(OreBlock(OreData(1.0f, "cryolite",3, ChunkItems.ORE_CHUNKS_CRYOLITE.items.defaultInstance))),
    ORE_ESKOLAITE(OreBlock(OreData(1.0f, "eskolaite",3, ChunkItems.ORE_CHUNKS_ESKOLAITE.items.defaultInstance))),
    ORE_FLUORITE(OreBlock(OreData(1.0f, "fluorite",3, ChunkItems.ORE_CHUNKS_FLUORITE.items.defaultInstance))),
    ORE_GALENA(OreBlock(OreData(1.0f, "galena",3, ChunkItems.ORE_CHUNKS_GALENA.items.defaultInstance))),
    ORE_GRAPHITE(OreBlock(OreData(1.0f, "graphite",2, ChunkItems.ORE_CHUNKS_GRAPHITE.items.defaultInstance))),
    ORE_HALITE(OreBlock(OreData(1.0f, "halite",2, ChunkItems.ORE_CHUNKS_HALITE.items.defaultInstance))),
    ORE_HEMATITE(OreBlock(OreData(1.0f, "hematite",3, ChunkItems.ORE_CHUNKS_HEMATITE.items.defaultInstance))),
    ORE_ILMENITE(OreBlock(OreData(1.0f, "ilmenite",2, ChunkItems.ORE_CHUNKS_ILMENITE.items.defaultInstance))),
    ORE_KERNITE(OreBlock(OreData(1.0f, "kernite",3, ChunkItems.ORE_CHUNKS_KERNITE.items.defaultInstance))),
    ORE_LEPIDOLITE(OreBlock(OreData(1.0f, "lepidolite",2, ChunkItems.ORE_CHUNKS_LEPIDOLITE.items.defaultInstance))),
    ORE_LIMONITE(OreBlock(OreData(1.0f, "limonite",3, ChunkItems.ORE_CHUNKS_LIMONITE.items.defaultInstance))),
    ORE_MAGNETITE(OreBlock(OreData(1.0f, "magnetite",3, ChunkItems.ORE_CHUNKS_MAGNETITE.items.defaultInstance))),
    ORE_MALACHITE(OreBlock(OreData(1.0f, "malachite",3, ChunkItems.ORE_CHUNKS_MALACHITE.items.defaultInstance))),
    ORE_MILLERITE(OreBlock(OreData(1.0f, "millerite",3, ChunkItems.ORE_CHUNKS_MILLERITE.items.defaultInstance))),
    ORE_NATIVE_COPPER(OreBlock(OreData(1.0f, "native_copper",3, ChunkItems.ORE_CHUNKS_NATIVE_COPPER.items.defaultInstance))),
    ORE_NATIVE_PLATNIUM(OreBlock(OreData(1.0f, "native_platnium",3, ChunkItems.ORE_CHUNKS_NATIVE_PLATNIUM.items.defaultInstance))),
    ORE_NATIVE_SULFUR(OreBlock(OreData(1.0f, "native_sulfur",1, ChunkItems.ORE_CHUNKS_NATIVE_SULFUR.items.defaultInstance))),
    ORE_PENTLANDITE(OreBlock(OreData(1.0f, "pentlandite",3, ChunkItems.ORE_CHUNKS_PENTLANDITE.items.defaultInstance))),
    ORE_PETALITE(OreBlock(OreData(1.0f, "petalite",3, ChunkItems.ORE_CHUNKS_PETALITE.items.defaultInstance))),
    ORE_PSILOMELANE(OreBlock(OreData(1.0f, "psilomelane",2, ChunkItems.ORE_CHUNKS_PSILOMELANE.items.defaultInstance))),
    ORE_PYRITE(OreBlock(OreData(1.0f, "pyrite",3, ChunkItems.ORE_CHUNKS_PYRITE.items.defaultInstance))),
    ORE_PYROLUSITE(OreBlock(OreData(1.0f, "pyrolusite",2, ChunkItems.ORE_CHUNKS_PYROLUSITE.items.defaultInstance))),
    ORE_QUARTZ(OreBlock(OreData(1.0f, "quartz",3, ChunkItems.ORE_CHUNKS_QUARTZ.items.defaultInstance))),
    ORE_RHODOCHROSITE(OreBlock(OreData(1.0f, "rhodochrosite",3, ChunkItems.ORE_CHUNKS_RHODOCHROSITE.items.defaultInstance))),
    ORE_RUTILE(OreBlock(OreData(1.0f, "rutile",3, ChunkItems.ORE_CHUNKS_RUTILE.items.defaultInstance))),
    ORE_SCHEELITE(OreBlock(OreData(1.0f, "scheelite",2, ChunkItems.ORE_CHUNKS_SCHEELITE.items.defaultInstance))),
    ORE_SIDERITE(OreBlock(OreData(1.0f, "siderite",3, ChunkItems.ORE_CHUNKS_SIDERITE.items.defaultInstance))),
    ORE_SILVER(OreBlock(OreData(1.0f, "silver",3, ChunkItems.ORE_CHUNKS_SILVER.items.defaultInstance))),
    ORE_SMITHSONITE(OreBlock(OreData(1.0f, "smithsonite",3, ChunkItems.ORE_CHUNKS_SMITHSONITE.items.defaultInstance))),
    ORE_SPHALERITE(OreBlock(OreData(1.0f, "sphalerite",3, ChunkItems.ORE_CHUNKS_SPHALERITE.items.defaultInstance))),
    ORE_SPHEROCOBALTITE(OreBlock(OreData(1.0f, "spherocobaltite",3, ChunkItems.ORE_CHUNKS_SPHEROCOBALTITE.items.defaultInstance))),
    ORE_SPODUMENE(OreBlock(OreData(1.0f, "spodumene",3, ChunkItems.ORE_CHUNKS_SPODUMENE.items.defaultInstance))),
    ORE_STANNITE(OreBlock(OreData(1.0f, "stannite",2, ChunkItems.ORE_CHUNKS_STANNITE.items.defaultInstance))),
    ORE_SYLVITE(OreBlock(OreData(1.0f, "sylvite",2, ChunkItems.ORE_CHUNKS_SYLVITE.items.defaultInstance))),
    ORE_TANTALITE(OreBlock(OreData(1.0f, "tantalite",3, ChunkItems.ORE_CHUNKS_TANTALITE.items.defaultInstance))),
    ORE_TITANITE(OreBlock(OreData(1.0f, "titanite",2, ChunkItems.ORE_CHUNKS_TITANITE.items.defaultInstance))),
    ORE_WOLFRAMITE(OreBlock(OreData(1.0f, "wolframite",2, ChunkItems.ORE_CHUNKS_WOLFRAMITE.items.defaultInstance)))
}
