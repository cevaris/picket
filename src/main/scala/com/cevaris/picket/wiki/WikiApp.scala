package com.cevaris.picket.wiki

import akka.actor._

import com.cevaris.picket._

object WikiApp {
  def main(args: Array[String]) {
    println("picket - wiki")

    val system = ActorSystem("WikiApp")

    val printer = system.actorOf(
      Props[WikiPrinter],
      name="WikiPrinter"
    )

    val reader = system.actorOf(
      Props(new WikiReader(printer)),
      name="WikiReader"
    )

    val file = "/data/wiki/enwiki-20150205-pages-meta-current27.xml"
    reader ! ReadWikiXML(file)
  }
}
