package com.tyom.domain.repository

import com.tyom.domain.models.TemplateResponse

interface InitRepository {
    suspend fun templateUseCase(): TemplateResponse?
}