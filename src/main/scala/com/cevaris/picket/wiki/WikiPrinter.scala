package com.cevaris.picket.wiki

import akka.actor._

import com.cevaris.picket.Transformation


class WikiPrinter extends Actor with Transformation {

  def receive = {
    case Print(value: String) =>
      println(s"Printing: $value")
  }

}
