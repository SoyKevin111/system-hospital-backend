package com.example.project.common.pattern;

public class Mediator {
   public <R> R handle(Command<R> command){
      return command.execute();
   }
}
