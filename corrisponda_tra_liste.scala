/*Scrivere una funzione corrisp[A,B](a:List[A], b:List[B], f:A=>B):Boolean 
che restituisce true se e solo se per ogni indice i comune a entrambe 
le liste vale b(i)=f(a(i)). Se una lista è più lunga dell’altra, gli elementi 
in eccedenza devono essere ignorati.*/

def corrisp[A,B](a:List[A], b:List[B], f:A=>B):Boolean={
	a.zip(b).forall(x=>x._2 == f(x._1))		
}




