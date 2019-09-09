package com.xiaobai.iterator.ex;

public class ConcreateAggregate extends Aggregate {
    Iterator iterator(){
        return new ConcreteIterator();
    }
}
