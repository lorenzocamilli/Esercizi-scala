/*Si scriva un metodo Scala def piùFrequente[T](l:Seq[T]):Option[(T,Int)] 
che, data una sequenza di elementi generici, restituisce un Option che 
contiene una coppia (x,n), dove x è l’elemento più frequente ed n il suo
numero di occorrenze nella sequenza, e None se la sequenza di input è vuota.*/

def piùFrequente[T](l:Seq[T]):Option[(T,Int)]={

	val (x,l) = s.groupBy(identity).maxBy(_._2.size)
	(x,l.size)

}
