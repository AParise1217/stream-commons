package com.parisesoftware.stream.collections.map

import spock.lang.Specification

import java.util.function.Predicate

class MapPredicateTest extends Specification {

    def "isValidMap(): should return false when the param Map is null"() {

        given: 'a test Map'
        Map testMap = null

        when: 'the Factory is queried for if the Map is Valid or Not'
        boolean resultant = ((Predicate) MapPredicate.isNotEmpty).test(testMap)

        then: 'the resultant boolean is false'
        !resultant
    }

    def "isValidMap(): should return false when the param Map is empty"() {

        given: 'a test Map'
        Map testMap = [:]

        when: 'the Factory is queried for if the Map is Valid or Not'
        boolean resultant = ((Predicate) MapPredicate.isNotEmpty).test(testMap)

        then: 'the resultant boolean is false'
        !resultant
    }

    def "isValidMap(): should return true when the param Map has one entry"() {

        given: 'a test Map'
        Map testMap = [first: '1']

        when: 'the Factory is queried for if the Map is Valid or Not'
        boolean resultant = ((Predicate) MapPredicate.isNotEmpty).test(testMap)

        then: 'the resultant boolean is true'
        resultant
    }

    def "isValidMap(): should return true when the param Map has many entries"() {

        given: 'a test Map'
        Map testMap = [first: '1', second: '2', third: '3']

        when: 'the Factory is queried for if the Map is Valid or Not'
        boolean resultant = ((Predicate) MapPredicate.isNotEmpty).test(testMap)

        then: 'the resultant boolean is true'
        resultant
    }


}
