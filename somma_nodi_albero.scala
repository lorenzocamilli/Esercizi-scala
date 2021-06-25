/*Scrivere un metodo Scala sum che, dato un albero binario con 
elementi interi, restituisca la somma degli elementi dell’albero. 
Completare il seguente frammento di codice:*/

sealed abstract class BinTree {
    def sum:Int = this match {
    case T(l,e,r) => e+l.sum+r.sum
    case E() => 0
    }
}

// albero non vuoto
case class T(l:BinTree, e:Int, r:BinTree) extends BinTree 

// albero vuoto
case class E() extends BinTree
