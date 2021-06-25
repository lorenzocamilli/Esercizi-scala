/*Scrivere un metodo isAnagramOf(a:String, b:String):Boolean
che verifica se a è un anagramma di b, cioè a può essere ottenuto
come permutazione delle lettere di b. Il test deve essere case 
sensitive*/

def isAnagramOf(a:String, b:String): Boolean = {
	if(a.sorted==b.sorted) true
	else false
}

