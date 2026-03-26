fun main() {

    // Store patient with disease
    val patients = mutableListOf(
        "Rahul - Fever",
        "Amit - Cold",
        "Sneha - Headache",
        "Pooja - Diabetes",
        "Ravi - Flu"
    )

    while (true) {
        println("\n--- Hospital Management System ---")
        println("1. Add Patient")
        println("2. View Patients")
        println("3. Remove Patient")
        println("4. Exit")
        print("Enter your choice: ")

        val choice = readLine()?.toIntOrNull()

        when (choice) {

            1 -> {
                print("Enter patient name: ")
                val name = readLine()

                print("Enter disease: ")
                val disease = readLine()

                if (!name.isNullOrEmpty() && !disease.isNullOrEmpty()) {
                    patients.add("$name - $disease")
                    println("Patient added successfully.")
                } else {
                    println("Invalid input.")
                }
            }

            2 -> {
                println("\nList of Patients:")
                if (patients.isEmpty()) {
                    println("No patients available.")
                } else {
                    for (i in patients.indices) {
                        println("${i + 1}. ${patients[i]}")
                    }
                }
            }

            3 -> {
                print("Enter patient number to remove: ")
                val index = readLine()?.toIntOrNull()

                if (index != null && index > 0 && index <= patients.size) {
                    val removed = patients.removeAt(index - 1)
                    println("$removed removed successfully.")
                } else {
                    println("Invalid number.")
                }
            }

            4 -> {
                println("Exiting program...")
                break
            }

            else -> println("Invalid choice. Try again.")
        }
    }
}
