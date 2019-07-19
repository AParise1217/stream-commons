package com.parisesoftware.stream.dom4j

import org.dom4j.Node

import java.util.function.Predicate

/**
 * <h1>Dom4J Predicates</h1>
 * <p>
 *      Constant Predicates related to the Dom4J Third Party Library
 * </p>
 *
 * @since 1.0
 * @version 1.0
 */
class Dom4JPredicate {

    /**
     * Stream Filter by the Dom4j Node data type
     */
    static Predicate<Object> isNode = { instance ->
        return instance instanceof Node
    }

}
