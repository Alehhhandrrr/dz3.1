open class sportcar(val name: String) {

    var year_of_issue: Int = 2020
        set(value) {
            if ((value > 2010) and (value < 2022))
                field = value
        }
        get() {
            return field
        }

     var max_speed: Int = 200
         set(value){
             if ((value>180) and (value<400))
                 field = value
         }
         get() {
             return field
         }

    fun printname(){
        println("Name of car: $name")
}
    fun printMaxspeed(){
        println("Max speed of this car = $max_speed")
}
}

class car(empName:String, val model: String): sportcar(empName){

    var countHP: Int = 370
        set(value) {
            if ((value > 300) and (value < 450))
                field = value
        }
        get() {
            return field
        }

    val fullname:String
        get() = "$name $model"

    fun allChar(){
    println("All characteristics: max speed = $max_speed, year of issue = $year_of_issue")
    }

    fun printModel(){
        println("Model of car: $model")
    }

}
    fun main() {

    val takeCar = car("Audi", "RS3")
    takeCar.year_of_issue = 2015 //sportcar
    takeCar.max_speed = 110 //sportcar
    takeCar.countHP = 400   //car
    println(takeCar.year_of_issue) //sportcar
    println(takeCar.max_speed) //sportcar
    println(takeCar.countHP) //car
    println(takeCar.fullname) //car
    takeCar.printname() //sportcar
    takeCar.printModel() //car
    takeCar.printMaxspeed() //sportcar
    takeCar.allChar() //car
}
