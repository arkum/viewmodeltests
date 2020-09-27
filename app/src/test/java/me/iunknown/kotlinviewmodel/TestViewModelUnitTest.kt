package me.iunknown.kotlinviewmodel

import me.iunknown.kotlinviewmodel.repository.InMemoryRepository
import me.iunknown.kotlinviewmodel.ui.main.MainViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class TestViewModelUnitTest {
    @Test
    fun test_isViewModelTextHelloWorld() {
        var viewModel:MainViewModel = MainViewModel(InMemoryRepository())
        assertEquals("From In Memory Repository", viewModel.text)
    }
    @Test
    fun test_isButtondisabledwhen_TextEmpty() {
        var viewModel:MainViewModel = MainViewModel(InMemoryRepository())
        viewModel.text = ""
        assertEquals(false, viewModel.enabled)
    }
}