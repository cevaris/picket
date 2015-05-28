package com.cevaris.picket

trait Message
case class ReadFile(path: String) extends Message
case class Transform(value: String) extends Message
