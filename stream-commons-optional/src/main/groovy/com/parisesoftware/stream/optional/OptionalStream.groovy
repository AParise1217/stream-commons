package com.parisesoftware.stream.optional

import java.util.function.Function
import java.util.function.Predicate

/**
 * <h1>Optional Functions</h1>
 * <p>
 *      Constant Functions related to using Optionals in Streams
 * </p>
 *
 * @since 1.0
 * @version 1.0
 */
class OptionalStream {

    /**
     * Stream Function to retrieve the Object Wrapped in an Optional
     */
    static Function<Optional, Object> getIfPresent = { optional ->

        Predicate isPresent = OptionalPredicate.isPresent
        Function getWrappedObject = OptionalFunction.mapGet

        if (isPresent.test(optional)) {
            return getWrappedObject.apply(optional)
        }
    }

}
