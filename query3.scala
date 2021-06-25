/*Completare il seguente frammento di programma Scala:

case class Studente(nome:String, età:Int, esami:List[String])
val q = List(
                 Studente("Marco",   23, List("PFP","SC")), 
                 Studente("Laura",   19, List("SC", "FI1", "PFP")), 
                 Studente("Stefano", 23, List("SC", "FI1")), 
                 Studente("Marco",   25, List("SC", "FI1", "FI2")), 
                 Studente("Paola",   22, List("SC", "PFP"))
            )

val query1 = // estrarre tutti gli studenti con età compresa tra 20 e 24 anni (inclusi) che hanno sostenuto l'esame di "PFP"
// stampare i dati degli studenti in query1

val query2 = // estrarre tutti gli studenti con età strettamente inferiore a 24 anni che hanno sostenuto almeno due esami
// stampare i dati degli studenti in query2
//Provare diverse soluzioni usando:

for comprehension (for ... yield)
metodi delle liste
*/

case class Studente(nome:String, età:Int, esami:List[String])
val q = List(
                 Studente("Marco",   23, List("PFP","SC")), 
                 Studente("Laura",   19, List("SC", "FI1", "PFP")), 
                 Studente("Stefano", 23, List("SC", "FI1")), 
                 Studente("Marco",   25, List("SC", "FI1", "FI2")), 
                 Studente("Paola",   22, List("SC", "PFP"))
            )
println("\n")
val query1 = q.filter(i=>i.età>=20 && i.età<=24).filter(y=>y.esami.contains("PFP")).map(x=>x.nome)


// estrarre tutti gli studenti con età compresa tra 20 e 24 anni (inclusi) che hanno sostenuto l'esame di "PFP"
// stampare i dati degli studenti in query1
println("\n")
val query2 =q.filter(i=>i.età<24).filter(y=>y.esami.size>=2).map(x=>x.nome)


/*// estrarre tutti gli studenti con età strettamente inferiore a 24 anni che hanno sostenuto almeno due esami
// stampare i dati degli studenti in query2
*/
