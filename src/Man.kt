class Man(name: String):Person(name) {
    override fun show(age: Int) {
        println("Your name is $name")
        println("Your age is $age")
    }
}