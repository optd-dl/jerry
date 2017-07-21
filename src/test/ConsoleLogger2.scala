package test

import test.chorus.Logger2

/**
  * Created by user on 2017/5/26.
  */
// 带有具体实现的接口
trait ConsoleLogger2 extends Logger2{
  def log(msg: String): Unit ={
    println("log: " + msg)
  }
}
