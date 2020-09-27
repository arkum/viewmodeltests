package me.iunknown.kotlinviewmodel.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import me.iunknown.kotlinviewmodel.repository.Repository
import kotlin.math.log

class MainViewModel(var repository: Repository) : ViewModel() {
    private val TAG: String? = "MainViewModel"
    private var _text = ""
    init {
        _text = repository.getText()
}
    var text : String
    get() {
        Log.d(TAG, ":Testing")
        return _text
    }
    set(value) {
        _text = value
    }

    var enabled: Boolean = false
        get() = _text.length > 0
}