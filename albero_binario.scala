/*Si vuole verificare la proprietà di un albero binario che 
l’elemento contenuto in ogni suo nodo v sia maggiore o uguale 
all’elemento nella radice del sottoalbero sinistro di v (se non 
vuoto) e minore o uguale all’elemento nella radice del sottoalbero
destro di v (se non vuoto). Scrivere un metodo treeTest che, dato 
un albero binario con elementi interi, restituisce true se l’albero 
soddisfa la proprietà, e false altrimenti.*/

sealed abstract class Tree {
    def treeTest : Boolean= this match{
		case E() => true
		case T(l,e,r) => (l,r) match{
       case (E(), E()) => true
		case (E(), T(rl, re, rr)) => if(e <= re) r.treeTest else false
		case (T(ll, le, lr), E()) => if(e >= le) true && l.treeTest else false
		case (T(ll, le, lr), T(rl, re, rr)) => if(e >= le && e <= re) l.treeTest && r.treeTest else false
		case _ => false
		}
	}
}

// albero non vuoto
case class T(l:Tree, e:Int, r:Tree) extends Tree 

// albero vuoto
case class E() extends Tree
