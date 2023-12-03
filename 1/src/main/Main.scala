package aoc1

import java.io.File
import scala.io.Source

object Main:

  val filePath = "../src/main/resources/input.txt"
//  val path = new File(".").getCanonicalPath

  @main def main(): Unit =
    var sum = 0
    for (line <- Source.fromFile(filePath).getLines) {
      var str = line
      str = str.filter(!_.isLetter)
      str = str.head.toString + str.reverse.head.toString
      sum += str.toInt
    }
    println(sum)
