/*Un semplice algoritmo iterativo basato sul metodo di 
Newton per calcolare la radice quadrata di un numero x 
consiste nel partire da una stima iniziale y (es. y=1) e
raffinarla successivamente calcolando la media tra y e x/y. 
Il procedimento termina quando il quadrato della stima è 
sufficientemente vicino a x(es. inferiore a 0.01). Completare
la seguente definizione Scala usando un approccio ricorsivo:

def sqrt(x:Double) = {
   // completare...
}
println("Radice quadrata di 2 ~ "+sqrt(2))
Suggerimento: scomporre sempre un problema in funzioni
più semplici. Questo non peggiora in pratica le prestazioni 
poiché il compilatore effettua inlining automaticamente, ma 
migliora molto la leggibilità, l’analisi di correttezza e la 
manutenibilità del codice. Definire funzioni annidate (es. per il
calcolo del valore assoluto, ecc.).*/

def sqrt(x:Double)={
	def avg(y:Int):Double={
		val media=(y*y+x)/(2*y)
		if(abs(y*y -x) <0.01) y
		else media
	}
	def abs(x:Double):Double={
		if(x<0) - x
		else x
	}
	avg(1)
}
println("Radice quadrata di 2: "+sqrt(x))
