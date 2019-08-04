import scala.io.StdIn.{readInt}


object task1
{
    def main(args: Array[String]): Unit = {

        print("Enter N:")
        var n = readInt()
        var array: Array[Int] = new Array[Int](n)
        for(i <- 0 until n)
        {
            print(s"Enter element - ${i+1}:")
            array(i) = readInt()
        }
        println("The frequency of all elements of an array :")
        for(i  <- 0 until n){
            println(s"${array(i)} occurs ${array.count(_ == array(i))}")
        }
    }
}
