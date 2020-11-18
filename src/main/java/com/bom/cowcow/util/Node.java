package com.bom.cowcow.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node {
    private Node prevNode;
    private Node nextNode;
    private int value;
}
