package com.parisesoftware.stream.charsequence.string

import org.apache.commons.lang3.StringUtils

import java.util.function.Predicate

/**
 * String Predicates
 * <p>
 * Constant Predicates related to the {@link String} Collection
 *
 * @version 1.0
 * @since 1.0
 */
class StringPredicate {

    /**
     * Values that are Recognized as being "Empty"
     */
    private static final List<String> EMPTY_VALUES = ['', '{}', 'null']

    /**
     * is the Instance a String
     * @since 1.0
     */
    static Predicate<Object> isString = { instance ->
        return instance instanceof String
    }

    /**
     * is the String not Empty
     * @since 1.0
     */
    static Predicate<String> isNotEmpty = { string ->
        !((Predicate) isEmpty).test(string)
    }

    /**
     * is the String Empty
     * @since 1.0
     */
    static Predicate<String> isEmpty = { string ->
        StringUtils.isBlank(string) || EMPTY_VALUES.contains(StringUtils.trim(string))
    }

}
