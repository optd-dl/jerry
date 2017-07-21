package test.chorus
import test.Person2
/**
  * Created by user on 2017/5/26.
  */
class Student(name: String, age: Int, val major: String) extends Person2(name, age) {
  println("this is the subclass of Person, major is: " + major)

  override val school: String = "Bzz"

  // 子类覆盖父类的方法/变量 一定要用： override
  override def toString = "Override toString ..."
}
