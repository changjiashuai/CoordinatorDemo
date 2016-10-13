# CoordinatorDemo
Coordinator Demo

##AppbarLayout flags

* SCROLL_FLAG_ENTER_ALWAYS：
	> ((entering) / (scrolling on screen))下拉的时候，这个View也会跟着滑出。
* SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED：
	> 另一种enterAlways，但是只显示折叠后的高度。

* SCROLL_FLAG_EXIT_UNTIL_COLLAPSED：
	> ((exiting) / (scrolling off screen))上拉的时候，这个View会跟着滑动直到折叠。

* SCROLL_FLAG_SCROLL：
	> 跟着滑动方向滑动。

* SCROLL_FLAG_SNAP：
	> 滑动结束的时候，如果这个View部分显示，它就会滑动到离它最近的上边缘或下边缘。