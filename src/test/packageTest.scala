package test

import test.chorus.Person

/**
  * Created by user on 2017/5/26.
  */
object packageTest {
  def main(args: Array[String]) {

    val p = new Person //括号可省略
    p.name = "Jack"
    println(p.name + ": " + p.age)


    val p2 = new Person2("Jack", 20)
    println(p2.name + ":" + p2.age)


    val p3 = new Person2("Jack", 20, "male")
    println(p3.name + ":" + p3.age + ":" + p3.gender)


    val s = new Student("Jack", 20, "male")
    // 加载顺序： 先加载 父类，然后加载 子类
    println(s.name + ":" + s.age + ":" + s.major + ":" + s.school)

    val s3 = new Student3
    s3.spark

    println(s3.name + ":" + s3.age)


  }

}
