package org.master.java.generics;

import java.util.Date;

public class BoundedExtends<E extends Date>{
    public void handle(E element){
        //Some  code here
    }
}
