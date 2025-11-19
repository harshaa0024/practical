import scala.io.StdIn._
object det{
    def main(args: Array[String])={
        val mat1=Array(Array(4,1),Array(3,2))
        val mat2=Array(Array(1,2,0),Array(5,1,0),Array(3,2,1))

        val A=mat2(0)(0)
        val B=mat2(0)(1)
        val C=mat2(0)(2)
        val D=mat2(1)(0)
        val E=mat2(1)(1)
        val F=mat2(1)(2)
        val G=mat2(2)(0)
        val H=mat2(2)(1)
        val I=mat2(2)(2)

        val a= mat1(0)(0)
        val b= mat1(0)(1)
        val c= mat1(1)(0)
        val d= mat1(1)(1)

        val det=(a*d)-(b*c)
        val det1=A*(E*I-F*H)-B*(D*I-F*G)+C*(D*H-E*G)

        
        println("Determinant of 2X2 matrix is : "+det)
         println("Determinant of 3X3 matrix is : "+det1)
    }
}