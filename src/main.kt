//Create a class Car with the following attributes: make, model, color, capacity. It has these functions:
// -carry(people: Int) : Prints out “Carrying $people passengers” if the number of people is within its capacity else it prints out “Over capacity by $x people” where x is the number of people exceeding its capacity
//-identity() : Prints out the color, make and modeling the following format e.g:  “I am a white subaru legacy”. -calculateParkingFees(hours: Int) : Calculates and returns the parking fees by multiplying the hours by 20
//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that calculates and returns the maximum amount of fare that can be collected per
//trip.The bus’calculateParkingFees method returns the product of hours and the capacity of the bus
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes and call each of the functions on the objects.

fun main(){
    var car=Car("mercedes benz","G-Class","sliver-grey",4)
    var bus =Bus("toyota","hiace","blue",32)
    println( car.make)
    println( car.model)
    println( car.color)
    println(car.capacity)
    car.carry(7)
    car.identity()
   println( car.calculateParkingFees(5))

    println(bus.make)
    println(bus.model)
    println(bus.color)
    println(bus.capacity)
    bus.carry(30)
    bus.identity()
    println( bus.maxTripFare(95.85))
    println( bus.calculateParkingFees(7))


}
 open class Vehicle(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people - capacity
        if (people <= capacity){

            println("carring $people passangers")}
        else
        {
            println("Overcapacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model .")
    }
   open  fun calculateParkingFees(hours:Int):Int{
         var mult = hours * 20
         return mult
     }
}
class Car(make:String, model:String, color:String, capacity:Int):Vehicle(make,model,color,capacity) {


}
 class Bus(make:String,model:String,color:String,capacity:Int):Vehicle(make,model,color,capacity){

     fun maxTripFare(fare:Double):Double{
        var money= capacity * fare
         return money
     }

     override fun calculateParkingFees(hours: Int): Int {
        // return super.calculateParkingFees(hours)
         var product= hours * capacity
         return product
     }
 }
