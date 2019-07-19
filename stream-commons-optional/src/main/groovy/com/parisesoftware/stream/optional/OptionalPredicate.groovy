package com.parisesoftware.stream.optional

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
class OptionalPredicate {

    /**
     * Stream Filter by the if the Optional is Present data type
     */
    static Predicate<Optional> isPresent = { optional ->
        optional.isPresent()
    }

}
