package com.cevaris.picket.wiki

import akka.actor._
import com.typesafe.scalalogging.LazyLogging

import com.cevaris.picket._


case class Printer() extends Transformation with LazyLogging {
  def process(s: String): String = {
    logger.debug(s"Printing: ${s}")
    s
  }
}

class WikiPrinter(t: Transformation, next: Option[ActorRef]) extends Actor {

  def receive = {
    case Transform(value: String) =>
      t.process(value)
  }

}
