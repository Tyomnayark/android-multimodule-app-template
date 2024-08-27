package com.tyom.domain.usecases

import com.tyom.domain.models.TemplateResponse
import com.tyom.domain.repository.InitRepository
import javax.inject.Inject

class TemplateUseCase @Inject constructor(
    private val initRepository: InitRepository
) {
    suspend fun templateUseCase(): TemplateResponse? {
        return initRepository.templateUseCase()
    }
}