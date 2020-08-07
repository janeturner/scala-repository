import java.io._
import scala.io.Source

object Main {

    def main(args: Array[String]): Unit = {

        println(sayHello)

        writeHello()

        readHello()
    }

    val file = "hello.txt"
    val sayHello = "Hello World"

    def writeHello() = {
        val pw = new PrintWriter(new File(file))
        pw.write(sayHello)
        pw.close
    }

    def readHello() = {
        for (line <- Source.fromFile(file).getLines) {
            println(line)
        }
    }
}
