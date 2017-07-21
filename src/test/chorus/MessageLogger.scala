package test.chorus

import test.ConsoleLogger

/**
  * Created by user on 2017/5/26.
  */
trait MessageLogger extends ConsoleLogger{
  override def log(msg: String): Unit ={
    println("save money to bank: " + msg)
  }
}
