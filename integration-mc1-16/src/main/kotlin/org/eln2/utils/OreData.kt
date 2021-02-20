package org.eln2.utils

import net.minecraft.item.ItemStack

/**
 * OreData
 * Data about the ores you are trying to make.
 *
 * @param hardness How hard is the block (pickaxe type basically)
 * @param name Name of the ore (eg, "native_copper")
 * @param rarity Rarity of the ore (eg, ->
 * Very Rare 0 - 24
 * Rare 25 - 49
 * Uncommon 50 - 73
 * Common 74 - 97
 * Very Common 98 - 120)
 * @param result The item to drop
 */
data class OreData(val hardness: Float, val name: String, val rarity: Int, val result: ItemStack)
