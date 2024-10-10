class Student (private val id: String, private val name: String, private val course: String) {

    var mark = 0.0
        set(newMark) {
            if(newMark in 0.0..100.0) {
                field = newMark
            }
        }


    fun getGrade() : String{
        val grade = when(mark) {
            in 70.0..100.0 -> "First"
            in 60.0..69.9 -> "2/1"
            in 50.0..59.9 -> "2/2"
            in 40.0..49.9 -> "Third"
            in 0.0..39.9 -> "Fail"
            else -> {
                "mark is not within acceptable bounds of 0-100"
            }
        }
        return grade
    }

    fun didPass() : Boolean {
        return mark >= 40.0
    }

    public override fun toString(): String
    {
        return "ID: $id, Name: $name, Course: $course, Mark: $mark, Grade:${getGrade()}, Pass: ${didPass()}"
    }
}

