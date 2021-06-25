/*Se esistesse un premio Ignobel per l’informatica, questo
si piazzerebbe bene. Scrivere un metodo noobSort che, dato 
un Vector v di n elementi di tipo generico, restituisce la 
versione ordinata di v. Per risolvere il problema, generare 
tutte le permutazioni degli indici da 0 a n-1 e per ciascuna 
permutazione generare il vettore permutato, verificare se è 
ordinato ed eventualmente restituirlo.*/


def noobSort[T](v:Vector[T])(implicit cmp:T=>Ordered[T]) ={
    v.permutations.find(x => x == x.sorted) .get
}

