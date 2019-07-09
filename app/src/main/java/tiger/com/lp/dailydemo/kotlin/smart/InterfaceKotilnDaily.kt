package tiger.com.lp.dailydemo.kotlin.smart

/**
 * @author : Xunhu.gui
 * @Email : xunhu.gui@tadu.com
 * @date : 2019/7/2
 * @Description :
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface ClickListener {
    fun click()
    fun showOff() = println("I'm clickable!")
}

abstract class Listener {
    abstract fun open()
}

class Button : Listener(), Clickable, ClickListener {
    override fun open() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<ClickListener>.showOff()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}