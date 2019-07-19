package com.parisesoftware.stream.charsequence.string

import spock.lang.Specification
import spock.lang.Unroll

import java.util.function.Predicate

class StringPredicateTest extends Specification {

    @Unroll
    def "StringPredicate.isEmpty(#testValue): should yield #expectedOutput."(String testValue, boolean expectedOutput) {

        expect: 'StringPredicate.isEmpty() output to match #expectedOutput'
        ((Predicate) StringPredicate.isEmpty).test(testValue) == expectedOutput

        where:
        testValue    | expectedOutput
        ''           | true
        'null'       | true
        '{}'         | true
        '   {}   '   | true
        '   {}'      | true
        '   null'    | true
        '   '        | true
        'test'       | false
        'Click Here' | false
        'Some V a l' | false
    }

}
