package org.lsug

/**
 * User: Rustem Suniev
 * Date: 19/02/2011
 * Time: 21:00
 * Email: rustem.suniev@gmail.com
 */

object Converter{
  def convert(i:Int) =
    repeatTimes((i/1000),"M") ++
    repeatTimesSingle(((i/100) % 10),"C","D","M")++
    repeatTimesSingle(((i/10) % 10),"X","L","C") ++
    repeatTimesSingle((i%10),"I","V","X")

  val repeatTimes = (times:Int,symbol:String) => Stream.continually(symbol).take(times).mkString
  val repeatTimesSingle = (times:Int,a:String,b:String,c:String) => times match {
    case x if x<=0 => ""
    case x if x<=3 => repeatTimes(x,a)
    case x if x<=4 => a ++ b
    case x if x<=8 => b ++ repeatTimes(times-5,a)
    case x if x<=9 => a ++ c
    case _ => "Wrong number"
  }
}