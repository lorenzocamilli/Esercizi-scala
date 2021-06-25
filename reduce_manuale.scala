/*Scrivere un metodo Scala myReduce applicabile a liste
generiche che replica il funzionamento del metodo reduce,
restituendo però un Option che vale None se la lista e 
vuota, e Some(x) altrimenti, dove x è il risultato della 
riduzione. L’implementazione deve essere ricorsiva e non 
deve usare il metodo predefinito reduce o similari (fold ecc.),
né costrutti della programmazione imperativa (var, while, ecc.).*/
/*
def myReduce(f:(T,T)=>T):Option[T] = l match {
	case Nil    => None
	case h::Nil => Some(h)
	case h::t   => {
		def aux(q:List[T], acc:T):T =
			if (q.isEmpty) acc
			else aux(q.tail, f(acc, q.head))
		Some(aux(t, h))
	}
}
*/

def myReduce(f:(T,T)=>T):Option[T]={
	if(l==Nil) None
	else{
		def aux(l:List[T], i:T):Option[T]=l match{
			case Nil => None
			case (h1::Nil) => Some(h1)
			case (h1::t1) => aux(t1,f(i,h1))
		}
		aux(l,l.head)
	}
}


def myReduce3[T](l:List[T],f:(T,T)=>T)={
	def aux(l1:List[T], i:T):Option[T]={
		if (l1.isEmpty) None
		else{
			Some(l1.head)
			aux(l1.tail,f(l1.head,i))
		}
	}
	aux(l, l.head)
}

