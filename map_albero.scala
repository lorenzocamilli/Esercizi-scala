/*Scrivere un metodo Scala map su alberi binari con 
elementi interi che, data una funzione f:Int=>Int, 
restituisca un nuovo albero ottenuto da quello di partenza
applicando la funzione f a ogni elemento presente nei 
nodi dell’albero. Completare il seguente frammento di codice*/

sealed abstract class BinTree {
    def map(f:Int=>Int):BinTree =   this match {
		case E() => E()
        case T(l,e,r) => T(l.map(f),f(e),r.map(f))
	}        
}

// albero non vuoto
case class T(l:BinTree, e:Int, r:BinTree) extends BinTree 

// albero vuoto
case class E() extends BinTree
