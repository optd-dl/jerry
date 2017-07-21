package test.chorus

/**
  * Created by user on 2017/5/26.
  */
// 特质 1
// 带有具体实现的接口
trait Logger1{
  def log(msg: String): Unit ={
    println("log: " + msg)
  }
}
