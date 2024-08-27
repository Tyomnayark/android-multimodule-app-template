package com.tyom.feature_main.viewmodel

import androidx.lifecycle.ViewModel
import com.tyom.domain.usecases.TemplateUseCase
import com.tyom.utils.launchOnDefault
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val templateUseCase: TemplateUseCase
) : ViewModel() {
    val _uiState = MutableStateFlow(MainUIState())
    val uiState: StateFlow<MainUIState> = _uiState.asStateFlow()

    init {
        launchOnDefault {
            val response = templateUseCase.templateUseCase()

            _uiState.update { state ->
                state.copy(
                    templateResponse = response
                )
            }
        }
    }
}