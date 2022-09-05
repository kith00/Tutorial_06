object Q1 extends App{

  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val Encrypt=(letter:Char,key:Int,sub:String)=> sub((sub.indexOf(letter.toUpper)+key)%sub.size)

  val Decrypt=(letter:Char,key:Int,sub:String)=> sub((sub.indexOf(letter.toUpper)-key)%sub.size)


  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))

  val encrypted=cipher(Encrypt,"kithsandu",5,alphabet)

  val decrypted=cipher(Decrypt,encrypted,5,alphabet)

  println(encrypted)
  println(decrypted)

}
