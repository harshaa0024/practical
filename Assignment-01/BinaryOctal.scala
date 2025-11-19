import scala.io.StdIn._
object binaryoctal{
    def main(args: Array[String])= {
        print("Enter a number to convert it into binary and octal : ")
        var n = readInt()
        println("Octal form is : ")
        Octal(n)
        println("\n\nBinary form is : ")
        Binary(n)
    }
    def Binary(n:Int): Unit={
        var n1=n
        var A=Array.ofDim[Int](10)
        var i=0
         while(n1!=0){
            A(i)=n1%2
            n1=n1/2
            i=i+1
        }
        var j=i-1
        while(j>=0)
        {
            print(A(j))
            j=j-1
        }
    }    
    def Octal(n:Int): Unit={
        var n1=n
        var A=Array.ofDim[Int](10)
        var i=0
         while(n1!=0){
            A(i)=n1%8
            n1=n1/8
            i=i+1
        }
        var j=i-1
        while(j>=0)
        {
            print(A(j))
            j=j-1
        }
    }  
}