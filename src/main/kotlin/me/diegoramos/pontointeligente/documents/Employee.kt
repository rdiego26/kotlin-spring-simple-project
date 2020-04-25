package me.diegoramos.pontointeligente.documents

import me.diegoramos.pontointeligente.enums.ProfileEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (
    val name: String,
    val email: String,
    val password: String,
    val cpf: String,
    val profile: ProfileEnum,
    val companyId: String,
    val valuePerHour: Double? = 0.0,
    val qtyWorkedHoursPerDay: Float? = 0.0f,
    val qtyLunchHours: Float? = 0.0f,
    @Id val id: String? = null
)