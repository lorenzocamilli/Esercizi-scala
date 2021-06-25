//Scrivere un metodo Scala che verifica se un numero è primo.


def isPrime(n:Int):Boolean={
	if (n==1) false
	else{
		! List.range(2,n).exists(x => n % x == 0)
	}
}
