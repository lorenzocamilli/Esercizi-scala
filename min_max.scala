/*Scrivere un metodo Scala ricorsivo minMax 
che, data una lista non vuota di interi, 
restituisce una coppia (min,max), dove min e max
sono il minimo e il massimo elemento della lista,
rispettivamente. Nota: data una coppia t=(a,b), 
t._1 è il primo elemento, t._2 è il secondo elemento.

Scrivere inoltre una variante non ricorsiva basata
sui metodi standard della classe List visti a lezione*/

def minMaxRic(l:List[Int])={
	def aux(l2:List[Int],min:Int,max:Int):(Int,Int)={
		if (l2.isEmpty) (min,max)
		else if (l2.head < min) aux(l2.tail,l2.head,max)
		else if (l2.head > max) aux(l2.tail,min,l2.head)
		else aux(l2.tail,min,max)
		}
		aux(l,l(0),l(0))
}



def minMaxNonRic(l:List[Int])={
	(l.min, l.max)
}
