fun main() {
    val studentList = mutableListOf<String>()
    for (i in 1..5) {
        println("please enter the id")
        val id = readln()
        println("please enter the student name")
        val name = readln()
        println("please enter the course for $name")
        val course = readln()
        println("please enter the mark")
        val mark = readln().toDouble()
        val student = Student(id, name, course)
        student.mark = mark
        studentList.add("$student")
    }
    for (students in studentList) {
        println("$students")
    }
}