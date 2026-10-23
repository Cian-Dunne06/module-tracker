import models.Assignment
import models.Module
import java.time.LocalDate

fun main() {
    val module = Module("MD01", "Software Development Tools")
    val module2 = Module("MD02", "Creative Problem Solving")

    val assignment = Assignment("AS011", "MD01", "Written Quiz", "Exam", LocalDate.parse("2026-11-04"), 0.6, "Upcoming", null, "Should start doing some practice early, makes sure im comfortable." )
    val assignment2 = Assignment("AS021", "MD02", "Community Room Project", "Project", LocalDate.parse("2026-11-22"), 0.5, "Upcoming", null, "Start sorting teams out, get familiar with brief." )

    val assignments = listOf(assignment, assignment2)
    val mod1 = assignments.filter { it.modCode == "MD01" }
    println("Software Development Tools: $mod1")
}