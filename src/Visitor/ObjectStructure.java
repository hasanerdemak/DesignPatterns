package Visitor;

import Composite.Component;

import java.util.ArrayList;

//May be a Composite / (list of elements)
public class ObjectStructure {
    ArrayList<Element> elements = new ArrayList<Element>();

    public void Add(Element element) {
        elements.add(element);
    }

    public void Remove(Element element) {
        elements.remove(element);
    }
}
