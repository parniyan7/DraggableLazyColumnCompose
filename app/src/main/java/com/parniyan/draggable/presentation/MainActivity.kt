package com.parniyan.draggable.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.parniyan.draggable.data.ListItem
import com.parniyan.draggable.ui.theme.DraggableTheme


/**
 * Created by Parniyan Mousaie on 11/12/23.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DraggableTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DraggableLazyList(items = listOf(
                        ListItem("1","sub"),
                        ListItem("2","sub"),
                        ListItem("3","sub"),
                        ListItem("4","sub"),
                        ListItem("5","sub"),
                        ListItem("6","sub"),
                        ListItem("7","sub"),
                        ListItem("8","sub"),
                        ListItem("9","sub"),
                        ListItem("10","sub"),
                        ListItem("11","sub"),
                        ListItem("12","sub"),
                        ListItem("13","sub"),
                        ListItem("14","sub"),
                        ListItem("15","sub"),
                        ListItem("16","sub"),
                        ListItem("17","sub"),
                    ), onSwap = { i1, i2 -> })
                }
            }
        }
    }
}


