/*Scrivere un metodo Scala isSorted che, data una lista di interi,
verifica se è ordinata in modo non decrescente.
Suggerimento: usare il metodo sliding. Elaborare sia una
versione ricorsiva che non ricorsiva basata sui metodi 
funzionali sulle liste.*/

def isSorted(l:List[Int]):Boolean={
	l.sliding(2).forall(y=>y(0)<=y(1))
}

def isSorted2(l:List[Int]):Boolean={
	val l2=l.sorted
	if(l==l2) true
	else false
}

def isSortedRec(l:List[Int]):Boolean={
	def aux(ll:List[Int]):Boolean={
		if (ll.isEmpty || ll.size==1) true	
		else if (ll.head<=ll.drop(1).head){
			aux(ll.drop(1))
		}
		else false
	}
	aux(l)
}
