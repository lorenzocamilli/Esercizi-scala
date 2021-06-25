/*Scrivere un metodo Scala filterByIndex (ricorsivo o meno) che
data una lista generica e un predicato su indici, restituisce la 
sottolista ottenuta prendendo solo gli elementi il cui indice 
soddisfa il predicato dato.

Esempio di uso:
filterByIndex(List("zero", "uno", "due", "tre"), i=>i%2==0) 
// prende solo gli elementi di indice pari*/

def filterByIndex[T](l:List[T],p:Int=>Boolean)={
	l.zipWithIndex.filter(x=>p(x._2)).map(y=>y._1)	
}
