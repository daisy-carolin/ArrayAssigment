import java.util.*

fun main(){
    objectsArray("knife","spoon","cup","basin")
    cities()
    numbers()
    var name=person("Daisi","AkiraChix","Kenya")
    println(name)



}

fun objectsArray(knife:String,spoon:String,cup:String,basin:String){
    var objects=arrayOf(knife,spoon,cup,basin)
    println(Arrays.toString(objects))

}
fun cities(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+"," +cities[1].capitalize()+","+ cities[2] .capitalize()+","+cities[3].capitalize()+",")
}
fun numbers(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var total=numbers.component2()+numbers.component5()
    println(total)
    var index=numbers.indexOf(158)
    println(index)
    var int=(numbers.sortedArray())
    for(element in int){
    println(element)
    }

}
fun person(name:String,school:String,country:String):String{
    var String=arrayOf(name,school,country)
    return(Arrays.toString(String))
}