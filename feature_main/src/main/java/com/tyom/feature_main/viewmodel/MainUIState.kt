package com.tyom.feature_main.viewmodel

import com.tyom.domain.models.TemplateResponse
import com.tyom.ui_tools.interfaces.UIState


data class MainUIState(
    val templateResponse: TemplateResponse? = null
): UIState