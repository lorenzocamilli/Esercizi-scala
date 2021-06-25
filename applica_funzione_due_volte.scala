/*Scrivere un metodo Scala applicaDueVolte che, dati come parametri una funzione f:Int=>Int e un intero x, calcola f(f(x)). Deve essere possibile eseguire questo programma:

*/

def applicaDueVolte(f:Int=>Int, x:Int):Int={
	return (f(f(x)))
}

//val y = E1.applicaDueVolte(x=>x+1, 10)
//println(y) // stampa 12
