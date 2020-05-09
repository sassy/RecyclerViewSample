package io.github.sassy.recyclerviewsample

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    fun getMembers(): List<String> {
        return listOf(
            "内藤るな",
            "高井千帆",
            "青山菜花",
            "白浜あや"
        )
    }
}