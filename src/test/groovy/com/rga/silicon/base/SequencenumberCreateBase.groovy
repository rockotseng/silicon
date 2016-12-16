package com.rga.silicon.base

import java.time.YearMonth
import java.time.ZoneOffset

import com.rocko.test.MongoData

@MongoData("/mongo-data/sequence-number.json")
abstract class SequencenumberCreateBase extends AbstractBase {

    void isCurrentYearMonth(String yearMonth) {
       assert yearMonth == YearMonth.now(ZoneOffset.UTC).toString()
    }
 
}
