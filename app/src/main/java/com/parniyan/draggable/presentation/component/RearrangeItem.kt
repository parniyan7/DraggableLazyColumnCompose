package com.parniyan.draggable.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import com.parniyan.draggable.R


/**
 * Created by Parniyan Mousaie on 11/12/23.
 */

@Composable
fun RearrangeItem(
    title: String,
    description: String

) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                width = 2.dp,
                color = Color.Blue,
                shape = RoundedCornerShape(8.dp),
            )
            .background(Color.White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BaseIcon(
                modifier = Modifier
                    .size(32.dp),
                iconId = R.drawable.ic_rearrange_drag
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 16.dp)
                    .padding(horizontal = 12.dp),
            ) {
                Text(
                    modifier = Modifier
                        .wrapContentSize(),
                    text = title,
                    color = Color.Blue,
                )
                Text(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(top = 8.dp),
                    text = description,
                    color = Color.Blue
                )
            }
        }
    }
}