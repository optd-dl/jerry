/**
  * Created by user on 2017/6/12. feature3
  */
object lw_test {

  def main(args: Array[String]) {

    val x = 0
    val a = if (x>0) 1 else 0
    println(a)


    funApacheCN_1("jerry")

    println("function_2:" + funApacheCN_2("jerry"))

    println("function_3:" + funApacheCN_3(1,3))


    println("function_4:" + funApacheCN_4_2(4)(5))

    println("function_6:" + funApacheCN_6())
  }


  // function_1: 无返回值
  def funApacheCN_1(name: String): Unit = {
    println("hello: " + name)
  }


  // function_2: 有返回值
  def funApacheCN_2(name: String): String = {
    // return 可省略（默认返回最后一行）
    // "hello: " + name
    return ("hello: " + name)
  }

  //function_3:匿名函数
  def funApacheCN_3 = (x: Int, y: Int) => x + y

  // function_4: 柯里化函数 （不加返回值类型，显得很装逼）
  // 此方法  **不是** 柯里化函数， 而是将函数顺序调用，一共2遍
  def funApacheCN_4_1(x: Int)(y: Int) = x + y
  // 此方法  **是** 柯里化函数， 可以回忆一下闭包。
  def funApacheCN_4_2(x: Int) = (y: Int) => x + y


  // function_6: 设置name的默认值
  def funApacheCN_6(name: String = "ApacheCN"): String = {
    return "hello: " + name
  }

}
