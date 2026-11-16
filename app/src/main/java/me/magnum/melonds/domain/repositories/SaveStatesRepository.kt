package me.magnum.melonds.domain.repositories

import android.graphics.Bitmap
import android.net.Uri
import me.magnum.melonds.domain.model.rom.Rom
import me.magnum.melonds.domain.model.SaveStateSlot

interface SaveStatesRepository {
    fun getRomSaveStates(rom: Rom): List<SaveStateSlot>
    fun getRomQuickSaveStateSlot(rom: Rom): SaveStateSlot
    /** Next slot (1..12, round-robin after the most recently written one) for the quick save hotkey. */
    fun getRomRotatingQuickSaveSlot(rom: Rom): SaveStateSlot
    /** Most recently written slot among 1..12, or null if none exist. */
    fun getRomLatestRotatingSlot(rom: Rom): SaveStateSlot?
    fun getRomSaveStateUri(rom: Rom, saveState: SaveStateSlot): Uri
    fun setRomSaveStateScreenshot(rom: Rom, saveState: SaveStateSlot, screenshot: Bitmap)
    fun deleteRomSaveStateScreenshot(rom: Rom, saveState: SaveStateSlot)
    fun deleteRomSaveState(rom: Rom, saveState: SaveStateSlot)
}