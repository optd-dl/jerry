package test.chorus

import test.ConsoleLogger

/**
  * Created by user on 2017/5/26.
  */
// 带有特质的对象
class MyAccount extends Account with ConsoleLogger{
  def save(): Unit ={
    log("100")
  }
}
