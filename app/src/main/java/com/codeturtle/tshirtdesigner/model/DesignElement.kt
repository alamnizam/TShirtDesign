package com.codeturtle.tshirtdesigner.model

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import java.util.UUID

sealed class DesignElement(
    open val id: String = UUID.randomUUID().toString(),
    open val position: Offset
) {
    data class TextElement(
        override val id: String = UUID.randomUUID().toString(),
        override var position: Offset,
        var text: String,
        var color: Color = Color.Black,
        var fontSize: Float = 40f
    ) : DesignElement(id, position)

    data class ImageElement(
        override val id: String = UUID.randomUUID().toString(),
        override var position: Offset,
        var bitmap: ImageBitmap,
        var scale: Float = 1f,
        var rotation: Float = 0f
    ) : DesignElement(id, position)
}