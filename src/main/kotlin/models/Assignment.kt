package models
import java.time.LocalDate

data class Assignment(
    val assignmentId : String,
    val modCode : String,
    val name: String,
    val type: String,
    val dueDate : LocalDate,
    val weight : Double,
    val status: String,
    val result : Double?,
    val notes : String
)
