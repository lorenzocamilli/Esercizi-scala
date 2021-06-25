/*Scrivere un metodo Scala max che, data una lista 
di stringhe, restituisce la lunghezza della stringa 
più lunga.
Suggerimento: usare map e reduce*/

def maxSize(l:List[String])={
	l.map(x=>(x.size)).reduce((x,y)=> if(x>y) x else y)
}
