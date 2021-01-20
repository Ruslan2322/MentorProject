package main.java.com.ruslan2322.javacore.Templates.Practice.transition.visitor;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit (Fruit fruit);
}
