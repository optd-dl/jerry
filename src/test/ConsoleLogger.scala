package test

/**
  * Created by user on 2017/5/26.
  */
// 特质 3
trait ConsoleLogger {
  def log(msg: String): Unit ={
    println("save money: " + msg)
  }
}
