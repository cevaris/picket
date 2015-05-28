package com.cevaris.picket.wiki

import scala.io.Source
import scala.xml.pull._

import akka.actor._

import com.cevaris.picket._

case class WikiPageReader(path: String) extends DataSource {
  val reader = new XMLEventReader(Source.fromFile(path))

  def next: String = reader.next.toString
}

class WikiReader(s: DataSource, next: Option[ActorRef]) extends Actor {

  def receive = {

    case ReadFile =>
      next match {
        case Some(a) => a ! Transform(s.next)
        case None    => ???
      }
  }

}

// class WikiReader(next: ActorRef) extends Actor {

//   def receive = {

//     case ReadWikiXML(value: String) =>
//       val reader = new XMLEventReader(Source.fromFile(value))
//       next ! Print(reader.next.toString)
//   }

// }
