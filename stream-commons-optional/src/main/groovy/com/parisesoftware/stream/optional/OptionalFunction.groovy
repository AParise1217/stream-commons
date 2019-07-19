package com.parisesoftware.stream.optional

import java.util.function.Function

/**
 * <h1>Optional Functions</h1>
 * <p>
 *      Constant Functions related to using Optionals in Streams
 * </p>
 *
 * @since 1.0
 * @version 1.0
 */
class OptionalFunction {

    /**
     * Stream Function to retrieve the Object Wrapped in an Optional
     */
    static Function<Optional, Object> mapGet = { optional ->
        optional.get()
    }

}
