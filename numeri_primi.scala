/*Fare in modo che sia disponibile un metodo su interi 
def isPrime:Boolean che verifica se il numero su cui 
viene invocato è primo. Usare il main di prova incluso 
nel codice dell’esercitazione scaricato.*/

case class Int2(n:Int) {
   def isPrime:Boolean={
		val l=List.range(2,(n/2)+1)
		l.forall(x=>n%x!=0)		
	}
	
	def isPrime:Boolean={
		val l=List.range(2,(n/2)+1)
		val check=l.exists(x=>n%x==0)
		!check
	}
	def isPrime:Boolean={
		val l=List.range(2,(n/2)+1)
		!l.exists(x=>n%x==0)
	}
		
	
}
object E3 {
    implicit def IntToInt2(i:Int)=Int2(i)
}
