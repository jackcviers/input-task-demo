@main def hello(args: String*): Unit = 
  println("Hello world!")
  println(msg(args.toList))

def msg(args: List[String]) = s"I was compiled by Scala 3. Here are my args: ${args}:)"
