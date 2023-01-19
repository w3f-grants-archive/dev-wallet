package one.tesseract.devwallet.rust

import one.tesseract.devwallet.UI
import one.tesseract.devwallet.interop.RustObject

class Core(handle: Long): RustObject(handle) {
    companion object {
        init {
            System.loadLibrary("wallet")
        }

        @JvmStatic
        external fun create(ui: UI, dataDir: String): Core
    }

    external fun testSettingsProvider(): TestSettingsProvider
}