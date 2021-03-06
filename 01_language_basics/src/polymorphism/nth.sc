package polymorphism
import polymorphism._

object nth {
  val x = 1                                       //> x  : Int = 1
  def nth[T](n: Int, xs: List[T]): T =
    if( xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)                      //> nth: [T](n: Int, xs: polymorphism.List[T])T

	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : polymorphism.Cons[Int] = polymorphism.Cons@2752f6e2
	nth(2, list)                              //> res0: Int = 3
	//uncomment to see exception
	//nth(4, list)
}