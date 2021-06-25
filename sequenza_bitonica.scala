/*Una sequenza bitonica è formata da una sequenza non 
vuota strettamente crescente seguita da una sequenza non
vuota strettamente decrescente, ad esempio: List(1,2,5,6,9,4,3,2,0) 
è bitonica, mentre List(1,2,3,2,3,2,1), List(1,2,3) e List() non lo 
sono.

Scrivere una funzione checkBitonic(l:List[Int]):(List[Int],List[Int]) 
che, data una lista l bitonica, restituisce (inc,dec) tale che inc è
il prefisso crescente di l che include l’elemento massimo e dec è il 
suffisso strettamente decrescente che segue (si ha che inc ::: dec == l). 
Se invece l non è bitonica, la funzione restituisce (Nil,Nil).*/

def checkBitonic(l:List[Int]):(List[Int], List[Int]) = {
    val m = Int.MinValue
    val maxTriple =
        ((m::l):+m).zipWithIndex.sliding(3,1).toList.
             filter(t=>t(0)._1 < t(1)._1 && t(1)._1 > t(2)._1)
    if (maxTriple.length != 1) (Nil,Nil)
    else {
        val s:Int = maxTriple.head(1)._2
        (l.take(s),l.drop(s))
    }
}


