package me.magnum.melonds.domain.model

import android.net.Uri
import java.util.*

data class SaveStateSlot(val slot: Int, val exists: Boolean, val lastUsedDate: Date?, val screenshot: Uri?) {

    companion object {
        const val QUICK_SAVE_SLOT = 0
        /** Number of regular slots (1..MAX_SLOT). Quick save/load rotate through all of them. */
        const val MAX_SLOT = 12
    }
}