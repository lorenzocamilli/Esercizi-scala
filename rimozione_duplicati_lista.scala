/*Scrivere un metodo Scala generico removeDuplicates[T](l:List[T]):List[T] 
che crea una nuova lista ottenuta da l rimuovendo gli elementi duplicati.*/


def removeDuplicates[T](l:List[T]):List[T]={
	l.distinct
}


