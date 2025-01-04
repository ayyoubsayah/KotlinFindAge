import java.util.*

fun main() {
    // Get the current year from the system date
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    // Ask the user to input their year of birth
    print("Enter your year of birth: ")
    val yearOfBirth = readLine()?.toIntOrNull()

    if (yearOfBirth != null && yearOfBirth in 1900..currentYear) {
        val age = currentYear - yearOfBirth
        println("Your age is: $age years old")
    } else {
        println("Invalid input. Please enter a valid year between 1900 and $currentYear.")
    }
}