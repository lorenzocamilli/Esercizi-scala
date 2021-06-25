/*Scrivere una funzione maxPrefisso(l:List[Int], x:Int):Int 
Scala che restituisce il più grande numero n tale che la 
somma dei primi n numeri di l è minore o uguale a x. Ad esempio, 
maxPrefisso(List(1,1,1,1,1),3) == 3, maxPrefisso(List(5,2,4,7),8)==2 e 
maxPrefisso(List(5,2,4,7),4)==0.*/

def maxPrefisso(l:List[Int], x:Int):Int={
	@scala.annotation.tailrec
	def aux (l1:List[Int], s:Int, i:Int): Int ={
		if (l1.isEmpty || s+l1.head>x) i
		else aux(l1.tail, s+l1.head, i+1)	
	}
	aux(l, 0, 0)
}

