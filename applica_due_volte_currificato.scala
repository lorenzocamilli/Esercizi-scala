/*Modificare il metodo applicaDueVolte dell’esercizio 1 
usando la tecnica della currificazione in modo che sia 
parzialmente applicabile.*/

def applicaDueVolte(f:Int=>Int)(x:Int):Int={
	return(f(f(x)))
}


/*
val incrementaDueVolte = E1.applicaDueVolte(x=>x+1) _
val y = incrementaDueVolte(10)
println(y) // stampa 12
*/
