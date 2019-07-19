package com.parisesoftware.stream.collections.map

import org.apache.commons.collections4.MapUtils

import java.util.function.Predicate

/**
 * Map Predicates
 * <p>
 * Constant Predicates related to the {@link Map} Collection
 *
 * @version 1.0
 * @since 1.0
 */
class MapPredicate {

    /**
     * is the Instance a Map?
     */
    static Predicate<Object> isMap = { instance ->
        return instance instanceof Map
    }

    /**
     * is the Map not Empty?
     */
    static Predicate<Map> isNotEmpty = { map ->
        MapUtils.isNotEmpty(map)
    }

    /**
     * is the Map Empty?
     */
    static Predicate<Map> isEmpty = { map ->
        MapUtils.isEmpty(map)
    }

}
