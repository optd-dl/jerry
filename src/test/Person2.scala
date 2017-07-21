package test

/**
  * Created by user on 2017/5/26.
  */
// 2. 构造函数（ primary constructor & auxiliary constructor）
// 主构造方法  &  附属构造器
/*
1. 主构造器直接跟在类名后面， 主构造器中国年的参数，最后会被编译成字段
2. 主构造器执行的时候， 会执行类中的所有语句
3. 假设参数声明的时候不带val和var, name就相当于 private[this], 只能在class内部调用 !!!
*/
class Person2(var name: String, val age: Int) {
  // primary 初级的 constructor 构造器
  println("this is the primary constructor!")

  var gender: String = _
  val school: String = "ZJU"

  /*
  * 1. 附属构造器名称为this
  * 2. 每一个附属构造器必须首先调用已经存在的子构造器和附属构造器
  */
  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}
