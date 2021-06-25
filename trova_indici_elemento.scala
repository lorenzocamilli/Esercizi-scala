/*Scrivere un metodo Scala findIndices che, data una l
ista generica l e un elemento x, restituisce una lista 
che contiene gli indici i tali che l(i)==x. 
Se la lista non contiene x, il metodo restituisce 
 lista vuota*/

def findIndices[T](l:List[T], x:T)={
	l.zipWithIndex.filter(y=>y._1==x).map(h=>h._2)
}
