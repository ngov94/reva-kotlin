package W2D5

//Topics today:
    //Interfaces
    //Abstract Class
    //Data Class
    //Sealed Class
    //Kotlin Objects
    //Nested and Inner Classes

fun main(){
    var c1 = Car()
    c1.start()
    c1.move()
}

//Interface
    //Interface provides a contract to the implementing class, and inforces that whatever
        //is in the interface should be implemented in the implementing class
    //Its something that provides a basic structure for the implementing class
    //it will have all the properties and functions without all the implementation (some default implementation)
    //signature - interface InterfaceName{
        //      abstract property
            //var test: String
        //      abstract methods
            //fun myAbsFun()
        //      default implementation of property and method (which can be overrriden)
            //fun hello(){
                //println("hello world")
            //}
        //}
    //in class you can't have any abstract methods or property
    //Think about the most necessary functions
    //The interface prevents key abstract properties and functions from not being implemented in the implementing class
    interface Vehicle{
        var wheel:Int
        fun start()
        fun stop()
        fun move(){
            println("Interface moving")
        }
        //fun getLocation()
    }

    class Car: Vehicle {
        override var wheel = 4
        override fun start(){
            println("inside start")
        }
        override fun stop(){
            println("inside stop")
        }
        //if function has a default implementation it will not complain
        //But you can still override it
        override fun move(){
            //super.move()
            //your code
            println("Class moving")
        }
    }