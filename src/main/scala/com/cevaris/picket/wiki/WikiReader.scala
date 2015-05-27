package com.cevaris.picket.wiki

import scala.io.Source
import scala.xml.pull._

import akka.actor._

class WikiReader(next: ActorRef) extends Actor {

  def receive = {

    case ReadWikiXML(value: String) =>
      val reader = new XMLEventReader(Source.fromFile(value))
      next ! Print(reader.next.toString)
  }

}
