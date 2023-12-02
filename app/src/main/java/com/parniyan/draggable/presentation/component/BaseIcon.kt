package com.parniyan.draggable.presentation.component

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection

@Composable
fun BaseIcon(
    modifier: Modifier = Modifier,
    @DrawableRes iconId: Int,
    tint: Color = Color.Unspecified
) {
    val isRtl = LocalLayoutDirection.current == LayoutDirection.Rtl
    Icon(
        modifier = modifier
            .graphicsLayer {
                if (isRtl) scaleX = -1f
            },
        painter = painterResource(id = iconId),
        tint = tint,
        contentDescription = null
    )
}