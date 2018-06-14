package ru.tvhelp.akruglov.myplayer

open class Person(name: String = "Peter", val age: Int = 10) {
    var name: String = name
        get() = "Name: $field"
        set(value) {
            if (value != field) {
                field = value
            }
        }
}

class Developer: Person {
    constructor(name: String): super(name)
    constructor(age: Int): super(age = age)
}