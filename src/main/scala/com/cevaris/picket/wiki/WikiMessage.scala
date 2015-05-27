package com.cevaris.picket.wiki


trait WikiMessage
case class ReadWikiXML(value: String) extends WikiMessage
case class Print(value: String) extends WikiMessage
