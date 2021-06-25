/*Scrivere un metodo Scala def isRot(m:Seq[T]):Option[Int] 
applicabile su un oggetto l di tipo Seq che restituisce Some(n),
se m è ottenibile ruotando l di n posizioni in avanti, e None altrimenti. */


import scala.language.implicitConversions

class MySeq[T](l:Seq[T]) {
    def isRot(m:Seq[T]):Option[Int] = {
        val res = for {
            i <- 0 until m.size
            (a,b) = m splitAt i
            if (l == b ++ a)
        } yield i
        if (res.isEmpty) None else Some(res.head)
    }
}

object IsRot {
    implicit def seq2MySeq[T](l:Seq[T]) = new MySeq(l)
}
