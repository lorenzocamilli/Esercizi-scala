/*Scrivere un metodo Scala ricorsivo equal che verifica 
se due liste di interi sono uguali (uguaglianza profonda).
Suggerimento: usare head, tail e isEmpty*/

def equal(l1:List[Int],l2:List[Int])={
	@scala.annotation.tailrec
	def aux(l:List[Int],ll:List[Int]):Boolean={
		if(l.isEmpty && ll.isEmpty) true
		else if (l.head==ll.head) 
			//aux(l.drop(1),ll.drop(1))
			aux(l.tail,ll.tail)
		else false
	}
	aux(l1,l2)
}


@scala.annotation.tailrec
def equal2(l1:List[Int],l2:List[Int]):Boolean={
	if(l1.isEmpty && l2.isEmpty) true
	else if (l1.head==l2.head) 
		//equal2(l1.drop(1),l2.drop(1))
		equal2(l1.tail,l2.tail)
	else false
}

