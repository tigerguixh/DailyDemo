package tiger.com.lp.dailydemo.kotlin

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/5/27
 * @Description :
 */
interface MyInterImpl{
    fun bar()
    fun foo() {

    }
}

class InterImpl : MyInterImpl {
    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun foo() {
        super.foo()

        var ss = 1
    }
}

interface MyInterface {
    val prop: Int // 抽象的

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        println("$propertyWithImplementation" + prop)
    }
}

class Child : MyInterface {
    override val prop: Int = 29
    var bar : Int = 3
    private set
}

interface Named{
    val name : String
}

interface Person : Named {
    val firstName : String
    val secondName : String

    override val name: String
        get() = "$firstName $secondName"
}

class Employee(override val firstName: String,
               override val secondName: String,
               var age : Int) : Person {
    fun printMessage() {
        print("$name and age: $age")
    }

    fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // “this”对应该列表
        this[index1] = this[index2]
        this[index2] = tmp
    }
}

fun main(args : Array<String>) {
    var child = Child()
    child.foo()

    val employee = Employee("Tiger", "Gui", 29)
    employee.printMessage()

    val l = mutableListOf(1, 2, 3)
}