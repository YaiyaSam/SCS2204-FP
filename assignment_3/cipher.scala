object cipher extends App{

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E = (c: Char, key: Int, a: String) => a((a.size + a.indexOf(c.toUpper) + key) % a.size)
  val D = (c: Char, key: Int, a: String) => a((a.size + a.indexOf(c.toUpper) - key) % a.size)

  val cipher = (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) => s.map(algo(_, key, a))

  val ct = cipher(E, "scala", 5, alphabet)
  println(ct)
  val pt = cipher(D, ct, 5, alphabet)
  println(pt)

}
