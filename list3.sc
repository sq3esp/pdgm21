def reverse[A](xs: List[A]): List[A] =
  def reverseRec[A](xs: List[A], x: List[A]): List[A] =
    if xs == List() then x
      else reverseRec(xs.tail, xs.head::x)
  reverseRec(xs,List());;

//Zadanie 1

def splitNumbers(xs: List[Int]): (List[Int],List[Int]) =
  def splitNumbersRec(xs: List[Int], x: List[Int], y: List[Int]): (List[Int],List[Int]) =
    if xs == List() then (x, y)
    else if xs.head<0 then splitNumbersRec(xs.tail, xs.head::x, y)
    else if xs.head>0 && xs.head % 2 == 1 then splitNumbersRec(xs.tail, x, xs.head::y)
    else splitNumbersRec(xs.tail, x, y)
  splitNumbersRec(reverse(xs), List(), List())



//Zadanie 2

def lenght [A](xs: List[A]): Int=
  def lenghtRec[A](xs: List[A], x: Int): Int=
    if xs == List() then x
    else lenghtRec(xs.tail, x+1)
  lenghtRec(xs, 0)



//Zadanie 3

def joinLists[A](xs1: List[A], xs2: List[A]) : List[A] =
  (xs1, xs2) match
    case (h1 :: t1, h2 :: t2) => h1 :: h2 :: joinLists(t1, t2)
    case (_, Nil) => xs1
    case (Nil, _) => xs2
    case _ => Nil
