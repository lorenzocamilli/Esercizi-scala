/*Il cifrario di Cesare è un antico algoritmo di cifratura 
che consente nel sostituire ciascuna lettera con la corrispondente
lettera a una certa distanza prefissata k>=0 nell’alfabeto. 
Ad esempio, la cifratura a distanza k = 1 di "zorro" è "apssp". 
Più precisamente, la funzione di codifica a distanza k del codice 
ASCII c di un carattere minuscolo dell’alfabeto inglese (26 caratteri)
è f(c, k) = 'a' + (c - 'a' + k) MOD 26.
Definire un metodo Scala def rot(k:Int):String applicabile su stringhe 
che applica il cifrario di Cesare a distanza k, lasciando invariati i 
caratteri non alfabetici. Ad esempio, "zero uno due...".rot(1) deve 
restituire "afsp vop evf...". 
Suggerimento: usare il metodo map applicato alle stringhe, in cui è
possibile “sostituire” un carattere con un altro. Le operazioni aritmetiche
su caratteri lavorano sui loro codici ASCII convertiti a Int. Per riportare
i codici ASCII così manipolati di nuovo a carattere si usi toChar.*/

import scala.language.implicitConversions

class MyString(s:String) {
    def rot(k:Int):String = {
        def f(c:Char):Char = {
            val m = 'Z' - 'A' + 1 // dimensione dell'alfabeto
            if (c >= 'A' && c <= 'Z') ('A' + (k + c - 'A') % m).toChar
            else if (c >= 'a' && c <= 'z') ('a' + (k + c - 'a') % m).toChar
            else c
        }
        s.map(f)
    }
}

object E28 {
    implicit def string2MyString(s:String) = new MyString(s)
}
