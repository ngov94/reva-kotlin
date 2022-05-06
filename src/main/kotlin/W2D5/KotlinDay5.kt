package W2D5

//Topics today:
    //Interfaces - also multiple interfaces
    //Abstract Class
    //Data Class
    //Sealed Class
    //Kotlin Objects
    //Nested and Inner Classes

fun main(){
    //Interfaces
    var c1 = Car()
    c1.start()
    c1.move()
    println(c1.name)

    println()

    //Multiple Interfaces
    var myNewObj = S()
    myNewObj.testB()
    myNewObj.testA()
    myNewObj.hello()
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
    //Class won't complain if the interface contains defaults
    //Think about the most necessary functions
    //The interface prevents key abstract properties and functions from not being implemented in the implementing class
    interface Vehicle{
        var wheel:Int

        //should be a val when using the get()
        val name:String
            get() = "Tesla"
        fun start()
        fun stop()
        //can have default implementation of properties and functions
        //these don't need to be written in the implementing class as the
        //default implementation is there
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

//Multiple Interface
    //class : interface -yes works
    //interface1 : interface2 - yes works
    //interface : class - no does not work
    //class: interface1, interface2 - yes works

    interface A {
        fun testA(){
            println("I am testA")
        }
        //ambiguous function
        fun hello(){
            println("Hello from A")
        }
    }

    interface B {
        fun testB(){
            println("I am testB")
        }
        //ambiguous function
        fun hello(){
            println("Hello from B")
        }
    }

    class S: A,B{
        override fun testA() {
            super.testA()
            println("Inside class S")
        }
        //both interfaces have hello fun, so causes ambiguity
        //class S does not know which one to call
        //so need to make that clear in this class by overriding it
        override fun hello() {
            //can have only 1 or both super functions and can also have a class implementation
            super<A>.hello() //angular brackets used for data type
            super<B>.hello()
            //class implementation
            println("Hello from class S")

        }
    }