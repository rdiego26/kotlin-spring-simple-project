package me.diegoramos.pontointeligente.documents

import me.diegoramos.pontointeligente.enums.RecordTypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document
data class Record (
    val date: Date,
    val recordType: RecordTypeEnum,
    val employeeId: String,
    val description: String? = "",
    val location: String? = "",
    @Id val id: String? = null
)