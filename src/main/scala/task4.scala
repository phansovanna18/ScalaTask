import scala.io.StdIn.readInt


object task4 {
    def main(args: Array[String]): Unit = {
        print("Input the size of array : ")
        var size = readInt()
        var array = new Array[Int](size)
        for(i<- 0 until size){
            print(s"Input element - $i : ")
            array(i) = readInt()
        }
        array = array.sortWith(_<_)
        var max = array(array.size-2)
        print(s"The Second largest element in the array is : $max")
    }
}
