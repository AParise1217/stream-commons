package com.parisesoftware.stream.collections.list

import groovyjarjarantlr.collections.List

import java.util.function.Predicate

/**
 * List Predicates
 * <p>
 * Constant Predicates related to the {@link List} Collection
 *
 * @version 1.0
 * @since 1.0
 */
class ListPredicate {

    /**
     * is the Instance a List?
     */
    static Predicate<Object> isList = { instance ->
        return instance instanceof List
    }

    /**
     * is the List not Empty?
     */
    static Predicate<List> isNotEmpty = { list ->
        return !((Predicate) isEmpty).test(list)
    }

    /**
     * is the List Empty?
     */
    static Predicate<List> isEmpty = { list ->
        return (list == null || list.isEmpty())
    }

}
