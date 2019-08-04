import scala.io.StdIn.{readInt}


object task2 {
    def main(args: Array[String]): Unit = {
        var array: Array[Int] = Array(1,2,3,4,5,6,7,8,9,10)
        for(i<-array)
            println(i)
        print("Enter number of element:")
        var n = readInt()
        var array1 = new Array[Int](n)
        for(i<- 0 until array.size)
            array1(i) = array(i)

        for(i<-array.size until n) {
            print("Enter number")
            array1(i) = readInt()
        }
        for(i<- array1)
            println(i)
    }
}
