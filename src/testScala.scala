/**
  * Created by user on 2017/5/25.
  */
object testScala {
  def main(args: Array[String]) {

    val chars = "asdfghjkl"

    // 考虑下面这个改自于while循环例子，它使用了var并因此属于 指令式风格：
    println("循环1：")
    // var (i, j) = (0, 10)  多变量赋值
    var i = 0
    while (i < chars.length) {
      println(chars(i))
      i += 1
    }

    /*
    val chars = "asdfghjkl"

    // 考虑下面这个改自于while循环例子，它使用了var并因此属于 指令式风格：
    println("循环1：")
    // var (i, j) = (0, 10)  多变量赋值
    var i = 0
    while (i < chars.length) {
      println(chars(i))
      i += 1
    }


    // 你可以通过去掉var的办法把这个代码变得更 函数式风格，例如，像这样
    println("循环2：")
    for (char <- chars) {
      println(char)
    }


    println("循环3：")
    // 1 to 10   表示  1.to(10)
    for (num <- 1 to 10 if num % 2 == 0) {
      println(num)
    }


    println("循环4：")
    chars.foreach(println)



    val x = 0
    val a = if (x > 0) 1 else 0
    val b = if (x > 0) 0 else 8
    println(a)
    println(b)


    // 使用情况，例如婚庆网站： 男／女 性别这些信息赋值后，就不应该修改。
    var gender = "男"
    println("性别:", gender)
    // println("性别:" + gender)
    gender = "女"
    println(s"性别:$gender")
    // gender = "女"

    val name = "ApacheCN"

    funApacheCN_1(name)


    println("fun2: " + funApacheCN_2(name))


    println("fun3:" + funApacheCN_3(2, 3))


    println("fun4_1:" + funApacheCN_4_1(12)(13))
    var tmp_4_2 = funApacheCN_4_2(22)
    //tmp_4_2 = funApacheCN_4_2(27)
    println("fun4_2:" + tmp_4_2(23))


    funApacheCN_5(name)
    println()


    println("fun6: " + funApacheCN_6())

    */
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


  // function_3: 匿名函数
  def funApacheCN_3 = (x: Int, y: Int) => x + y


  // function_4: 柯里化函数 （不加返回值类型，显得很装逼）
  // 此方法  **不是** 柯里化函数， 而是将函数顺序调用，一共2遍
  def funApacheCN_4_1(x: Int)(y: Int) = x + y

  // 此方法  **是** 柯里化函数， 可以回忆一下闭包。
  def funApacheCN_4_2(x: Int) = (y: Int) => x + y


  // function_5: foreach
  def funApacheCN_5(name: String*) = {
    name.foreach(x => print(x))
  }


  // function_6: 设置name的默认值
  def funApacheCN_6(name: String = "ApacheCN"): String = {
    return "hello: " + name
  }

}
