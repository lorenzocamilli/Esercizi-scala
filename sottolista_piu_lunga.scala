/*Scrivere un metodo Scala longestSublist[T](p:T=>Boolean)(l:List[T]) 
che, dato un predicato p e una lista l, restituisce la più lunga 
sottolista di elementi consecutivi di l che soddisfano il predicato p. 
Se la soluzione non è unica, restituirne una qualsiasi. Ad esempio, 
longestSublist((_:Int)>0)(List(-4,5,3,6,0,3,4,-1)) deve restituire 
List(5,3,6), che è la sottolista di elementi consecutivi positivi più lunga.

Suggerimento: usare il metodo foldLeft, consultando la documentazione 
della classe List.*/

def longestSublist[T](p:T=>Boolean)(l:List[T])={
	def aux(tmp:List[T],curr:List[T],sub:List[T], lung:Int):List[T]={
		if(lung==tmp.length-1) sub
		else if(p(tmp(lung))){
			aux(tmp,curr:+tmp(lung),sub,lung+1)
		}
		else{
			if(curr.length>sub.length) 			aux(tmp,List(),curr,lung+1)
			else aux(tmp,List(),sub,lung+1)
			}
		}
		aux(l,List(),List(),0)
}
