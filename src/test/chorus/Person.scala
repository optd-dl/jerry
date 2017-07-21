package test.chorus

/**
  * Created by jiangzl on 2016/10/11.
  */

// 1. 声明类 和 getter／setter 方法
class Person {
  // name为变量，不设置初始值  _ 代表前面的name变量
  // var 会生成 getter和setter 方法
  var name: String = _
  // age为常量，不可变
  // val 只会生成 getter方法
  val age = 10
  // private 私有变量，只能在class内部使用
  private[this] val gender = "male"
}
