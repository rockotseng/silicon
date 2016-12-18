package com.rga.silicon.base

import java.time.YearMonth
import java.time.ZoneOffset

abstract class SequencenumberCreateBase extends AbstractBase {

    void isCurrentYearMonth(String yearMonth) {
       assert yearMonth == YearMonth.now(ZoneOffset.UTC).toString()
    }
 
}
