//1.kotlin is developed by? Google
/*2.which of the following is used to handle null exceptions in kotlin?Elvis operator
* 3.which file extension is used to save kotlin files?.kt or .kts
* 4.What is an immutable variable?A variable which cannot change read only
* 5.All classes in kotlin classes are default? public
* 6.How do u get the length of a string in  Kotlin?str.length*/

/*coding skills
* 1.*/
fun checkIfQEmpty(q: String?)=q?.length
fun checkIfyEmpty(y: String?)=y?.length

fun checkLetterInString(q: String?, y:String?):String{
    var letter = y ?: "No letter entered"
    var indexis = q?.indexOf("$y")
    var ind= indexis?.plus(1)

    return when {
        checkIfQEmpty(q) == 0 -> "please enter a Word"
        checkIfyEmpty(y) == 0 -> "please enter the letter you are searching for"
        ind == 0 -> "Am sorry letter $letter is not in the string"
        else -> "letter $letter is letter number ${ind} in the word "
    }
}

class Car(var brand:String?, var model:String?, var color: String?){

    fun checkIfBrandIsEmpty(brand: String?): String {
        return if (brand?.length==0){
            "Please enter the car brand"
        }else{"brand $brand "}

    }
    fun checkIfModelIsEmpty(model: String?): String{
        return if (model?.length==0){
            "Please enter the car model"
        }else{"model $model "}

    }
    fun checkIfColorIsEmpty(model: String?): String{
       return if (color?.length==0){
           "Please enter the car color"
        }else{"color is $color"}

    }

    fun accelerate(brand: String?): String {
        return when(brand){
            "audi"->"high accelaration"
            "lamborgini"->"very high accelaration"
            "nissan" ->"normal acceleration"
            "mazda"->"normal accelation"
            "ford"->"below average accelaration"
            "toyota"->"moderate accelaration"
            "mercedes"->"above high accelation"
            "ferari"->"super high acceleration"
            "mclareen"->"super high acceleration"
            "porshe"->"ultra high acceleration"
            "volkswagen"->"extra high accleration"
            else->"low acceleration"
        }

    }

    fun carColor(color: String?): String? {
     return color


    }
}
fun main(){
    for(x in 0..9){
        println("$x")
    }

    var q:String?
    var w:Long?

    var e:String
    q="Good afternoon Jose"
    e="Good afternoon Jose"

    if (q==e){
        println("Hey string q and e are egual ")
    }else{
    println("they are not equal strings")
    }
    var y:String?

    println("To search for a letter in a word;"+
            " Enter a word?")
    q = readLine()
    println("Enter the letter you are searching for:")
    y = readLine()

    println(checkLetterInString(q, y))

//   6. declare a lambda function
    var sum: (Int, Int) -> Int = {a:Int, b:Int -> a + b}
//    7.declare a class car with the data members brand and model,then have member functions "accelarate"
//    and "carColor" these two functions should print out how a certain brand of car will
//    accelerate and what the color of the car is.
    println("Enter car brand:")
    var brand:String?=readLine()
    println("Enter car model:")
    var model:String?=readLine()
    println("Enter color:")
    var color:String?=readLine()

    var car=Car(brand,model,color)

    println("${car.checkIfBrandIsEmpty(brand)}  ${car.checkIfModelIsEmpty(model)} ${car.checkIfColorIsEmpty(color)} ")
    println("Car brand:$brand Model:$model has ${car.accelerate(brand)} and is ${car.carColor(color)} in color")

//    8.	Declare a Kotlin array
    var arr= arrayOf("cars","lorries","buses","trucks","suv")
    var i="kotlin"
    println("the length of kotlin = ${i.length}")

    var hello="hello World"
    var output: (String) -> Unit ={ hello:String-> println("hello world") }
    println("${output(hello)}")


}