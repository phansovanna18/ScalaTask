import scala.io.StdIn.readInt


object task3 {
    def main(args: Array[String]): Unit = {
        print("Input the size of array : ")
        var size = readInt()
        var array = new Array[Int](size)
        for(i<- 0 until size){
            print("Input the element in array:")
            array(i) =  readInt()
        }
        print("Input the position where to delete:")
        var remove_position = readInt()
        array = array.filter(_ != array(remove_position))
        for(i<- array)
            println(i)
    }

}
