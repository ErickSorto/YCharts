package co.yml.charts.ui.bubblechart.model

import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultBlendMode
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import co.yml.charts.ui.linechart.model.LineType

/**
 * Handles styling for the bubble drawn in the bubble chart
 *
 * @param color Defines the color of the bubble.
 * @param width Defines the width of the bubble border stroke.
 * @param alpha Defines the alpha of the bubble.
 * @param style Defines if the bubble is filled or stroke.
 * @param colorFilter ColorFilter to apply to the [color] when drawn into the destination.
 * @param blendMode All prams related to selection popup to be added here in [SelectionHighlightPopUp]
 */
data class BubbleStyle(
    val color: Color = Color.Blue,
    val width: Float = 8f,
    val alpha: Float = 1.0f,
    val style: DrawStyle = Fill,
    val colorFilter: ColorFilter? = null,
    val blendMode: BlendMode = DefaultBlendMode
)