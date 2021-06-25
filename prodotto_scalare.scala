/*Scrivere un metodo scalarProd che, date due vettori rappresentati
come sequenze di Double, ne calcola il prodotto scalare. Se i vettori
hanno lunghezze diverse, limitare il prodotto scalare al range di 
indici validi comuni. Ad esempio: scalarProd(Seq(3,4), Seq(2,9,1)) == 3*2 + 4*9 == 42.*/

    def scalarProd(a:Seq[Double], b:Seq[Double]):Double = (a zip b).foldLeft(0.0)((x, y) => x + y._1*y._2)
    
    def scalarProd2(s:Seq[Double], t:Seq[Double]):Double = {
		def aux(l:Seq[(Double,Double)]):Double = {
			if (l.isEmpty) 0.0
			else l.head._1*l.head._2 + aux(l.tail)
		}
		aux(s zip t)
	}

