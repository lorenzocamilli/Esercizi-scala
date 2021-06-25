/*Scrivere un metodo Scala def inter[T](a:List[T], b:List[T]):List[T] 
che calcola l’intersezione delle liste a e b in tempo O(na+nb), dove
na e nb sono le lunghezze delle rispettive liste.

Suggerimento: usare il metodo toSet per convertire liste in Set. I
set forniscono il test di appartenenza alla collezione (contains) in
tempo O(1) (in media) usando di default un HashSet.

Si riporta un main di prova e una versione inefficiente che usa
tempo O(na*nb). Compilare il codice insieme al modulo Prof.scala che
fornisce il costrutto profila per la misurazione dei tempi.*/

def inter[T](a:List[T], b:List[T]):List[T]={
	a.toSet.filter(x=>b.toSet.contains(x)).toList
}
