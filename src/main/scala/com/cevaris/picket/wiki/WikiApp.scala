package com.cevaris.picket.wiki

import akka.actor._

import com.cevaris.picket._

object WikiApp {

  val DATA_FILE = "/data/wiki/enwiki-20150205-pages-meta-current27.xml"


  def main(args: Array[String]) {
    println("picket - wiki")

    val system = ActorSystem("WikiApp")

    val printer = system.actorOf(
      Props(new WikiPrinter(new Printer(), None)),
      name="WikiPrinter"
    )

    val reader = system.actorOf(
      Props(new WikiReader(WikiPageReader(DATA_FILE), Some(printer))),
      name="WikiReader"
    )

    reader ! ReadFile
  }
}
