open class Person(val name: String) {
    open fun show(age: Int){
        println("Your name $name")
        println("Your age $age")
    }
}