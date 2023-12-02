# Jetpack Compose Draggable Lazy Column

This is a sample project that demonstrates how to create a customized `LazyColumn` in Jetpack Compose that supports long press and drag-and-drop functionality for its items.

## Overview

The `DraggableLazyList` component in this project allows you to create a `LazyColumn` with draggable items. You can long press on an item to start dragging it, and then drop it in a new position within the list. The `onSwap` callback is triggered when two items are swapped.

## Usage

To use the `DraggableLazyList` component in your project, follow these steps:

1. Copy the `DraggableLazyList` function to your project.

2. Make sure you have the necessary dependencies for Jetpack Compose, including `androidx.compose.foundation` and `androidx.compose.runtime`.

3. Create a list of `ListItem` objects that you want to display in the `LazyColumn`. Each `ListItem` should have an `id` and `text` property.

4. Pass the `items` list and the `onSwap` callback function to the `DraggableLazyList` component.

```kotlin
DraggableLazyList(
    items = yourItemList,
    onSwap = { index1, index2 ->
        // Implement the logic to swap the items at index1 and index2
    }
)
```

## Components

### `rememberDragDropState`

The `rememberDragDropState` function is used to create a `DragDropState` object that manages the state of dragging and dropping within the `LazyColumn`. It takes the `LazyListState` and the `onSwap` callback as parameters and returns the `DragDropState`.

### `DraggableItem`

The `DraggableItem` function is a composable function that represents a draggable item within the `LazyColumn`. It takes the `dragDropState`, `index`, `modifier`, and `content` as parameters. The `content` lambda defines the content of the item, and it receives a `isDragging` parameter that indicates whether the item is currently being dragged.

### `DragDropState`

The `DragDropState` class manages the state of dragging and dropping within the `LazyColumn`. It is created using the `rememberDragDropState` function and takes the `LazyListState`, `CoroutineScope`, and `onSwap` callback as parameters.

The `DragDropState` class contains functions to handle drag start, drag interruption, and drag movement. It also keeps track of the current and previous indexes of the dragged item, as well as the offset of the dragging item.

## Example

Here's an example of how you can use the `DraggableLazyList` component in your project:

```kotlin
@Composable
fun MyScreen() {
    val items = remember { generateItemList() }

    DraggableLazyList(
        items = items,
        onSwap = { index1, index2 ->
            val temp = items[index1]
            items[index1] = items[index2]
            items[index2] = temp
        }
    )
}

@Composable
fun generateItemList(): List<ListItem> {
    // Generate and return a list of ListItem objects
}
```

In this example, `MyScreen` is a composable function that displays the `DraggableLazyList` with a list of items. The `onSwap` callback swaps the items at the given indexes in the list.


[Screen_recording_20231202_034120.webm](https://github.com/parniyan7/DraggableLazyColumnCompose/assets/51333944/18b554be-9826-4974-aef0-47586742ee07)

With the `DraggableLazyList` component, you can easily create a Jetpack Compose `LazyColumn` that supports long press and drag-and-drop functionality. Feel free to customize the appearance and behavior of the items to fit your specific needs.

Enjoy using Jetpack Compose with draggable lists!
